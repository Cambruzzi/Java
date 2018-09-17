
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.Random;


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Jogador jogador1 = new Jogador();
    Maquina jogador2 = new Maquina();
    Jogo jogo = new Jogo();
    Deck deck = new Deck();

    deck.embaralharDeck();

   
    jogador1.baralho.baralho = deck.dividirDeck();
    jogador2.baralho.baralho = deck.dividirDeck();
    jogo.escolhaIciciante();

do{
    System.out.println("Rodada: " + jogo.rodada);
    System.out.println("\n");
    System.out.println("cartas: \n" + "Jogador " + jogador1.getQuantidadeDeCartasRestantes() + "\t Maquina " + jogador2.getQuantidadeDeCartasRestantes());
    System.out.println("\n");
    jogador1.colocaMao();
    jogador2.colocaMao();
    
    jogo.escolheAtributo(jogador1, jogador2, jogo.comeca);
    jogo.comparaIdentidade(jogador1.maodojogador,jogador2.maodojogador,jogo.atributo);
    jogo.recebeCartas(jogador1, jogador2, jogo.ganhador);
    
    
}while(jogador2.getQuantidadeDeCartasRestantes() !=0 && jogador1.getQuantidadeDeCartasRestantes() != 0 || jogo.empate == null);



jogo.vitoria(jogador1, jogador2);
    

    


  }
}
