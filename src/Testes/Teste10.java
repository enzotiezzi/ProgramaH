package Testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Model.Agenda;
import Model.Aluno;
import Model.Escalonador;

public class Teste10
{

	@Test
	public void test()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, false,true, true,true, true,true, true})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, false,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, false,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, false,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, false,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true, true, false, false, true})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));//20
		
		Agenda a = escalonador.escalonar(alunos, (byte)1);
		
		for (int i = 0; i < a.getAgenda().length; i++)
		{
			System.out.println(a.getAgenda()[i]);
		}
		System.out.println(a.getPontuacao());
		
		long finish = System.currentTimeMillis();  
		long total = finish - start;
		System.out.println("Tempo total de execução: " + total + " milisegundos");
	}

}
