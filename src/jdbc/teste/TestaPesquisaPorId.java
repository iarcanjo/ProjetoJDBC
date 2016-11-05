package jdbc.teste;

import java.text.SimpleDateFormat;

import jdbc.dao.ContatoDao;
import jdbc.modelo.Contato;

public class TestaPesquisaPorId {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato contato = dao.pesquisaPor(3);
		if (contato != null) {
			System.out.println("ID: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			System.out.println("Data de Nascimento: "
					+ new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento().getTime()));
		} else {
			System.out.println("Pesquisa não encontrou o Contato!");
		}
	}
}
