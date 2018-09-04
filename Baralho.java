import java.util.ArrayList;

public class Baralho {
  ArrayList <Cartas> baralho;

  public Baralho (){
    
    Atributo A1 = new Atributo();
    A1.atributos.numero_de_albuns= 11;
    A1.atributos.numero_de_grammys= 9;
    A1.atributos.trocas_de_membros= 7;
    A1.atributos.tempo_de_carreira=37;
    A1.atributos.numero_de_albuns_ruins= 4;

    Carta cartaA1 = new Carta();
    cartaA1.identidade = "A1";
    cartaA1.nome = "Metallica";
    cartaA1.atributos = A1;


    Atributo A2 = new Atributo();
    A2.atributos.numero_de_albuns= 15;
    A2.atributos.numero_de_grammys= 1;
    A2.atributos.trocas_de_membros= 19;
    A2.atributos.tempo_de_carreira= 35;
    A2.atributos.numero_de_albuns_ruins=6;
    	
    Carta cartaA2= new Carta();
    cartaA2.identidade = "A2";
    cartaA2.nome = "Megadeth";
    cartaA2.atributos = A2;

    Atributo A3 = new Atributo();
    A3.atributos.numero_de_albuns= 16;
    A3.atributos.numero_de_grammys= 1;    
    A3.atributos.trocas_de_membros= 7;
    A3.atributos.tempo_de_carreira= 43;
    A3.atributos.numero_de_albuns_ruins= 3;

    Carta cartaA3= new Carta();
    cartaA3.identidade = "A3";
    cartaA3.nome = "Iron Maiden";
    cartaA3.atributos = A3;
    



    



  }
}
