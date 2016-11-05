package jdbc.teste;

import jdbc.dao.ContatoDao;
import jdbc.modelo.Contato;

public class TestaRemocao {

	public static void main(String[] args) {
		// pronto para alterar
		Contato contato = new Contato();
		contato.setId(new Long("3"));

		// remove nessa conexão
		ContatoDao dao = new ContatoDao();

		// metodo elegante
		dao.remove(contato);

		System.out.println("Removido!");
	}

}
