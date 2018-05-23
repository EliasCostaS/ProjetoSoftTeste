package com.eliascosta.aula.app;

import com.eliascosta.aula.dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Morris");
		pessoa.setCpf("192.159.165-36");
		pessoa.setTelefone("(35)3291-1232");
		pessoa.setCelular("(35)9977-1200");
		pessoa.setIdade(32);
		pessoa.setRg("228.123-72");
		pessoa.setEstadocivil("Casado");
		pessoa.setTelefone("(35)3291-1232");
		pessoa.setAltura(1.70f);
		
		System.out.println(pessoa.falar());
	}

}
