package com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("asl/{userName}")
public class ASLResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getASL(@PathParam("userName") ASL asl) {
		return "The Age, Sex And Location is : " + asl.toString();
	}

}
