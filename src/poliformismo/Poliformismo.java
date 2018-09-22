
package poliformismo;


public class Poliformismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figura misFiguras[]=new Figura[3];
        
        misFiguras[0]=new Triangulo(3, "rojo", 34, 32, "equilatero");
        misFiguras[1]=new Rectangulo(4, "amarillo", 24, 30, 4);
        misFiguras[2]=new Circulo(0, "verde", 23, 23, 10, 5);
        
        
    
        for (Figura Figura: misFiguras){
           System.out.println(Figura.mostrarDatos());
           System.out.println(" ");
         
        }

    }
    
}
