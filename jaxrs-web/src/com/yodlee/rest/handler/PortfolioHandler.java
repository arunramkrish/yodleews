package com.yodlee.rest.handler;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.yodlee.rest.entity.Equity;

@Path("/portfolio")
public class PortfolioHandler {
	
	@Path("/{user-id}")
	@Produces("application/json")
	@GET
	public Response getPortfolioValue(@PathParam("user-id") String userId) {
		return Response.status(200).entity(new Equity("INFY", 10000L, 
				1250.56, 2000.0)).build();
	}

}
