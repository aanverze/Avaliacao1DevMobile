// Não altere esta classe
public class Carta {
    // atributos
    private String naipe;
    private String valor;

    public Carta(){

    }

    // construtor
    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}