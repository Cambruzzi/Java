
import java.util.ArrayList;

public class Baralho {

  ArrayList<Carta> baralho;

  public Baralho(){
    baralho = new ArrayList<>();
  }

  public Carta retornaCarta(){
    Carta auxiliar;
    auxiliar = this.baralho.remove(0);
    return auxiliar;
  }

  public void addCarta(Carta carta1,Carta carta2){
    this.baralho.add(carta1);
    this.baralho.add(carta2);
  }

  public int getQuantidade(){
    return this.baralho.size();
  }
  
}
