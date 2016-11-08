package com.github.home;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Processor for processing the report incident.
 */
public class ImagesProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Status status = new Status();
		status.setStatus("OK;");
		exchange.getOut().setBody(status);
	}

}