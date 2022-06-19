public class Pracownicy extends Indeks implements InterfaceOsoby{
    Pracownicy(){
        this.osobaX = generator.nextInt(10);
        this.osobaY = generator.nextInt(10);
    }
    // zmienne przechowujace pozycje osob
    private int osobaX;
    private int osobaY;
    // gettery
    public int getOsobaX() {

        return osobaX;
    }
    public int getOsobaY() {

        return osobaY;
    }
    // settery
    public void setOsobaX(int X) {
        this.osobaX = this.osobaX+X;
        if (this.osobaX > 10)
            this.osobaX = 0;
        if (this.osobaX < 0)
            this.osobaX = 10;
    }

    public void setOsobaY(int Y) {
        this.osobaY = this.osobaY+Y;
        if (this.osobaY > 10)
            this.osobaY = 0;
        if (this.osobaY < 0)
            this.osobaY = 10;
    }
    // Rozmieszczanie studenta na mapie
    public void rozmieszczanie(){
        boolean bool1, bool2;
        //bool1- wybor czy zmiana polozenia ma dotyczyc wartosci x czy y
        //bool2- wybor czy zmiana wartosci wynosic +1 czy -1
        bool1 = generator.nextBoolean();
        bool2 = generator.nextBoolean();
        if (bool1){
            if (bool2) setOsobaX(1);
            else setOsobaX(-1);
        }
        else{
            if (bool2) setOsobaY(1);
            else setOsobaY(-1);
        }
    }

    // Zmiana progow
    int zmienProgi(){
        int x = generator.nextInt(8);
            return x;
}
}
