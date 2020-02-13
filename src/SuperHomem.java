public class SuperHomem implements Voador {
    private double exp;

    public SuperHomem(double exp) {
        this.exp = exp;
    }

    @Override
    public void voar() {
        System.out.println("Estou voando como um campeão");
        this.exp+=3;
    }

    @Override
    public double getUnidade() {
        return exp;
    }

    @Override
    public void setUnidade(double unidade) {
        this.exp = unidade;
    }
}
