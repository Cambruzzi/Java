

 import java.util.ArrayList;
 import java.util.Random;

public class Jogo{
  boolean fimdejogo;
  ArrayList<Carta> empate;
  int rodada;
  int comeca;
  int atributo;
  int ganhador;

  public Jogo (){
    this.fimdejogo = false;
    empate = new ArrayList<>();
    rodada = 1;
    comeca = 0;
    ganhador = 0;
  }

  public void escolhaIciciante(){
   Random rand = new Random();
   int  n = rand.nextInt(2) + 1;
   this.comeca =  n;
  }
  
  public void escolheAtributo(Jogador j1, Maquina j2 , int iniciajogo){
      switch (iniciajogo) {
          case 1:
              this.atributo = j1.escolheAtributo(j1.maodojogador);
              break;
          case 2:
              this.atributo = j2.escolheAtributo(j2.maodojogador);
              break;
          default:
              System.out.println("Erro!");
              System.out.println("\n");
              break;
      }

  }

  public int comparaValor(Carta c1 , Carta c2 , int atributo){
    if(c1.retornaValor(atributo)< c2.retornaValor(atributo)){
          return 2;
        }
    else if(c1.retornaValor(atributo)>c2.retornaValor(atributo)){
      return 1;
    }
    else {
      return 3;
    }

  }
  
  public void comparaIdentidade(Carta c1, Carta c2 , int atributo)
  {
   
    System.out.println("\t\t" + c1.identidade + " " + c1.nome + "\t " + c2.identidade + " " + c2.nome );
    System.out.println("Numero de albuns: \t" + c1.atributos.numero_de_albuns + "\t " + c2.atributos.numero_de_albuns);
    System.out.println("Numero de grammys: \t" + c1.atributos.numero_de_grammys + "\t " + c2.atributos.numero_de_grammys);
    System.out.println("Numero de membros: \t" + c1.atributos.trocas_de_membros + "\t " + c2.atributos.trocas_de_membros);
    System.out.println("Tempo de carreira: \t" + c1.atributos.tempo_de_carreira + "\t " + c2.atributos.tempo_de_carreira);
    System.out.println("Numero de albuns ruins: " + c1.atributos.numero_de_albuns_ruins + "\t " + c2.atributos.numero_de_albuns_ruins);
    System.out.print("\n");
      
    if("D8".equals(c1.retornaIdentidade())){
      
      if(c2.retornaIdentidade().contains("A")){
        this.ganhador = this.comparaValor(c1, c2, atributo);  
      }
      else {
        this.ganhador = 1;
      }
    }
    else if("D8".equals(c2.retornaIdentidade())){
      if(c1.retornaIdentidade().contains("A")){
        this.ganhador  = this.comparaValor(c1, c2, atributo);
        
      }
      else {
        this.ganhador = 2;
      }
    }
    else{
      this.ganhador = this.comparaValor(c1, c2, atributo);
      
    }
   
  }
  
  public void recebeCartas (Jogador j1, Maquina j2 , int ganhador ){
       switch (ganhador) {
          case 1:
               if(!this.empate.isEmpty()) {
                  j1.baralho.addCarta(j1.retiraMao(), j2.retiraMao());
                  j1.baralho.baralho.addAll(this.empate);
              } else {
                  j1.baralho.addCarta(j1.retiraMao(), j2.retiraMao());
              }
              
               this.rodada++;
               this.comeca = 1;
               
               System.out.println("Jogador ganhou!");
                System.out.println("\n");
              
              break;
          case 2:
              if(!this.empate.isEmpty()) {
                  j2.baralho.addCarta(j1.retiraMao(), j2.retiraMao());
                  j2.baralho.baralho.addAll(this.empate);
              } else {
                  j2.baralho.addCarta(j1.retiraMao(), j2.retiraMao());
              }
              
              this.rodada++;
              
              this.comeca = 2;
              
              System.out.println("Maquina ganhou!");
              System.out.println("\n");
              
              
              break;
          case 3:
              this.empate.add(j1.retiraMao());
              this.empate.add(j2.retiraMao());
              
              this.rodada++;
              
              System.out.println("Empatou!");
               System.out.println("\n");
              
              break;
              
          default:
              System.out.println("Erro!");
               System.out.println("\n");
              
              break;
      }
  }
  
  public void vitoria (Jogador j1 , Maquina j2){
      System.out.println("rodadas: " + --this.rodada);
      System.out.println("\n");
      
      if(j1.getQuantidadeDeCartasRestantes() == 32){
          System.out.println("Jogador 1 venceu ");
           System.out.println("\n");
      }
      else if(j2.getQuantidadeDeCartasRestantes() == 32) {
           System.out.println("Maquina venceu ");
            System.out.println("\n");
      }
      }
  }

  




  


