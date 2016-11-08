package com.github.home;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Processor for processing the report incident.
 */
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

}
