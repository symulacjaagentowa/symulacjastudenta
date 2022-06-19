public class Student extends Punkty_wiedzy implements InterfaceOsoby {
    Student(){
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

        private int punkty_wiedzy=5;
    //dodawanie punktow wiedzy
    void add_punkty_wiedzy(int punkty_wiedzy){

        this.punkty_wiedzy = this.punkty_wiedzy +punkty_wiedzy;
    }
    //getter
    int getPunkty_wiedzy(){

        return this.punkty_wiedzy;
    }
    // metoda zwraca boolean aby po spelnieniu warunku w if() wywolac metode wystaw_ocene
    boolean sprawdz_czy_zdasz(int prog){
        if (this.punkty_wiedzy >= prog)
            return true;
        else return false;
    }
    // metoda zwraca wartosc, na ktora ma byc zmieniona ocena np. AnalizaMatematyczna.add = wystaw_ocene;
    double wystaw_ocene(int prog){
        double procenty = ((double)this.punkty_wiedzy)/((double)prog);
        procenty = procenty*100;
        if (procenty < 50) return 2;
        if (procenty >=50 && procenty < 60 ) return 3;
        if (procenty >=60 && procenty < 70 ) return 3.5;
        if (procenty >=70 && procenty < 80 ) return 4;
        if (procenty >=80 && procenty < 90 ) return 4.5;
        if (procenty >=90) return 5;
        else return 0;
    }

}
