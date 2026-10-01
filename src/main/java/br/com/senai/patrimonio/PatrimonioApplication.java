package br.com.senai.patrimonio;

import br.com.senai.patrimonio.avaliacao.Participante;

import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.model.*;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.EstadoConservacao;
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

        Bem bem = new Bem();
        System.out.println(bem.getEmpresaVinculada());

        Empresa empresa1 = new Empresa();
        bem.setEmpresa(empresa1);
        System.out.println(bem.getEmpresaVinculada());

        empresa1.setNome("Senai");
        System.out.println(bem.getEmpresaVinculada());

        System.out.println(empresa1.getEndereco());

        Bloco bloco = new Bloco();
        System.out.println("Teste do Bloco: " + bloco.getEmpresaVinculada());

        bloco.setEmpresa(empresa1);
        System.out.println("Teste do Bloco: " + bloco.getEmpresaVinculada());

        System.out.println("Teste de funcionário");
        Funcionario funcionario1 = new Funcionario();
        System.out.println(funcionario1.getEmpresaVinculada());

        funcionario1.setEmpresa(empresa1);
        System.out.println(funcionario1.getEmpresaVinculada());

        System.out.println("Teste de Sala");
        Sala sala1 = new Sala();
        System.out.println(sala1.getEmpresaVinculada());

        sala1.setEmpresa(empresa1);
        System.out.println(sala1.getEmpresaVinculada());

        Pessoa pessoa = new Pessoa();


        pessoa.setNome("Joãozinho");
        pessoa.setCPF("4567878");
        System.out.println(pessoa.getIdentificacao());

        funcionario1.setNome("Mariazinha");
        funcionario1.setCPF("12345678");
        funcionario1.setCargo(Cargo.DIRETOR);
        System.out.println(funcionario1.getIdentificacao());



    }

}

