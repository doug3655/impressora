public class Main extends Impressora{
    public static void main(String[] args) {
        Contrato contrato = new Contrato("testado","contrat");
        Foto foto = new Foto("parado","png");
        Documento documento = new Documento("textinho","docx");
        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(documento);
        impressora.imprimirTudo();

        Pato pato = new Pato(10);
        Aviao aviao = new Aviao(0);
        SuperHomem superHomem = new SuperHomem(1);
        TorreDeControle torreDeControle = new TorreDeControle();

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        torreDeControle.adicionarVoador(pato);
        torreDeControle.adicionarVoador(aviao);
        torreDeControle.adicionarVoador(superHomem);
        torreDeControle.voemTodos();
    }
}
