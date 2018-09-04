public class Carta{
  String identidade;
  String nome;
  Atributo atributos;

  public int retornaValor(int numero_atributo){
    if (numero_atributo == 1 ){
      return this.atributos.numero_de_albuns;
    }

    else if (numero_atributo == 2){
      return this.atributos.numero_de_grammys;
    }

    else if (numero_atributo == 3){
      return this.atributos.trocas_de_membros;
    }

   else if (numero_atributo == 4){
      return this.atributos.tempo_de_carreira;
    }

    else if (numero_atributo == 5){
      return this.atributos.numero_de_albuns_ruins;
    }

    else {
      System.out.println("Erro!");
      return 0;
    }

     
  }

  public String retornaIdentidade(){
    return this.identidade;
  }

}
