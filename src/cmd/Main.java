package cmd;

import app.Arbitro;
import app.Jogador;
import app.Partida;
import app.Time;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Arbitro> arbitrosList = new ArrayList<>();
		Time time1 = new Time();
		Time time2 = new Time();
		Partida partida = new Partida(time1, time2, arbitrosList);
		List<Jogador> jogadoresTime1 = new ArrayList<>();
		List<Jogador> jogadoresTime2 = new ArrayList<>();
		
		arbitrosList.add(new Arbitro("Arbitro1", "bandeira"));
		arbitrosList.add(new Arbitro("Arbitro2", "bandeira"));
		arbitrosList.add(new Arbitro("Arbitro3", "bandeira"));
		
		jogadoresTime1.add(new Jogador("Nome jogador 1", 1, "Goleiro"));
		jogadoresTime1.add(new Jogador("Nome jogador2", 2, "Lateral"));
		jogadoresTime1.add(new Jogador("Nome jogador3", 3, "Lateral esquerdo"));
		jogadoresTime1.add(new Jogador("Nome jogador 4", 4, "Zagueiro"));
		jogadoresTime1.add(new Jogador("Nome jogador 5", 5, "Zagueiro central"));
		jogadoresTime1.add(new Jogador("Nome jogador 6", 6, "Volante"));
		jogadoresTime1.add(new Jogador("Nome jogador 7", 7, "Meio-campista direito"));
		jogadoresTime1.add(new Jogador("Nome jogador 8", 8, "Meio-campista centro"));
		jogadoresTime1.add(new Jogador("Nome jogador 9", 9, "Meia-armador, meia de ligação ou apoiador"));
		jogadoresTime1.add(new Jogador("Nome jogador 10", 10, "Meio-campista lateral, direito ou esquerdo"));
		jogadoresTime1.add(new Jogador("Nome jogador 11", 11, "Meia-atacante, meia ofensivo ou médio ofensivo"));
		
		jogadoresTime2.add(new Jogador("Nome jogador1", 1, "Atacante"));
		jogadoresTime2.add(new Jogador("Nome jogador2", 2, "Lateral"));
		jogadoresTime2.add(new Jogador("Nome jogador3", 3, "Lateral esquerdo"));
		jogadoresTime2.add(new Jogador("Nome jogador4", 4, "Zagueiro"));
		jogadoresTime2.add(new Jogador("Nome jogador5", 5, "Zagueiro central"));
		jogadoresTime2.add(new Jogador("Nome jogador6", 6, "Volante"));
		jogadoresTime2.add(new Jogador("Nome jogador7", 7, "Meio-campista direito"));
		jogadoresTime2.add(new Jogador("Nome jogador8", 8, "Meio-campista centro"));
		jogadoresTime2.add(new Jogador("Nome jogador9", 9, "Meia-armador, meia de ligação ou apoiador"));
		jogadoresTime2.add(new Jogador("Nome jogador10", 10, "Meio-campista lateral, direito ou esquerdo"));
		jogadoresTime2.add(new Jogador("Nome jogador11", 11, "Meia-atacante, meia ofensivo ou médio ofensivo"));
		
		// definindo o nome dos times
		time1.setNome("Santos");
		time2.setNome("São paulo");

		// definindo lista de jogadores dos times
		time1.addJogador(jogadoresTime1);
		time2.addJogador(jogadoresTime2);
		
		// definindo arbitros nas partidas
		partida.adicionarArbitro(arbitrosList);
		
		// adicionando dados de placar
		partida.adicionarPlacar(2,1,jogadoresTime1.get(1),jogadoresTime2.get(5));
		
		time1.exibirDados();
		time2.exibirDados();
		
		partida.exibirDados();
	}
}