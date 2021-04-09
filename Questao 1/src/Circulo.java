public class Circulo {
    private double raio;
    
    public Circulo() {
        raio = 1.0;
    }
    public Circulo(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double perimetro(){
        return 2 * Math.PI * raio;
    }
    public double area(){
        return Math.PI * raio * raio;
    }
    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}