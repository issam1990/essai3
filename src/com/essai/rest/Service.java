package com.essai.rest;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class Service {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		return "rest !!!!";
	}
}
