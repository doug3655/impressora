import java.util.SortedMap;

public class Pato implements Voador {
    private double energia;

    public Pato(double energia){
        this.energia = energia;
    }

    @Override
    public void voar() {
        if(energia>=5){
            System.out.println("Estou voando como um pato");
            energia-=5;
        }else{
            System.out.println("Energia insuficiente para voar");
        }
    }

    @Override
    public double getUnidade() {
        return energia;
    }

    @Override
    public void setUnidade(double unidade) {
        this.energia = unidade;
    }
}
