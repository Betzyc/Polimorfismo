
package poliformismo;


public class RectanguloRedondo extends Rectangulo {
    
    public RectanguloRedondo(int lados, String color, int area, int perimetro, int vertices, int altura){
        super(lados, color, area, perimetro, vertices);
        this.altura=altura;
    }
    
    private int altura;

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+
                "\naltura: "+altura; 
    }
    
    
    
    
}
