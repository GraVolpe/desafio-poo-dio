package br.com.dio.dominio.Curso;

import br.com.dio.desafio.dominio.Dev;
import br.com.dio.dominio.Bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
  Curso curso1 = new Curso();
                curso1.setTitulo("Curso Java");
                curso1.setDescricao("descrição curso java");
                curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp()();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devCamila.getConteudosConcluidos());
    System.out.println("Xp:" + devCamila.calculatTotalXp());


System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Xp:" + devCamila.calculatTotalXp());
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("Xp:" + devJoao.calculatTotalXp());
    }
}


