
package poliformismo;

public class Rectangulo extends Figura{
    
    public Rectangulo(int lados, String color, int area, int perimetro, int vertices){
        super(lados, color, area, perimetro);
        this.vertices=vertices;
    }
    
    private int vertices;

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }
    
    @Override
    public String mostrarDatos(){
        return  "lados: "+lados+
                "\ncolor: "+color+
                "\narea: "+area+
                "\nperimetro: "+perimetro+
                "\nvertices: "+vertices; 
   } 
    
}
