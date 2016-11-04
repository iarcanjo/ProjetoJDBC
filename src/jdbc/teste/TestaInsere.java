package jdbc.teste;

import java.sql.SQLException;
import java.util.Calendar;

import jdbc.dao.ContatoDao;
import jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) throws SQLException {

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("João");
		contato.setEmail("joao@email.com");
		contato.setEndereco("Rua Zero");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexão
		ContatoDao dao = new ContatoDao();

		// metodo elegante
		dao.adiciona(contato);

		System.out.println("Gravado!");
	}
}
