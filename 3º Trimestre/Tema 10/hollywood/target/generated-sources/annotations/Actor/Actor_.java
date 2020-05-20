package Actor;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-18T16:27:40")
@StaticMetamodel(Actor.class)
public class Actor_ { 

    public static volatile SingularAttribute<Actor, String> apellidos;
    public static volatile SingularAttribute<Actor, Double> salario;
    public static volatile SingularAttribute<Actor, Date> fecha_nacimiento;
    public static volatile SingularAttribute<Actor, Integer> id;
    public static volatile SingularAttribute<Actor, String> sexo;
    public static volatile SingularAttribute<Actor, String> nombre;

}