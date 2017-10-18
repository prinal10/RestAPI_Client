package com.demo.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("writerimpl/")
public class Resource2 {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Date testMethod() {
		return Calendar.getInstance().getTime();
	}

}
