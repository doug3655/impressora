public class Contrato implements Imprimivel {
    private String nome;
    private String tipo;

    public Contrato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal "+ nome + "." + tipo );
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
