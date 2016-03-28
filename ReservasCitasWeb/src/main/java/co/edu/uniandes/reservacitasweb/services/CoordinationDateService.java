/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitasweb.services;

import co.edu.uniandes.reservacitaslogic.dtos.CoordinationDateDTO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import co.edu.uniandes.reservascitaslogic.interfaces.ICoordinationDateLogic;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

/**
 *
 * @author Cindy
 */
@Path("/coordinationDate")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class CoordinationDateService {

    @Inject 
    private ICoordinationDateLogic coordinationDateLogic;
    
    @Context 
    private HttpServletResponse response;

    /**
     * Metodo POST del servicio, para crear datos
     * @param dto
     * @return 
     */
    @POST
    public CoordinationDateDTO createCoordinationDate(CoordinationDateDTO dto) {
        return coordinationDateLogic.addCoordinationDate(dto);
    }

    /**
     * Metodo GET, para obtener el listado de ordenes
     * @return 
     */
    @GET
    public List<CoordinationDateDTO> getCoordinationDates() {
        return coordinationDateLogic.getCoordinationDates();
    }

    /**
     * Metodo GET, para obtener un dato especifico al enviar un parametro por URL
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public CoordinationDateDTO getCoordinationDate(@PathParam("id") Long id) {
        return coordinationDateLogic.getCoordinationDateById(id);
    }

    /**
     * Metodo PUT, encargado de actualizar informacion de la orden
     * @param id
     * @param dto
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public CoordinationDateDTO updateCoordinationDate(@PathParam("id") Long id, CoordinationDateDTO dto) {
        dto.setId(id);
        return coordinationDateLogic.updateCoordinationDate(dto);
    }

    /**
     * Metodo DELETE, encargado de eliminar una orden
     * @param id 
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteCoordinationDate(@PathParam("id") Long id) {
        coordinationDateLogic.deleteCoordinationDate(id);
    }
}
