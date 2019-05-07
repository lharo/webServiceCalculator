package lharo.wscalculator.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/test")
public class TestService {

	@GET
	@Path("/sum/{value1}/{value2}")
	public String sum(@PathParam(value="value1") Double value1, @PathParam(value="value2") Double value2 ){
		return "Sum is: "+ (value1 + value2);
	}
	
	@GET
	@Path("/sub/{value1}/{value2}")
	public String sub(@PathParam(value="value1") Double value1, @PathParam(value="value2") Double value2 ){
		return "Sub is: "+ (value1 - value2);
	}
	
	@GET
	@Path("/mul/{value1}/{value2}")
	public String mul(@PathParam(value="value1") Double value1, @PathParam(value="value2") Double value2 ){
		return "Mul is: "+ (value1 * value2);
	}
	
	@GET
	@Path("/div/{value1}/{value2}")
	public String div(@PathParam(value="value1") Double value1, @PathParam(value="value2") Double value2 ){
		return "Div is: "+ (value1 / value2);
	}
}
