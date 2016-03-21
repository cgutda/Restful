package com.bharaththippireddy.trainings.jaxrs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

//To support multiple data types XML as well as json we add @Produces annotation
@Produces({"application/xml","application/json"})
public interface PatientService {
	
	@GET // Now we will start mapping the Restful resource method with the appropiate hhtp methods and URIs
	@Path("/patients/{id}/") //ctrl+1 we do the import
	public abstract Patient getPatient(@PathParam("id") String id);
    
	@PUT
    @Path("/patients/") 
	public abstract Response updatePatient(Patient patient);//update
    
	@POST
	@Path("/patients/")
	public abstract Response addPatient(Patient patient); //add
    
	@DELETE
	@Path("/patients/{id}/")
	public abstract Response deletePatients(@PathParam("id") String id);
	
	@Path("/prescriptions/{id}/")
	public abstract Prescription getPrescription(@PathParam("id") String prescriptionId);

}