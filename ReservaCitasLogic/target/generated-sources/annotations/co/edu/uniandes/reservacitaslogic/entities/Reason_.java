package co.edu.uniandes.reservacitaslogic.entities;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-13T20:39:06")
@StaticMetamodel(Reason.class)
public class Reason_ { 

    public static volatile SingularAttribute<Reason, Timestamp> fechaHoraInicio;
    public static volatile SingularAttribute<Reason, Long> id;
    public static volatile SingularAttribute<Reason, String> nombre;
    public static volatile SingularAttribute<Reason, Timestamp> fechaHoraFin;

}