package com.github.home;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.api.management.ManagedAttribute;
import org.apache.camel.api.management.ManagedOperation;
import org.apache.camel.api.management.ManagedResource;

/**
 * Processor for processing the report incident.
 */
@ManagedResource(description = "Our custom managed endpoint")
public class ImagesProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Status status = new Status();
		status.setStatus("OK;");
		exchange.getOut().setBody(status);
	}

	@ManagedAttribute(description = "Endpoint URI")
	public int aaa() {
		return 452;
	}

	@ManagedOperation(description = "sssss")
	public int bbb() {
		return 452;
	}

}