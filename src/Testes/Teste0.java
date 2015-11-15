package Testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Model.Agenda;
import Model.Aluno;
import Model.Escalonador;

public class Teste0
{
	@Test
	public void test()
	{
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, true, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, true, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, true, false, false, false, false, false, false})));
		
		Agenda a = escalonador.escalonar(alunos, (byte)1);
		
		for (int i = 0; i < a.getAgenda().length; i++)
		{
			System.out.println(a.getAgenda()[i]);
		}
		System.out.println(a.getPontuacao());
		
		assertEquals(new boolean[]{false, false, true, false, false, false, false, false, false, false}, a.getAgenda());
	}

}
