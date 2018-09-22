
package poliformismo;


public class Circulo extends Figura {
    
    public Circulo(int lados, String color, int area, int perimetro, int diametro, int radio){
        super(lados, color, area, perimetro);
        this.diametro=diametro;
        this.radio=radio;
    }
    
    private int diametro;
    private int radio;

    public int getDiametro() {
        return diametro;
    }
    public int getRadio() {
        return radio;
    }
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public String mostrarDatos(){
        return  "lados: "+lados+
                "\ncolor: "+color+
                "\narea: "+area+
                "\nperimetro: "+perimetro+
                "\nradio: "+ radio+
                "\ndiametro: "+ diametro; 
   }    
    
}
