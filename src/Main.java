// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Triangulo triangulo =  new Triangulo();
        triangulo.ingresarCoordenadas();
        triangulo.calcularBaricentro();
        triangulo.calcularDistancias();

        Circulo circulo = new Circulo(triangulo);
        double areaCirculo = circulo.obtenerArea();
        System.out.println("El área del circulo es: "+areaCirculo);


    }
}