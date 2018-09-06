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
    
    Atributo B1 = new Atributo();
    B1.numero_de_albuns= 9;
    B1.numero_de_grammys= 12  ;    
    B1.trocas_de_membros= 2;
    B1.tempo_de_carreira= 24;
    B1.numero_de_albuns_ruins= 2 ;
    
    Carta cartaB1= new Carta();
    cartaB1.identidade = "B1";
    cartaB1.nome = "Foo Fighters";
    cartaB1.atributos = B1;

    Atributo B2 = new Atributo();
	  B2.numero_de_albuns= 20;
    B2.numero_de_grammys= 0;    
    B2.trocas_de_membros= 10;
    B2.tempo_de_carreira= 50;
    B2.numero_de_albuns_ruins= 5;

    Carta cartaB2= new Carta();
    cartaB2.identidade = "B2";
    cartaB2.nome = "Deep Purple";
    cartaB2.atributos = B2;

    Atributo B3 = new Atributo();
    B3.numero_de_albuns= 18;
    B3.numero_de_grammys= 1;    
    B3.trocas_de_membros= 7;
    B3.tempo_de_carreira= 49;
    B3.numero_de_albuns_ruins= 3;

    Carta cartaB3= new Carta();
    cartaB3.identidade = "B3";
    cartaB3.nome = "Judas Priest";
    cartaB3.atributos = B3;

    Atributo B4 = new Atributo();
    B4.numero_de_albuns= 12;
    B4.numero_de_grammys= 2;    
    B4.trocas_de_membros= 1;
    B4.tempo_de_carreira= 25;
    B4.numero_de_albuns_ruins= 8;

    Carta cartaB4= new Carta();
    cartaB4.identidade = "B4";
    cartaB4.nome = "Korn";
    cartaB4.atributos = B4;

    Atributo B5 = new Atributo();
    B5.numero_de_albuns= 14;
    B5.numero_de_grammys= 0;    
    B5.trocas_de_membros= 5;
    B5.tempo_de_carreira= 34;
    B5.numero_de_albuns_ruins= 10;

    Carta cartaB5= new Carta();
    cartaB5.identidade = "B5";
    cartaB5.nome = "Sepultura";
    cartaB5.atributos = B5;

    Atributo B6 = new Atributo();
    B6.numero_de_albuns= 9;
    B6.numero_de_grammys= 2;    
    B6.trocas_de_membros= 8;
    B6.tempo_de_carreira= 27;
    B6.numero_de_albuns_ruins= 2;

    Carta cartaB6= new Carta();
    cartaB6.identidade = "B6";
    cartaB6.nome = "Angra";
    cartaB6.atributos = B6;

    Atributo B7 = new Atributo();    
    B7.numero_de_albuns= 3;
    B7.numero_de_grammys= 1;    
    B7.trocas_de_membros= 0;
    B7.tempo_de_carreira= 24;
    B7.numero_de_albuns_ruins= 1;

    Carta cartaB7= new Carta();
    cartaB7.identidade = "B7";
    cartaB7.nome = "Tenacious D";
    cartaB7.atributos = B7;

    Atributo B8 = new Atributo(); 

    B8.numero_de_albuns= 4;
    B8.numero_de_grammys= 3;    
    B8.trocas_de_membros= 5;
    B8.tempo_de_carreira= 12;
    B8.numero_de_albuns_ruins= 2;

    Carta cartaB8= new Carta();
    cartaB8.identidade = "B8";
    cartaB8.nome = "Ghost BC";
    cartaB8.atributos = B8;
	  
    Atributo C1 = new Atributo();
    C1.numero_de_albuns= 9;
    C1.numero_de_grammys= 0;    
    C1.trocas_de_membros= 1;
    C1.tempo_de_carreira= 22;
    C1.numero_de_albuns_ruins= 4;

    Carta cartaC1= new Carta();
    cartaC1.identidade = "C1";
    cartaC1.nome = "Pantera";
    cartaC1.atributos = C1;

    Atributo C2 = new Atributo();

    C2.numero_de_albuns= 12;
    C2.numero_de_grammys= 2;    
    C2.trocas_de_membros= 3;
    C2.tempo_de_carreira= 37;
    C2.numero_de_albuns_ruins= 2;
    
    Carta cartaC2= new Carta();
    cartaC2.identidade = "C2";
    cartaC2.nome = "Slayer";
    cartaC2.atributos = C2;

    Atributo C3 = new Atributo();

    C3.numero_de_albuns= 22;
    C3.numero_de_grammys= 1;    
    C3.trocas_de_membros= 7;
    C3.tempo_de_carreira= 40;
    C3.numero_de_albuns_ruins= 9;

    Carta cartaC3= new Carta();
    cartaC3.identidade = "C3";
    cartaC3.nome = "Motorhead";
    cartaC3.atributos = C3;

    Atributo C4 = new Atributo();

    C4.numero_de_albuns= 9;
    C4.numero_de_grammys= 0;    
    C4.trocas_de_membros= 2;
    C4.tempo_de_carreira= 24; 
    C4.numero_de_albuns_ruins= 2;

    Carta cartaC4= new Carta();
    cartaC4.identidade = "C4";
    cartaC4.nome = "Lamb of God";
    cartaC4.atributos = C4;

    Atributo C5 = new Atributo();

    C5.numero_de_albuns= 5;
    C5.numero_de_grammys= 0;    
    C5.trocas_de_membros= 3;
    C5.tempo_de_carreira= 14;
    C5.numero_de_albuns_ruins= 1;

    Carta cartaC5= new Carta();
    cartaC5.identidade = "C5";
    cartaC5.nome = "The Agonist";
    cartaC5.atributos = C5;

    Atributo C6 = new Atributo();

    C6.numero_de_albuns= 16;
    C6.numero_de_grammys= 1;    
    C6.trocas_de_membros= 10;
    C6.tempo_de_carreira= 45;
    C6.numero_de_albuns_ruins= 11;

    Carta cartaC6= new Carta();
    cartaC6.identidade = "C6";
    cartaC6.nome = "Ac/Dc";
    cartaC6.atributos = C6;

    Atributo C7 = new Atributo();

    C7.numero_de_albuns= 6;
    C7.numero_de_grammys= 0;    
    C7.trocas_de_membros= 3;
    C7.tempo_de_carreira= 20;
    C7.numero_de_albuns_ruins= 1;

    Carta cartaC7= new Carta();
    cartaC7.identidade = "C7";
    cartaC7.nome = "Bullet for my Valentine";
    cartaC7.atributos = C7;

    Atributo C8 = new Atributo();

    C8.numero_de_albuns= 6;
    C8.numero_de_grammys= 0;    
    C8.trocas_de_membros= 3;
    C8.tempo_de_carreira= 26;
    C8.numero_de_albuns_ruins= 1;

    Carta cartaC8= new Carta();
    cartaC8.identidade = "C8";
    cartaC8.nome = "Stone Sour";
    cartaC8.atributos = C8;

    Atributo D1 = new Atributo();

    D1.numero_de_albuns= 15;
    D1.numero_de_grammys= 1;    
    D1.trocas_de_membros= 7;
    D1.tempo_de_carreira= 49;
    D1.numero_de_albuns_ruins= 2;

    Carta cartaD1= new Carta();
    cartaD1.identidade = "D1";
    cartaD1.nome = "Pink Floyd";
    cartaD1.atributos = D1;

    Atributo D2 = new Atributo();

    D2.numero_de_albuns= 9;
    D2.numero_de_grammys= 1;    
    D2.trocas_de_membros= 0;
    D2.tempo_de_carreira= 8;
    D2.numero_de_albuns_ruins= 2;

    Carta cartaD2= new Carta();
    cartaD2.identidade = "D2";
    cartaD2.nome = "The Doors";
    cartaD2.atributos = D2;

    Atributo D3 = new Atributo();

    D3.numero_de_albuns= 10;
    D3.numero_de_grammys= 0;    
    D3.trocas_de_membros= 11;
    D3.tempo_de_carreira= 20;
    D3.numero_de_albuns_ruins= 3;

    Carta cartaD3= new Carta();
    cartaD3.identidade = "D3";
    cartaD3.nome = "Black Label Society";
    cartaD3.atributos = D3;

    Atributo D4 = new Atributo();

    D4.numero_de_albuns= 13;
    D4.numero_de_grammys= 0;    
    D4.trocas_de_membros= 5;
    D4.tempo_de_carreira= 33;
    D4.numero_de_albuns_ruins= 5;

    Carta cartaD4= new Carta();
    cartaD4.identidade = "D4";
    cartaD4.nome = "Dream Theater";
    cartaD4.atributos = D4;

    Atributo D5 = new Atributo();

    D5.numero_de_albuns= 7;
    D5.numero_de_grammys= 0;    
    D5.trocas_de_membros= 5;
    D5.tempo_de_carreira= 19;
    D5.numero_de_albuns_ruins= 2;

    Carta cartaD5= new Carta();
    cartaD5.identidade = "D5";
    cartaD5.nome = "Avenged Sevenfold";
    cartaD5.atributos = D5;

    Atributo D6 = new Atributo();

    D6.numero_de_albuns= 6;
    D6.numero_de_grammys= 0;    
    D6.trocas_de_membros= 0;
    D6.tempo_de_carreira= 24;
    D6.numero_de_albuns_ruins= 1;

    Carta cartaD6= new Carta();
    cartaD6.identidade = "D6";
    cartaD6.nome = "Rammstein";
    cartaD6.atributos = D6;

    Atributo D7 = new Atributo();

    D7.numero_de_albuns= 10;
    D7.numero_de_grammys= 1;    
    D7.trocas_de_membros= 5;
    D7.tempo_de_carreira= 26;
    D7.numero_de_albuns_ruins= 4;

    Carta cartaD7= new Carta();
    cartaD7.identidade = "D7";
    cartaD7.nome = "Amon Amarth";
    cartaD7.atributos = D7;

    Atributo D8 = new Atributo();

    D8.numero_de_albuns= 13;
    D8.numero_de_grammys= 0;    
    D8.trocas_de_membros= 3;
    D8.tempo_de_carreira= 30;
    D8.numero_de_albuns_ruins= 0;

    Carta cartaD8= new Carta();
    cartaD8.identidade = "D8";
    cartaD8.nome = "Molejo";
    cartaD8.atributos = D8;

    



    



  }
}
