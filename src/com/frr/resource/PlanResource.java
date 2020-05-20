package com.frr.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
 
@Path("/plan") //root resource class
public class PlanResource {

	@GET // (read only)
	@Produces("text/plain") // (which formate we want to response)
	public String planDetail(@QueryParam("planNo") int planNo) {
		return "Plan : Sub ka saath sub ka bikash : - " + planNo +"\n Hash code :"+this.hashCode();
	}

}

