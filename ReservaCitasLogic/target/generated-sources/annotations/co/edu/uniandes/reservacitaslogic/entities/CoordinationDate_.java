package co.edu.uniandes.reservacitaslogic.entities;

import co.edu.uniandes.reservacitaslogic.entities.ContactImportant;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-13T20:39:06")
@StaticMetamodel(CoordinationDate.class)
public class CoordinationDate_ { 

    public static volatile SingularAttribute<CoordinationDate, Timestamp> horaFin;
    public static volatile SingularAttribute<CoordinationDate, Timestamp> fecha;
    public static volatile SingularAttribute<CoordinationDate, String> estado;
    public static volatile SingularAttribute<CoordinationDate, ContactImportant> motivo;
    public static volatile SingularAttribute<CoordinationDate, String> programa;
    public static volatile SingularAttribute<CoordinationDate, Long> id;
    public static volatile SingularAttribute<CoordinationDate, String> comentarios;
    public static volatile SingularAttribute<CoordinationDate, Timestamp> horaInicio;

}