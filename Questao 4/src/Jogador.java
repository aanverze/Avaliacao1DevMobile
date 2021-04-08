public class Jogador {
    // atributos -- incluir

    public Jogador() {
        // implementar
    }

    public Carta[] getMao() {
        // implementar
    }

    public void receberCarta(Carta c) {
        // implementar
    }

    // --------------- não alterar daqui para baixo -----------------------
    @Override
    public String toString() {
        String retorno = "";
        for (int i = 0; i < mao.length; i++) {
            retorno += i + ": " + mao[i] + (i < mao.length - 1 ? " | " : "");
        }

        return retorno;
    }
}
