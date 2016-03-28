package co.edu.uniandes.reservacitasweb.services;

import co.edu.uniandes.reservacitaslogic.dtos.ReasonScheduleDTO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import co.edu.uniandes.reservascitaslogic.interfaces.IReasonScheduleLogic;
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
@Path("/reason_schedule")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class ReasonScheduleService {

    @Inject 
    private IReasonScheduleLogic reasonScheduleLogic;
    
    @Context 
    private HttpServletResponse response;

    /**
     * Metodo POST del servicio, para crear datos
     * @param dto
     * @return 
     */
    @POST
    public ReasonScheduleDTO createReasonSchedule(ReasonScheduleDTO dto) {
        return reasonScheduleLogic.addReasonSchedule(dto);
    }

    /**
     * Metodo GET, para obtener el listado de ordenes
     * @return 
     */
    @GET
    public List<ReasonScheduleDTO> getReasonSchedules() {
        return reasonScheduleLogic.getReasonSchedules();
    }

    /**
     * Metodo GET, para obtener un dato especifico al enviar un parametro por URL
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public ReasonScheduleDTO getReasonSchedule(@PathParam("id") Long id) {
        return reasonScheduleLogic.getReasonScheduleById(id);
    }

    /**
     * Metodo PUT, encargado de actualizar informacion de la orden
     * @param id
     * @param dto
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public ReasonScheduleDTO updateReasonSchedule(@PathParam("id") Long id, ReasonScheduleDTO dto) {
        dto.setId(id);
        return reasonScheduleLogic.updateReasonSchedule(dto);
    }

    /**
     * Metodo DELETE, encargado de eliminar una orden
     * @param id 
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteReasonSchedule(@PathParam("id") Long id) {
        reasonScheduleLogic.deleteReasonSchedule(id);
    }
}
