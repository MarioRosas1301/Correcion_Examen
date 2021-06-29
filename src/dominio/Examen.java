
package dominio;

public class Examen {
    private int punto=0;
    private int x=0;
    private int y=0;
    
    public Examen(int punto){
        this.punto=punto;
    }


    public int getPunto() {
        return punto;
    }   

    public void setPunto(int punto) {
        this.punto = punto;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
