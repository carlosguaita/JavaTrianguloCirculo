import java.util.Scanner;

public class Triangulo {

    Punto punto1;
    Punto punto2;
    Punto punto3;

    Punto baricentro;

    public Triangulo() {
    }

    public Triangulo(Punto punto1, Punto punto2, Punto punto3, Punto baricentro) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.baricentro = baricentro;
    }

    public void ingresarCoordenadas(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la componente X del punto 1: ");
        double x1 = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 1: ");
        double y1 = sc.nextDouble();
        this.punto1 = new Punto(x1,y1);

        System.out.println("Ingrese la componente X del punto 2: ");
        double x2 = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 2: ");
        double y2 = sc.nextDouble();
        this.punto2 = new Punto(x2,y2);

        System.out.println("Ingrese la componente X del punto 3: ");
        double x3 = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 3: ");
        double y3 = sc.nextDouble();
        this.punto3 = new Punto(x3,y3);

    }


    void calcularBaricentro(){

        double bx = (punto1.getX()+punto2.getX()+punto3.getX())/3;
        double by = (punto1.getY()+punto2.getY()+punto3.getY())/3;

        this.baricentro= new Punto(bx,by);

        System.out.println("Las coordenadas del baricentro son: X: "+baricentro.getX()+" Y: "+baricentro.getY());
    }

    public void calcularDistancias(){

        double d1 = this.obtenerDistancias(this.punto1,this.punto2);
        double d2 = this.obtenerDistancias(this.punto1,this.punto3);
        double d3 = this.obtenerDistancias(this.punto2,this.punto3);

        System.out.println("LA distancia entre el Punto 1 y el Punto 2 es: "+d1);
        System.out.println("LA distancia entre el Punto 1 y el Punto 3 es: "+d2);
        System.out.println("LA distancia entre el Punto 2 y el Punto 3 es: "+d3);

    }

    public double obtenerDistancias(Punto punto1, Punto punto2){
        double d;

        d=Math.sqrt(Math.pow((punto1.getX()-punto2.getX()),2)+Math.pow((punto1.getY()-punto2.getY()),2));

        return d;
    }

}
