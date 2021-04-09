public class Cilindro extends Circulo {
    private Circulo base;
    private double altura;

    public Cilindro(){
        base = new Circulo();
        altura = 1;
    }

    public Circulo getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}