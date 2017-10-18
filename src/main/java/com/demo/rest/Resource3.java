package com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("testing/")
public class Resource3 {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public ASL testMethod() {
		return new ASL();
	}

}