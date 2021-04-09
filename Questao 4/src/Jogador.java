public class Jogador {
    private Carta[] mao;
    private int MaxMao = 3;
    private int indiceMao;

    public Jogador() {
        mao = new Carta[MaxMao];
        indiceMao = 0;
    }

    public void receberCarta(Carta c) {
        if (indiceMao < MaxMao){
            mao[indiceMao] = c;
            indiceMao ++;
        }
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
