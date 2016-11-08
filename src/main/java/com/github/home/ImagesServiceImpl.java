package com.github.home;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.ext.xml.ElementClass;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.Descriptions;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

@Path("/status")
public class ImagesServiceImpl {

	public ImagesServiceImpl() {
	}

	@GET
	@Path("/getStatus")
	// @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	@Descriptions({ @Description(value = "Adds a new booddk1", target = DocTarget.METHOD),
			@Description(value = "Requested Book", target = DocTarget.RETURN),
			@Description(value = "Request", target = DocTarget.REQUEST),
			@Description(value = "Response", target = DocTarget.RESPONSE),
			@Description(value = "Resource", target = DocTarget.RESOURCE) })
	@ElementClass(request = StatusRequestDTO.class, response = StatusResponse.class)
	public StatusRequestDTO getStatus() {
		return new StatusRequestDTO().setType("ddd");
	}
	
	@POST
	@Path("/changeStatus")
	// @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	@Descriptions({ @Description(value = "Adds a new booddk1", target = DocTarget.METHOD),
			@Description(value = "Requested Book", target = DocTarget.RETURN),
			@Description(value = "Request", target = DocTarget.REQUEST),
			@Description(value = "Response", target = DocTarget.RESPONSE),
			@Description(value = "Resource", target = DocTarget.RESOURCE) })
	@ElementClass(request = StatusRequestDTO.class, response = StatusResponse.class)
	public StatusResponse changeStatus() {
		return new StatusResponse().setStatus("ddd");
	}
}