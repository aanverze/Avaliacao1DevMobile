public class Truco {

    // atributos -- inserir

    public Truco() {
        // implementar
    }

    private void embaralhaCartas() {
        // implementar
    }

    private void distribuiMaos() {
        // implementar
    }

    private void inicializaManilha() {
        // implementar
    }

    // ---------------------- não alterar daqui para baixo ------------------------------
    private String imprimeMesa() {
        StringBuilder mesa = new StringBuilder();
        mesa.append(jogador1);
        mesa.append("\n\n\n\n");
        mesa.append(cartaVirada);
        mesa.append("\n\n\n\n");
        mesa.append(jogador2).append("\n");

        return mesa.toString();
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        System.out.println(imprimeMesa());
    }
}
