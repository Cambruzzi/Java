

import java.util.Scanner;
public class Jogador{
  Baralho baralho;
  Carta maodojogador;

  public Jogador(){
    baralho = new Baralho();
    maodojogador = new Carta();
  } 

  public int escolheAtributo(Carta maodojogador){
    int auxiliar;
    Scanner entrada = new Scanner(System.in);
    System.out.println(this.maodojogador.identidade + " " + this.maodojogador.nome);
    System.out.println("1 - Numero de albuns: " + this.maodojogador.atributos.numero_de_albuns);
    System.out.println("2 - Numero de grammys: " + this.maodojogador.atributos.numero_de_grammys);
    System.out.println("3 - Numero de membros: " + this.maodojogador.atributos.trocas_de_membros);
    System.out.println("4 - Tempo de carreira: " + this.maodojogador.atributos.tempo_de_carreira);
    System.out.println("5 - Numero de albuns ruins: " + this.maodojogador.atributos.numero_de_albuns_ruins);
    System.out.println("\n");
    System.out.print("Escolha o atributo:");
    
    auxiliar = entrada.nextInt();
    System.out.println("\n");
    return auxiliar;
    }

  public int getQuantidadeDeCartasRestantes(){
     return this.baralho.getQuantidade();
  }
  
 public Carta retiraMao(){
     Carta auxiliar;
     auxiliar = this.maodojogador;
     this.maodojogador = null;
     return auxiliar;
 }
 
 public void colocaMao(){
     this.maodojogador = this.baralho.baralho.remove(0);
 }

}
