import java.util.Scanner;
public class Jogador{
  Baralho baralho;
  Carta maodojogador;

  public int escolheAtributo(Carta maodojogador){
    int auxiliar;
    Scanner entrada = new Scanner(System.in);
    System.out.println("1 - Numero de albuns: " + maodojogador.atributos.numero_de_albuns);
    System.out.println("2 - Numero de grammys: " + maodojogador.atributos.numero_de_grammys);
    System.out.println("3 - Numero de membros: " + maodojogador.atributos.trocas_de_membros);
    System.out.println("4 - Tempo de carreira: " + maodojogador.atributos.tempo_de_carreira);
    System.out.println("5 - Numero de albuns ruins: " + maodojogador.atributos.numero_de_albuns_ruins);
    
    System.out.print("Escolha o atributo:");
    auxiliar = entrada.nextInt();
    return auxiliar;
    }

  public int getQuantidadeDeCartasRestantes(){
     return this.baralho.getQuantidade();
  }

}
