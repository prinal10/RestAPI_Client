package com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//@Path("{pathParam}/test")
@Path("test/{pathParam}")
public class MyResource {

	@PathParam("pathParam")
	private int pathParamExample;

	@QueryParam("query")
	private String queryParamExample;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		return "It works! And the Path Param: " + pathParamExample + " And the Query Param: " + queryParamExample;
	}

}
