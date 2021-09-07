package br.com.caelum.estoque.modelo.usuario;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {

	private String msg;
	private Date data;

	
	public InfoFault() {
		super();
	}

	public InfoFault(String msg, Date data) {
		this.msg = msg;
		this.data = data;
	}

}
