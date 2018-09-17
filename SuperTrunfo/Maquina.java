

import java.util.ArrayList;
import java.util.Collections;  





public class Maquina{
  Baralho baralho;
  Carta maodojogador;
  
    public Maquina(){
    baralho = new Baralho();
    maodojogador = new Carta();
  } 

  public int escolheAtributo(Carta maodojogador){
    Double perc1,perc2,perc3,perc4,perc5;
    ArrayList<Double> porc = new ArrayList<>();
    
    
    perc1 = maodojogador.atributos.numero_de_albuns/18.0 ;
    perc2 = maodojogador.atributos.numero_de_grammys/12.0;
    perc3 = maodojogador.atributos.trocas_de_membros/20.0;
    perc4 = maodojogador.atributos.tempo_de_carreira/50.0;
    perc5 = maodojogador.atributos.numero_de_albuns_ruins/6.0;
  
    porc.add(perc1);
    porc.add(perc2);
    porc.add(perc3);
    porc.add(perc4);
    porc.add(perc5);
    
    Collections.sort(porc);
    
    if(porc.get(4) == perc1){
        System.out.println("Maquina escolheu atributo 1");
        System.out.println("\n");
        return 1;
    }
    else if (porc.get(4) == perc2){
        System.out.println("Maquina escolheu atributo 2");
        System.out.println("\n");
        return 2;
    }
    else if (porc.get(4) == perc3){
        System.out.println("Maquina escolheu atributo 3");
        System.out.println("\n");
        return 3;
    }
    else if (porc.get(4) == perc4){
        System.out.println("Maquina escolheu atributo 4");
        System.out.println("\n");
        return 4;
    }
    else {
        System.out.println("Maquina escolheu atributo 5");
        System.out.println("\n");
        return 5;
    }
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


  

