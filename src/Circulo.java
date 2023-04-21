public class Circulo {

    Triangulo triangulo;

    public Circulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    double obtenerArea(){
        Punto baricentro = triangulo.getBaricentro();
        Punto punto1 = triangulo.getPunto1();
        double radio = triangulo.obtenerDistancias(baricentro,punto1);
        double area = Math.PI*Math.pow(radio,2);
        return area;
            }
}
