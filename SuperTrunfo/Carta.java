public class Carta{
  String identidade;
  String nome;
  Atributo atributos;

  public int retornaValor(int numero_atributo){
      switch (numero_atributo) {
          case 1:
              return this.atributos.numero_de_albuns;
          case 2:
              return this.atributos.numero_de_grammys;
          case 3:
              return this.atributos.trocas_de_membros;
          case 4:
              return this.atributos.tempo_de_carreira;
          case 5:
              return this.atributos.numero_de_albuns_ruins;
          default:
              System.out.println("Erro!");
              System.out.println("\n");
              return 0;
      }

     
  }

  public String retornaIdentidade(){
    return this.identidade;
  }

}
