/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitasweb.services;

import co.edu.uniandes.reservacitaslogic.dtos.ReasonDTO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import co.edu.uniandes.reservascitaslogic.interfaces.IReasonLogic;
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
@Path("/reason")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class ReasonService {

    @Inject 
    private IReasonLogic reasonLogic;
    
    @Context 
    private HttpServletResponse response;

    /**
     * Metodo POST del servicio, para crear datos
     * @param dto
     * @return 
     */
    @POST
    public ReasonDTO createReason(ReasonDTO dto) {
        return reasonLogic.addReason(dto);
    }

    /**
     * Metodo GET, para obtener el listado de ordenes
     * @return 
     */
    @GET
    public List<ReasonDTO> getReasons() {
        return reasonLogic.getReasons();
    }

    /**
     * Metodo GET, para obtener un dato especifico al enviar un parametro por URL
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public ReasonDTO getReason(@PathParam("id") Long id) {
        return reasonLogic.getReasonById(id);
    }

    /**
     * Metodo PUT, encargado de actualizar informacion de la orden
     * @param id
     * @param dto
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public ReasonDTO updateReason(@PathParam("id") Long id, ReasonDTO dto) {
        dto.setId(id);
        return reasonLogic.updateReason(dto);
    }

    /**
     * Metodo DELETE, encargado de eliminar una orden
     * @param id 
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteReason(@PathParam("id") Long id) {
        reasonLogic.deleteReason(id);
    }
}