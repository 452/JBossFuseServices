package com.github.home;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "XML_ROOT_ELEMENT_NAMESPACE")
@XmlAccessorType(XmlAccessType.FIELD)
public class StatusResponse {

	private String status;

	public String getStatus() {
		return status;
	}

	public StatusResponse setStatus(String status) {
		this.status = status;
		return this;
	}

}