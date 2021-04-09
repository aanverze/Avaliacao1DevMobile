public class QuadradoRedimensionavel extends Quadrado implements Redimensionavel{
    public QuadradoRedimensionavel(double lado) {
        super(lado);
    }

    @Override
    public double perimetro() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void redimensionar(int percentual) {
        lado += lado * percentual / 100;
    }
}
