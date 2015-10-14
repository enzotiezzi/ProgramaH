package Main;

import java.util.ArrayList;
import java.util.List;

import Model.Agenda;
import Model.Aluno;
import Model.Escalonador;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int opt = 0;
		
		System.out.println("Informe o teste a ser realizado ou digite 0 para sair");
		Scanner ler = new Scanner(System.in);
		
		do{
			opt = ler.nextInt();
			switch (opt) {
			case 0:	
				System.out.println("Finalizando a interface de teste");
				break;
			case 1:	
				test1();
				break;
			case 2:	
				test2();
				break;
			case 3:	
				test3();
				break;
			case 4:	
				test4();
				break;
			case 5:	
				test5();
				break;
			case 6:	
				test6();
				break;
			case 7:	
				test7();
				break;
			case 8:	
				test8();
				break;
			case 9:	
				test9();
				break;
			case 10:	
				test10();
				break;
			case 11:	
				test11();
				break;
			case 12:	
				test12();
				break;
			case 13:	
				test13();
				break;
			case 14:	
				test14();
				break;
			case 15:	
				test15();
				break;
			case 16:	
				test16();
				break;
			case 17:	
				test17();
				break;
			case 18:	
				test18();
				break;
			case 19:	
				test19();
				break;
			case 20:	
				test20();
				break;
            default:
                System.out.println("Este não é um teste válido!");
			}
		}while(opt!=0);
		ler.close();
		
		/*
		 * TODO verificar este cenario. pois se executado N vezes em algumas situacoes
		 * nao retorna a melhor situacao (maximo local)
		 */
	}
	
	//teste original do grupo de desenvolvimento
	public static void test0()
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
	
	}
	
	public static void test1()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));
		
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
	
	public static void test2()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		
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
	
	public static void test3()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false,true, true,true, true,true, true,true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, false})));
		
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
	
	public static void test4()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true,true, true,true, true,true, true})));
		
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
	
	public static void test5()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true, false, true,true, true,true, true})));
		
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
	
	public static void test6()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, true, true,true, true,true, true,true, true})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, true, true, false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, true, true, false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, true, true, false, true})));//20
		
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
	
	public static void test7()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		
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
	
	public static void test8()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, true,true, true,true, true,true, true})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true, false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true, false, true,true, true,true, true})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));//20
		
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
	
	public static void test9()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,false, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,false, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,false, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,false, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,false, true,false, true})));//20
		
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
	
	public static void test10()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, false,true, true,true, true,true, true})));
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
	
	public static void test11()
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
				{true, true,true, true,false, true,true, false,false, true})));//10
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
				{true, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, false,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, false,true, true,true, true,true, true})));//20
		
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
	
	public static void test12()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,false, true})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,true, true})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));//20
		
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
	
	public static void test13()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false , true,true, true,true, true,true, true,true, true})));//1
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false , true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false , true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true, false, true})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,false, true})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true, true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true, true, true,false, true})));//20
		
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
	
	public static void test14()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,false, true,false, true,false, true,false, true})));//1
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,false, true,false, true,false, true,false, true})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,false, true,false, true,false, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,false, true,false, true,false, true,false, true})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,false, true,false, true,false, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));	
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,false, true,false, true,false, true,false, true})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,false, true,false, true,false, true,false, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,false, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,false, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,false, true,false, true,false, true,false, true})));//20
		
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
	
	public static void test15()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));//1
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,false, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true,true, true,true, true,true, true,true, true})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true,true, true,true, true,true, true,true, true})));//20
		
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
	
	public static void test16()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, false, false, false, false, false, false, false})));//1
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, true, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
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
		
		Agenda a = escalonador.escalonar(alunos, (byte)1);
		
		for (int i = 0; i < a.getAgenda().length; i++)
		{
			System.out.println(a.getAgenda()[i]);
		}
		System.out.println(a.getPontuacao());
		
		long finish = System.currentTimeMillis();  
		long total = finish - start;
		System.out.println("Tempo total de execuзгo: " + total + " milisegundos");
	
	}
	
	public static void test17()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));//1
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, false, false, false, false, false, false, false})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));//20
		
		Agenda a = escalonador.escalonar(alunos, (byte)1);
		
		for (int i = 0; i < a.getAgenda().length; i++)
		{
			System.out.println(a.getAgenda()[i]);
		}
		System.out.println(a.getPontuacao());
		
		long finish = System.currentTimeMillis();  
		long total = finish - start;
		System.out.println("Tempo total de execuзгo: " + total + " milisegundos");
	
	}
	
	public static void test18()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));//1
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, true, false, false, false, false, false, false, false, false})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));//20
		
		Agenda a = escalonador.escalonar(alunos, (byte)1);
		
		for (int i = 0; i < a.getAgenda().length; i++)
		{
			System.out.println(a.getAgenda()[i]);
		}
		System.out.println(a.getPontuacao());
		
		long finish = System.currentTimeMillis();  
		long total = finish - start;
		System.out.println("Tempo total de execuзгo: " + total + " milisegundos");
	
	}
	
	public static void test19()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));//1
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, true, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, false, false, true, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, true, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, false, false, true, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, false, false, false, false})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, true, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, false, false, true, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, true, false, false, false, false, false, false})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, false, false, true, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, true, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, false, false, false, false, false, false, false, false, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{false, true, false, false, true, false, false, false, false, false})));//20
		
		Agenda a = escalonador.escalonar(alunos, (byte)1);
		
		for (int i = 0; i < a.getAgenda().length; i++)
		{
			System.out.println(a.getAgenda()[i]);
		}
		System.out.println(a.getPontuacao());
		
		long finish = System.currentTimeMillis();  
		long total = finish - start;
		System.out.println("Tempo total de execuзгo: " + total + " milisegundos");
	
	}
	
	public static void test20()
	{
		long start = System.currentTimeMillis();
		
		Escalonador escalonador = new Escalonador();
		
		List<Aluno> alunos= new ArrayList<>();
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));//1
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));//5
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));//10
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));//15
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));
		alunos.add(new Aluno(new Agenda(new boolean[]
				{true, false, false, false, true, false, true, false, true, false})));//20
		
		Agenda a = escalonador.escalonar(alunos, (byte)1);
		
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
