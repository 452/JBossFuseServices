package com.github.home;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "XML_ROOT_ELEMENT_NAMESPACE2")
@XmlAccessorType(XmlAccessType.FIELD)
public class StatusRequestDTO {

	private String type;

	public String getType() {
		return type;
	}

	public StatusRequestDTO setType(String type) {
		this.type = type;
		return this;
	}

}