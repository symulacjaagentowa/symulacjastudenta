import java.util.Random;

public class Mapa extends Student{

    // zmienne rozmiaru mapy
    private int mapaX = 10;
    private int mapaY = 10;

    void setMapaX(int X, int Y){
        this.mapaX = X;
        this.mapaY = Y;
    }

    int getMapaX(){
        return this.mapaX;
    }
    int getMapaY(){
        return this.mapaY;
    }
}
