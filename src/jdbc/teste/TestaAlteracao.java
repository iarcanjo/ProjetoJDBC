package jdbc.teste;

import java.util.Calendar;

import jdbc.dao.ContatoDao;
import jdbc.modelo.Contato;

public class TestaAlteracao {

	public static void main(String[] args) {

		// pronto para alterar
		Contato contato = new Contato();
		contato.setId(new Long("3"));
		contato.setNome("Pedro");
		contato.setEmail("pedro@email.com");
		contato.setEndereco("Rua Hum");
		contato.setDataNascimento(Calendar.getInstance());

		// altera nessa conexão
		ContatoDao dao = new ContatoDao();

		// metodo elegante
		dao.altera(contato);

		System.out.println("Alterado!");
	}

}
