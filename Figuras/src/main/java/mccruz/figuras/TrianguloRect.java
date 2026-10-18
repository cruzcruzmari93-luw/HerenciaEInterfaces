package mccruz.figuras;

public class TrianguloRect extends FiguraRecta{
    public TrianguloRect(int ancho, int alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(ancho*ancho + alto*alto);
        return ancho + alto + hipotenusa;
    }

    @Override
    protected String imprimeFigura() {
        return "Se imprime un Triangulo con alto: " + alto +
               ", ancho: " + ancho +
               ", area: " + String.format("%.2f", calcularArea()) +
               ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}
