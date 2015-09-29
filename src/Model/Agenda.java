package Model;

public class Agenda
{
	private boolean[] agenda;
	private int pontuacao;
	
	public Agenda(boolean agenda[])
	{
		this.agenda = agenda;
		this.pontuacao = 0;
	}
	
	public boolean[] getAgenda()
	{
		return this.agenda;
	}
	
	public int getPontuacao()
	{
		return this.pontuacao;
	}
	
	public void setPontuacao(int pontuacao)
	{
		this.pontuacao = pontuacao;
	}
	
	public boolean equalsTo(Agenda a)
	{
		for (int i = 0; i < agenda.length; i++)
		{
			if (agenda[i] != a.agenda[i])
				return false;
		}
		
		return true;
	}
}
