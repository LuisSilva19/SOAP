package br.com.caelum.estoque.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TesteServicoWeb {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://localhost:8080/estoquews?wsdl");
		QName qname = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWSService");
		
		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSImplePort();
		Filtros filtros = new Filtros();
		Filtro filtro = new Filtro();
		filtro.setNome("Iphone");
		filtro.setTipo("Livro");
		filtros.getFiltro().add(filtro);
		ListaItens itens = cliente.todosOsItens(filtros);

		System.out.println("Resposta do serviço: " + itens);

        Service service = Service.create(url, qname);

        ListaItens lista = cliente.todosOsItens(filtros);

        for (Item item : lista.item) {
            System.out.println(item.getNome());
        }
    
	}

}
