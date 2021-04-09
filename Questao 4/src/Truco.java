public class Truco {
    private Jogador jogador1;
    private Jogador jogador2;
    private Carta cartaVirada;
    private Baralho baralho;


    public Truco() {
        jogador1 = new Jogador();
        jogador2 = new Jogador();
        baralho = new Baralho();
        cartaVirada = new Carta();
    }

    private void embaralhaCartas() {
        baralho.embaralhar();
    }

    private void distribuiMaos() {
        for(int i = 0; i < 3; i++){
            jogador1.receberCarta(baralho.distribuir());
            jogador2.receberCarta(baralho.distribuir());
        }
    }

    private void inicializaManilha() {
        cartaVirada = baralho.distribuir();
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
