package co.edu.uniandes.reservacitaslogic.entities;

import co.edu.uniandes.reservacitaslogic.entities.Contact;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-14T17:49:29")
@StaticMetamodel(ContactImportant.class)
public class ContactImportant_ { 

    public static volatile SingularAttribute<ContactImportant, Long> id;
    public static volatile SingularAttribute<ContactImportant, Contact> contacto;
    public static volatile SingularAttribute<ContactImportant, String> empresa;
    public static volatile SingularAttribute<ContactImportant, String> cargo;
    public static volatile SingularAttribute<ContactImportant, String> celular;

}