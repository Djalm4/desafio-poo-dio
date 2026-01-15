import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

//        System.out.println(curso);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now()); //Atribui a data de criação

        //System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("descrição Bootcamp java developer");
        bootcamp.getConteudos().add(curso); //Add os cursos
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDjalma = new Dev();
        devDjalma.setNome("Djalma");
        devDjalma.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Djalma: " + devDjalma.getConteudoInscritos());
        devDjalma.progredir();
        devDjalma.progredir();
        devDjalma.progredir();
        System.out.println("Conteudos Concluidos Djalma: " + devDjalma.getConteudosConcluidos());
        System.out.println("XP: " + devDjalma.calcularXp());


        System.out.println("----------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println("Conteudos Concluidos Joao: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());
    }
}
