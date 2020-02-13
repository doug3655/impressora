public class Aviao implements Voador {
    private double horasVoo;

    public Aviao(double horasVoo){
        this.horasVoo = horasVoo;
    }

    @Override
    public void voar() {
        System.out.println("Estou voando como um avião");
        this.horasVoo+=13;
    }

    @Override
    public double getUnidade() {
        return 0;
    }

    @Override
    public void setUnidade(double unidade) {

    }
}
