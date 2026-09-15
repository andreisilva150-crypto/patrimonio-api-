package br.com.senai.patrimonio;

import br.com.senai.patrimonio.avaliacao.Participante;

import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {


    public static void main(String[] args) {

        SpringApplication.run(PatrimonioApplication.class, args);

        Participante participante = new Participante(
				"Andrei",
				"email",
				"telefone",
				"matricula",
				Nivel.INTERMEDIARIO);

        System.out.println("Nome:" + participante.getNome());
        System.out.println("e-mail:" + participante.getEmail());
    }

}

