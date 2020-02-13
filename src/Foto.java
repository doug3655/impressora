public class Foto implements Imprimivel {
    private String nome;
    private String tipo;

    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie "+ nome + "." + tipo );
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
