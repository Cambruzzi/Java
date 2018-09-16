 import java.util.ArrayList;
 import java.util.Random;

public class Jogo{
  boolean fimdejogo;
  ArrayList<Carta> empate;
  int rodada;

  public Jogo (){
    this.fimdejogo = false;
    empate = new ArrayList<Carta>();
    rodada = 0;
  }

  public int escolhaIciciante(){
   Random rand = new Random();
   int  n = rand.nextInt(2) + 1;
   return n;
  }



  

}
