package Testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Model.Agenda;
import Model.Aluno;
import Model.Escalonador;

public class Teste16
{

	@Test
	public void test()
	{
long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, false, false, false, false, false, false, false})));//1
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, true, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, false, false, false, false, false, false, false})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, true, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true, false, false, false, false, false, false})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, true, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, true, false, false, false})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));//20
		
		Agenda a = escalonador.escalonar(alunos, (byte)4);
		
		for (int i = 0; i < a.getAgenda().length; i++)
		{
			System.out.println(a.getAgenda()[i]);
		}
		System.out.println(a.getPontuacao());
		
		long finish = System.currentTimeMillis();  
		long total = finish - start;
		System.out.println("Tempo total de execuзгo: " + total + " milisegundos");
	}

}
