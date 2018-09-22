
package poliformismo;


public class Figura {
    
    public Figura( int lados, String color, int area, int perimetro){
        this.lados=lados;
        this.color=color;
        this.area=area;
        this.perimetro=perimetro;
    }

    
    protected int lados;
    protected String color;
    protected int area;
    protected int perimetro;

    public int getLados() {
        return lados;
    }
    public String getColor() {
        return color;
    }
    public int getArea() {
        return area;
    }
    public int getPerimetro() {
        return perimetro;
    }
    public void setLados(int lados) {
        this.lados = lados;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    
    public String mostrarDatos(){
        return  "lados: "+lados+
                "\ncolor: "+color+
                "\narea: "+area+
                "\nperimetro: "+perimetro; 
   } 
    
    
}
