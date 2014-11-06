package com.redhat.gss.ws.rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/model")
public class ModelResource {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/do")
	public List<Model> post(List<Model> models) {
		System.out.println("Receiving and returning " + models.size() + " objects");
		return models;
	}
}
