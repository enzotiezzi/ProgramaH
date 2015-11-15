package Model;

import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;


public class Escalonador
{
	private Agenda melhorAgenda;
	//controle de agendas
	private Agenda[] agendas; 
	
	public Escalonador()
	{
		long maxComb = combinacao(10, 1) + combinacao(10, 2) + combinacao(10, 3) + combinacao(10, 4);
		agendas = new Agenda[(int)maxComb];
		
		melhorAgenda = new Agenda(new boolean[]{false,false,false,false,false,false,false,false,false,false});
	}

	private boolean exists(Agenda random)
	{
		for (int i = 0; i < agendas.length; i++)
		{
			if (agendas[i] == null)
				break;
			
			if (agendas[i].equalsTo(random))
			{
				return true;
			}
		}
		
		return false;
	}
	
	private boolean valido(List<Aluno> alunos)
	{
		for (Aluno aluno : alunos)
		{
			Agenda agenda = aluno.getAgenda();
			int p = 0;
			for (boolean b : agenda.getAgenda())
			{
				if (b)
					p++;
			}
			
			if (p == 10)
				return false;
			p = 0;
		}
		return true;
	}
	
	public Agenda escalonar(List<Aluno> alunos, byte maxTreino)
	{
		if (!valido(alunos))
		{
			JOptionPane.showMessageDialog(null, "Um aluno tem que ter no m�nimo um hor�rio com aula");
			System.exit(0);
		}
		
		int p = 0;
		for (int i = 1; i <= maxTreino; i++)
		{
			long combinacao = combinacao(10, i);
			
			for (int j = 0; j < combinacao; j++)
			{
				Agenda random = randomAgenda((byte)i);
				
				if(!exists(random))
				{
					agendas[p] = random;
					int pontuacao = pontuacaoAgenda(alunos, agendas[p]);
					
					agendas[p].setPontuacao(pontuacao);
					
					if(agendas[p].getPontuacao() >= alunos.size())
					{
						return agendas[p];
					}
					else 
					{
						if (((agendas[p].getPontuacao()/alunos.size())* 100) >= 80)
						{
							return agendas[p];
						}
						else 
						{
							if (agendas[p].getPontuacao() > melhorAgenda.getPontuacao())
							{
								melhorAgenda = agendas[p];
							}
							p++;
						}
					}
				}
				else 
				{
					j--;
				}
			}
		}
		
		return melhorAgenda;
	}
	
	private Agenda randomAgenda(byte maxTreino)
	{
		int[] posicoes = new int[maxTreino];
		boolean[] vetorBoolean = new boolean[10];
		
		for (int i = 0; i < posicoes.length; i++)
			posicoes[i] = 0;
		
		for (int i = 0; i < posicoes.length; i++)
		{
			Random r = new Random();
			int posicao = r.nextInt(10);
			
			if (!vetorBoolean[posicao])
			{
				vetorBoolean[posicao] = true;
			}
			else 
			{
				i--;
			}
		}
		
		return new Agenda(vetorBoolean);
	}

	private long combinacao(int n, int p)
	{
		// n!/ p!(n-p)!
		
		return (fatorial(n)/(fatorial(p) * fatorial(n-p)));
	}
	
	private int fatorial(int n)
	{
		int r = 1;
		
		for (int i = 2; i <= n; i++)
			r*=i;
		
		return r;
	}

	private int pontuacaoAgenda(List<Aluno> alunos, Agenda a)
	{
		int pontuacao = 0;
		
		for (Aluno aluno: alunos)
		{
			for (int i = 0; i < a.getAgenda().length; i++)
			{
				if (aluno.getAgenda().getAgenda()[i] && a.getAgenda()[i])
				{
					pontuacao++;
				}
			}
		}
		
		return pontuacao;
	}
}
