/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitasweb.services;

import co.edu.uniandes.reservacitaslogic.dtos.ContactDTO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import co.edu.uniandes.reservascitaslogic.interfaces.IContactLogic;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

/**
 *
 * @author Cindy
 */
@Path("/contact")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContactService {

    @Inject 
    private IContactLogic contactLogic;
    
    @Context 
    private HttpServletResponse response;

    /**
     * Metodo POST del servicio, para crear datos
     * @param dto
     * @return 
     */
    @POST
    public ContactDTO createContact(ContactDTO dto) {
        return contactLogic.addContact(dto);
    }

    /**
     * Metodo GET, para obtener el listado de ordenes
     * @return 
     */
    @GET
    public List<ContactDTO> getContacts() {
        return contactLogic.getContacts();
    }

    /**
     * Metodo GET, para obtener un dato especifico al enviar un parametro por URL
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public ContactDTO getContact(@PathParam("id") Long id) {
        return contactLogic.getContactById(id);
    }

    /**
     * Metodo PUT, encargado de actualizar informacion de la orden
     * @param id
     * @param dto
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public ContactDTO updateContact(@PathParam("id") Long id, ContactDTO dto) {
        dto.setId(id);
        return contactLogic.updateContact(dto);
    }

    /**
     * Metodo DELETE, encargado de eliminar una orden
     * @param id 
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteContact(@PathParam("id") Long id) {
        contactLogic.deleteContact(id);
    }
}
