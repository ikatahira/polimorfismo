public class Principal {

    public static void main(String[] args) {
        Quadrado quadrado= new Quadrado();
        Losango losango = new Losango();
        Retangulo retangulo=new Retangulo();
        Trapezio trapezio=new Trapezio();
        Quadrilatero quadrilatero = new Quadrilatero();

        quadrilatero.calcularArea();
        quadrado.calcularArea();
        losango.calcularArea();
        retangulo.calcularArea();
        trapezio.calcularArea(); 

    }
    
}
