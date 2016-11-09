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
public class ReportIncidentProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// get the id of the input
		String id = exchange.getIn().getBody(InputReportIncident.class).getIncidentId();

		// set reply including the id
		OutputReportIncident output = new OutputReportIncident();
		output.setCode("OK;" + id);
		exchange.getOut().setBody(output);
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