package com.redhat.gss.ws.rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/model")
public class ModelResource {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void post(List<Model> models) {
		System.out.println("Receiving " + models.size() + " objects");
	}
}
