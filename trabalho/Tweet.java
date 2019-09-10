import java.util.Date;
import java.util.Scanner;

public class Tweet {
	private String texto;
	private Date horario;
	
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public void  Tweetar(Usuario a1) {
		String teste = "s";
		while(teste.equals("s"))
		{
			if(a1.isLogado())
			{
				Date date = new Date(); 
				this.horario = date;
				
				Scanner dados = new Scanner(System.in);
				System.out.print("Digite seu Tweet ");
				String tweet = dados.nextLine();
				
				if(tweet.length() >= 140)
				{
					System.out.println("Limite Ultrapassado");
				}
				else
				{
					Tweet t2 = new Tweet();
					t2.setTexto(tweet);
					//this.texto = tweet;
					a1.adicionarTweet(t2);
					System.out.println("Postado");
					System.out.print("Quer Postar mais?");
					teste = dados.next();
					
				}
			}
			else
			{
				System.out.println("É necessario estar logado");
				
			}
		
		}
		
	}
	
	
}
