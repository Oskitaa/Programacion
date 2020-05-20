/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Actor.Actor;
import java.sql.Date;
import java.util.ArrayList;
import Utils.Utils;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author ese_b
 */
public class ActorService {

    Connection conexion;
    Statement st;
    ResultSet rs;
    EntityManagerFactory emf;
    EntityManager em;
    Query query;

    public ActorService() throws SQLException {
        conexion = ConexionBBDD.conexion();
        st = conexion.createStatement();
        //El EntityManagerFactory es la conexion a la db, que hemos hecho en el documento META-INF, persitance.xml. 
        emf = Persistence.createEntityManagerFactory("DBconnect");
        em = emf.createEntityManager();
    }

    public void getAllActores() throws SQLException {

//        rs = st.executeQuery("select id, nombre, apellidos from actor");
//        while (rs.next()) {
//            System.out.println(rs.getString(1) + " " + rs.getString(2));
//        }
        //Otra forma con JPA e Hibernate, tuve problemas ya que al hacer el array de Actor, no se guardaba en un objeto de tipo actor, si no en un Object, no 
        //podia castearlo, entonces encontre esta forma no tan rapida.
        List<Object[]> ao = em.createQuery("select id, nombre, apellidos from Actor").getResultList();
        List<Actor> list = new ArrayList<>();

        for (Object[] obj : ao) {
            Actor a = new Actor();
            a.setId((Integer) obj[0]);
            a.setNombre((String) obj[1]);
            a.setApellidos((String) obj[2]);

            list.add(a);
        }

        for (Actor b : list) {
            System.out.println(b.getId() + " " + b.getNombre() + " " + b.getApellidos());
        }

    }

    public void getActrices() throws SQLException {

        rs = st.executeQuery("select nombre , apellidos from actor where sexo = 2");

        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2));
        }

    }

    public void getActorJoven() throws SQLException {

        rs = st.executeQuery("SELECT nombre,apellidos, fecha_nacimiento from actor where fecha_nacimiento = (SELECT MAX(fecha_nacimiento)from actor)");

        while (rs.next()) {
            System.out.print(rs.getString(1) + " " + rs.getString(2) + " " + rs.getDate(3));
        }

    }

    public void getActoresPagados() throws SQLException {

        rs = st.executeQuery("SELECT nombre,apellidos, salario from actor where sexo = 1 UNION ALL SELECT nombre,apellidos, salario from actor where sexo = 2 ORDER BY salario DESC LIMIT 2");

        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + ": " + rs.getDouble(3) + "€.");
        }

    }

    public void eliminarActor() throws SQLException {
        Actor a;
        int borrar;

        getAllActores();
        em.getTransaction().begin();

        do {
            System.out.println("Introduce un id:");
            borrar = Utils.getInt();
        } while (!comprobarID(borrar));

        //Aqui le decimos que busque el Actor con ese id
        a = em.find(Actor.class, borrar);
        //Para borrarlo asi de facil
        em.remove(a);
        //Guardamos directamente en la db
        em.getTransaction().commit();
    }

    public void crearActor() {

        em.getTransaction().begin();
        //Con JPA es mas facil insertar cosas en la db, ya que con el persist subes una nueva entidad, por lo que puedes coger un objeto entero y insertarlo asi de facil
        em.persist(newActor());

        em.getTransaction().commit();

    }

    public List<Actor> obtenerActores() throws SQLException {
        //Aqui pasa lo mismo, devuelve un list con todos los datos del Actor, pero es de tipo Object.
        return em.createNativeQuery("Select * from actor").getResultList();
    }

    private boolean comprobarID(int id) throws SQLException {
        ArrayList<Integer> ids = new ArrayList<>();
        
        rs = st.executeQuery("select id from actor");
        
        //introducimos todas las ids en un array para luego comprobar si la id esta en la db.
        while (rs.next()) {
            ids.add(rs.getInt(1));
        }

        return ids.contains(id);
    }

    private Actor newActor() throws IllegalArgumentException {

        String nombre = null, apellidos = null, sexo = null;
        Date fecha_nacimiento = null;
        double salario = 0;
        try {
            nombre = Utils.getString("Introduce tu nomobre;");
            apellidos = Utils.getString("Introduce tu apellidos");
            sexo = Utils.getString("Introduce tu sexo, masculino o femenino");
            fecha_nacimiento = Date.valueOf(Utils.getString("Introduce tu fecha de nacimiento. Formato AAAA-MM-DD"));
            System.out.println("Introduce tu salario");
            salario = Utils.getDouble();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return new Actor(nombre, apellidos, sexo, fecha_nacimiento, salario);
    }

}
