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
    
    Atributo A4 = new Atributo();
    A4.atributos.numero_de_albuns= 6;
    A4.atributos.numero_de_grammys= 0;    
    A4.atributos.trocas_de_membros= 20;
    A4.atributos.tempo_de_carreira= 33;
    A4.atributos.numero_de_albuns_ruins= 2;

    Carta cartaA4= new Carta();
    cartaA4.identidade = "A4";
    cartaA4.nome = "Guns n Roses";
    cartaA4.atributos = A4;

    Atributo A5 = new Atributo();
    A5.atributos.numero_de_albuns= 5;
    A5.atributos.numero_de_grammys= 1;    
    A5.atributos.trocas_de_membros= 1;
    A5.atributos.tempo_de_carreira= 24;
    A5.atributos.numero_de_albuns_ruins= 0;

    Carta cartaA5= new Carta();
    cartaA5.identidade = "A5";
    cartaA5.nome = "System of a Down"
    cartaA5.atributos = A5;

    Atributo A6 = new Atributo();
    A6.atributos.numero_de_albuns= 5;
    A6.atributos.numero_de_grammys= 1;    
    A6.atributos.trocas_de_membros= 7;
    A6.atributos.tempo_de_carreira= 23;
    A6.atributos.numero_de_albuns_ruins= 1;

    Carta cartaA6 = new Carta();
    cartaA6.identidade = "A6";
    cartaA6.nome = "Slipknot";
    cartaA6.atributos = A6;

    Atributo A7 = new Atributo();
    A7.atributos.numero_de_albuns= 19 ;
    A7.atributos.numero_de_grammys= 2  ;    
    A7.atributos.trocas_de_membros= 30;
    A7.atributos.tempo_de_carreira= 50;
    A7.atributos.numero_de_albuns_ruins= 4 ;

    Carta cartaA7= new Carta();
    cartaA7.identidade = "A7";
    cartaA7.nome = "Black Sabbath";
    cartaA7.atributos = A7;

    Atributo A8 = new Atributo();
    A8.atributos.numero_de_albuns=  3;
    A8.atributos.numero_de_grammys=  1;    
    A8.atributos.trocas_de_membros= 7;
    A8.atributos.tempo_de_carreira= 7 ;
    A8.atributos.numero_de_albuns_ruins= 0

    Carta cartaA8= new Carta();
    cartaA8.identidade = "A8";
    cartaA8.nome = "Nirvana";
    cartaA8.atributos = A8;



    



  }
}
