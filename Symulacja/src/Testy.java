public class Testy extends Egzamin {

    // Pierwszy konstruktor dla egzaminu
    Testy(int x){
        this.testX = generator.nextInt(10);
        this.testY = generator.nextInt(10);
        prog = x;
    }
    // Drugi konstruktor dla kolokwium
    Testy(){
        this.testX = generator.nextInt(10);
        this.testY = generator.nextInt(10);
        prog = 9;
    }
    // Usuwanie zdanych egzaminow
    void usunObiekt(){
        this.testX=-1;
        this.testY=-1;
    }
    //Gettery
    int getTestX() {
        return this.testX;
    }

    int getTestY() {
        return this.testY;
    }

    private int testX;
    private int testY;
}
