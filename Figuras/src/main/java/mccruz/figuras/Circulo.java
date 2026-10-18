package mccruz.figuras;

public class Circulo extends FiguraCircular{
    public Circulo(int radio) {
        super();
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    protected String imprimeFigura() {
        return "Se imprime un Circulo con radio: " + radio +
               ", area: " + String.format("%.2f", calcularArea()) +
               ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}
