package br.com.senai.patrimonio;

import br.com.senai.patrimonio.avaliacao.Participante;

import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.model.Bloco;
import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Patrimonio;
import br.com.senai.patrimonio.model.Sala;
import br.com.senai.patrimonio.model.enums.EstadoConservacao;
import jdk.swing.interop.SwingInterOpUtils;
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

        Empresa empresaInterface = new Empresa();

        Bloco blocoInterface = new Bloco(1L, "Bloco 2", empresaInterface);

        Sala salaInterface = new Sala(2L, "Sala 28 ", "45678", blocoInterface, empresaInterface);

        System.out.println(salaInterface.getDescricaoLocalizavel());

        Patrimonio patrimonio = new Patrimonio();
        System.out.println(patrimonio.validarEstadoConservacao());

        patrimonio.setEstado(EstadoConservacao.INSERVIVEL);
        System.out.println(patrimonio.validarEstadoConservacao());

    }

}

