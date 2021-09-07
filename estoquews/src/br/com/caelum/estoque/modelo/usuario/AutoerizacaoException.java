package br.com.caelum.estoque.modelo.usuario;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault")
public class AutoerizacaoException extends Exception {

	public AutoerizacaoException(String mensagem) {
		super(mensagem);
	}
	
	public InfoFault getFaultInfo() {
	    return new InfoFault("Token invalido" , new Date());
	}

}
