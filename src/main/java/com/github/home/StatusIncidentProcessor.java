package com.github.home;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Processor for processing the status.
 */
public class StatusIncidentProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        // set reply
        OutputStatusIncident output = new OutputStatusIncident();
        output.setStatus("IN PROGRESS");
        exchange.getOut().setBody(output);
    }

}