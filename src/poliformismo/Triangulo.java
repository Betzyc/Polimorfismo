
package poliformismo;

public class Triangulo extends Figura {
    
    public Triangulo(int lados, String color, int area, int perimetro, String tipo){
        super(lados, color, area, perimetro);
        this.tipo=tipo;
    }
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String mostrarDatos(){
        return  "lados: "+lados+
                "\ncolor: "+color+
                "\narea: "+area+
                "\nperimetro: "+perimetro+
                "\nTipo: "+tipo; 
   } 
    
}
