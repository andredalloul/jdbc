package br.com.dalloul.jdbc.teste;

import java.util.Calendar;

import br.com.dalloul.jdbc.dao.ContatoDao;
import br.com.dalloul.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("André Dalloul");
		contato.setEmail("andre@dalloul.com.br");
		contato.setEndereco("Rua Vergueiro 3185 cj 57");
		contato.setDataNascimento(Calendar.getInstance());

		ContatoDao dao = new ContatoDao();

		dao.adiciona(contato);

		System.out.println("Gravado");

	}

}
