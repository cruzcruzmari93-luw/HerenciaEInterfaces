package mccruz.figuras;

public class Figuras {
    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3,4);
        System.out.println("Se imprime una FiguraPlana...");
        System.out.println(f.imprimeFigura());

        f = new Circulo(3);
        System.out.println("Se imprime una FiguraPlana...");
        System.out.println(f.imprimeFigura());
    }
}
