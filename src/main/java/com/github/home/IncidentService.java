package com.github.home;

public interface IncidentService {

	/**
	 * Operation to report an incident
	 */
	OutputReportIncident reportIncident(InputReportIncident input);

	/**
	 * Operation to get the status of an incident
	 */
	OutputStatusIncident statusIncident(InputStatusIncident input);
}