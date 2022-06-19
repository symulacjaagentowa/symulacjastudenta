import java.util.Random;

public class Punkty_wiedzy extends Pracownicy{
    Punkty_wiedzy(){
        this.punkty_wiedzy = generator.nextInt(10);
        this.punkty_wiedzyX = generator.nextInt(10);
        this.punkty_wiedzyY = generator.nextInt(10);
    }
    // Usuwanie zdobytych punktow wiedzy z mapy
    void usunObiekt(){
        this.punkty_wiedzyX=-1;
        this.punkty_wiedzyY=-1;
    }

    private int punkty_wiedzy;
    private int punkty_wiedzyX;
    private int punkty_wiedzyY;
    // gettery
    int getPunkty_wiedzyX(){
        return this.punkty_wiedzyX;
    }

    int getPunkty_wiedzyY(){
        return this.punkty_wiedzyY;
    }

    int getPunkty_wiedzy() {
        return punkty_wiedzy;
    }
    // settery
    void setPunkty_wiedzy(int punkty_wiedzy) {
        this.punkty_wiedzy = punkty_wiedzy;
    }
}
