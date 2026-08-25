package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import br.com.senai.patrimonio.model.Funcionario;
import br.com.senai.patrimonio.model.Sala;
import br.com.senai.patrimonio.model.enums.Cargo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {


	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Senai LTDA");
		System.out.println(empresa.getRazaoSocial());

		Endereco endereco = new Endereco();
		endereco.setRua("Rua Belo Horizonte");
		System.out.println(endereco.getRua());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		Endereco enderecoComArgumentos = new Endereco("Libano Jose Gomes", "489",
				"Perto do posto de saúde", "Brasilia", "Criciúma", "SC");

		System.out.println(enderecoComArgumentos.getBairro());

		Sala sala = new Sala ();

		Funcionario funcionario = new Funcionario(
				 35L, "Mariazinha" , "13456789",
				Cargo.GERENTE, empresa, sala

		);

	}
}
