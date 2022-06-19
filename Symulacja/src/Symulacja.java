
public class Symulacja extends Mapa {
    public static void main(String[] args) {
        Indeks indeks = new Indeks();
        Testy k1AnalizaMatematyczna = new Testy();
        Testy k2AnalizaMatematyczna = new Testy();
        Testy k1MatematykaDyskretna = new Testy();
        Testy k2MatematykaDyskretna = new Testy();
        Testy k1Angielski = new Testy();
        Testy k2Angielski = new Testy();
        Testy k1TeoriaSystemow = new Testy();
        Testy k2TeoriaSystemow = new Testy();
        Testy k1ProgramowanieObiektowe = new Testy();
        Testy k2ProgramowanieObiektowe = new Testy();
        Testy k1Algebra = new Testy();
        Testy k2Algebra = new Testy();
        Testy eAnalizaMatematyczna = new Testy(7);
        Testy eMatematykaDyskretna = new Testy(7);
        Testy eAngielski = new Testy(7);
        Testy eTeoriaSystemow = new Testy(7);
        Testy eProgramowanieObiektowe = new Testy(7);
        Testy eAlgebra = new Testy(7);
        Student student = new Student();
        Pracownicy pracownik1 = new Pracownicy();
        Symulacja s = new Symulacja();
        Punkty_wiedzy punkt1 = new Punkty_wiedzy();
        Punkty_wiedzy punkt2 = new Punkty_wiedzy();
        Punkty_wiedzy punkt3 = new Punkty_wiedzy();
        Punkty_wiedzy punkt4 = new Punkty_wiedzy();
        Punkty_wiedzy punkt5 = new Punkty_wiedzy();
        Punkty_wiedzy punkt6 = new Punkty_wiedzy();
        Punkty_wiedzy punkt7 = new Punkty_wiedzy();
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int i = 0; i <= 350; i++) {


            //sprawdzanie pozycji pracownika i kolokwiów
            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k1AnalizaMatematyczna.getTestX(), pracownik1.getOsobaY(), k1AnalizaMatematyczna.getTestY())) {
                k1AnalizaMatematyczna.prog = s.zmienProgi();
            }
            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k2AnalizaMatematyczna.getTestX(), pracownik1.getOsobaY(), k2AnalizaMatematyczna.getTestY())) {
                k2AnalizaMatematyczna.prog = s.zmienProgi();
            }

            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k1MatematykaDyskretna.getTestX(), pracownik1.getOsobaY(), k1MatematykaDyskretna.getTestY())) {
                k1MatematykaDyskretna.prog = s.zmienProgi();
            }
            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k2MatematykaDyskretna.getTestX(), pracownik1.getOsobaY(), k2MatematykaDyskretna.getTestY())) {
                k2MatematykaDyskretna.prog = s.zmienProgi();
            }

            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k1Angielski.getTestX(), pracownik1.getOsobaY(), k1Angielski.getTestY())) {
                k1Angielski.prog = s.zmienProgi();
            }
            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k2Angielski.getTestX(), pracownik1.getOsobaY(), k2Angielski.getTestY())) {
                k2Angielski.prog = s.zmienProgi();
            }

            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k1TeoriaSystemow.getTestX(), pracownik1.getOsobaY(), k1TeoriaSystemow.getTestY())) {
                k1MatematykaDyskretna.prog = s.zmienProgi();
            }
            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k2TeoriaSystemow.getTestX(), pracownik1.getOsobaY(), k2TeoriaSystemow.getTestY())) {
                k2TeoriaSystemow.prog = s.zmienProgi();
            }

            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k1ProgramowanieObiektowe.getTestX(), pracownik1.getOsobaY(), k1ProgramowanieObiektowe.getTestY())) {
                k1ProgramowanieObiektowe.prog = s.zmienProgi();
            }
            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k2ProgramowanieObiektowe.getTestX(), pracownik1.getOsobaY(), k2ProgramowanieObiektowe.getTestY())) {
                k2ProgramowanieObiektowe.prog = s.zmienProgi();
            }

            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k1Algebra.getTestX(), pracownik1.getOsobaY(), k1Algebra.getTestY())) {
                k1Algebra.prog = s.zmienProgi();
            }
            if (s.sprawdzPozycje(pracownik1.getOsobaX(), k2Algebra.getTestX(), pracownik1.getOsobaY(), k2Algebra.getTestY())) {
                k2Algebra.prog = s.zmienProgi();
            }

            //sprawdzanie pozycji studenta i kolokwiów
            if (s.sprawdzPozycje(student.getOsobaX(), k1AnalizaMatematyczna.getTestX(), student.getOsobaY(), k1AnalizaMatematyczna.getTestY())) {
                indeks.AnalizaMatematyczna.add(s.wystaw_ocene(k1AnalizaMatematyczna.prog));
                a++;
                k1AnalizaMatematyczna.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), k2AnalizaMatematyczna.getTestX(), student.getOsobaY(), k2AnalizaMatematyczna.getTestY())) {
                indeks.AnalizaMatematyczna.add(s.wystaw_ocene(k2AnalizaMatematyczna.prog));
                a++;
                k2AnalizaMatematyczna.usunObiekt();
            }

            if (s.sprawdzPozycje(student.getOsobaX(), k1MatematykaDyskretna.getTestX(), student.getOsobaY(), k1MatematykaDyskretna.getTestY())) {
                indeks.MatematykaDyskretna.add(s.wystaw_ocene(k1MatematykaDyskretna.prog));
                b++;
                k1MatematykaDyskretna.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), k2MatematykaDyskretna.getTestX(), student.getOsobaY(), k2MatematykaDyskretna.getTestY())) {
                indeks.MatematykaDyskretna.add(s.wystaw_ocene(k2MatematykaDyskretna.prog));
                b++;
                k2MatematykaDyskretna.usunObiekt();
            }

            if (s.sprawdzPozycje(student.getOsobaX(), k1Angielski.getTestX(), student.getOsobaY(), k1Angielski.getTestY())) {
                indeks.Angielski.add(s.wystaw_ocene(k1Angielski.prog));
                c++;
                k1Angielski.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), k2Angielski.getTestX(), student.getOsobaY(), k2Angielski.getTestY())) {
                indeks.Angielski.add(s.wystaw_ocene(k2Angielski.prog));
                c++;
                k2Angielski.usunObiekt();
            }

            if (s.sprawdzPozycje(student.getOsobaX(), k1TeoriaSystemow.getTestX(), student.getOsobaY(), k1TeoriaSystemow.getTestY())) {
                indeks.TeoriaSystemow.add(s.wystaw_ocene(k1TeoriaSystemow.prog));
                d++;
                k1TeoriaSystemow.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), k2TeoriaSystemow.getTestX(), student.getOsobaY(), k2TeoriaSystemow.getTestY())) {
                indeks.TeoriaSystemow.add(s.wystaw_ocene(k2TeoriaSystemow.prog));
                d++;
                k2TeoriaSystemow.usunObiekt();
            }

            if (s.sprawdzPozycje(student.getOsobaX(), k1ProgramowanieObiektowe.getTestX(), student.getOsobaY(), k1ProgramowanieObiektowe.getTestY())) {
                indeks.ProgramowanieObiektowe.add(s.wystaw_ocene(k1ProgramowanieObiektowe.prog));
                e++;
                k1ProgramowanieObiektowe.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), k2ProgramowanieObiektowe.getTestX(), student.getOsobaY(), k2ProgramowanieObiektowe.getTestY())) {
                indeks.ProgramowanieObiektowe.add(s.wystaw_ocene(k2ProgramowanieObiektowe.prog));
                e++;
                k2ProgramowanieObiektowe.usunObiekt();
            }

            if (s.sprawdzPozycje(student.getOsobaX(), k1Algebra.getTestX(), student.getOsobaY(), k1Algebra.getTestY())) {
                indeks.Algebra.add(s.wystaw_ocene(k1Algebra.prog));
                f++;
                k1Algebra.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), k2Algebra.getTestX(), student.getOsobaY(), k2Algebra.getTestY())) {
                indeks.Algebra.add(s.wystaw_ocene(k2Algebra.prog));
                f++;
                k2Algebra.usunObiekt();
            }

            //Sprawdzanie pozycji studenta i punktow wiedzy
            if (s.sprawdzPozycje(student.getOsobaX(), punkt1.getPunkty_wiedzyX(), student.getOsobaY(), punkt1.getPunkty_wiedzyY())) {
                student.add_punkty_wiedzy(punkt1.getPunkty_wiedzy());
                punkt1.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), punkt2.getPunkty_wiedzyX(), student.getOsobaY(), punkt2.getPunkty_wiedzyY())) {
                student.add_punkty_wiedzy(punkt2.getPunkty_wiedzy());
                punkt2.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), punkt3.getPunkty_wiedzyX(), student.getOsobaY(), punkt3.getPunkty_wiedzyY())) {
                student.add_punkty_wiedzy(punkt3.getPunkty_wiedzy());
                punkt3.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), punkt4.getPunkty_wiedzyX(), student.getOsobaY(), punkt4.getPunkty_wiedzyY())) {
                student.add_punkty_wiedzy(punkt4.getPunkty_wiedzy());
                punkt4.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), punkt5.getPunkty_wiedzyX(), student.getOsobaY(), punkt5.getPunkty_wiedzyY())) {
                student.add_punkty_wiedzy(punkt5.getPunkty_wiedzy());
                punkt5.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), punkt6.getPunkty_wiedzyX(), student.getOsobaY(), punkt6.getPunkty_wiedzyY())) {
                student.add_punkty_wiedzy(punkt6.getPunkty_wiedzy());
                punkt6.usunObiekt();
            }
            if (s.sprawdzPozycje(student.getOsobaX(), punkt7.getPunkty_wiedzyX(), student.getOsobaY(), punkt7.getPunkty_wiedzyY())) {
                student.add_punkty_wiedzy(punkt7.getPunkty_wiedzy());
                punkt7.usunObiekt();
            }

            //Sprawdzanie pozycji studenta i egzaminow
            if (s.sprawdzPozycje(student.getOsobaX(), eAnalizaMatematyczna.getTestX(), student.getOsobaY(), eAnalizaMatematyczna.getTestY())) {
                if(indeks.AnalizaMatematyczna.size()<2){}
                else
                if (a == 2 && indeks.AnalizaMatematyczna.get(0) / 2 + indeks.AnalizaMatematyczna.get(1) / 2 >= 2.75) {
                    indeks.AnalizaMatematyczna.add(s.wystaw_ocene(eAnalizaMatematyczna.prog));
                    eAnalizaMatematyczna.usunObiekt();
                }
            }
            if (s.sprawdzPozycje(student.getOsobaX(), eMatematykaDyskretna.getTestX(), student.getOsobaY(), eMatematykaDyskretna.getTestY())) {
                if(indeks.MatematykaDyskretna.size()<2){}
                else
                if (b == 2 && indeks.MatematykaDyskretna.get(0) / 2 + indeks.MatematykaDyskretna.get(1) / 2 >= 2.75) {
                    indeks.MatematykaDyskretna.add(s.wystaw_ocene(eMatematykaDyskretna.prog));
                    eMatematykaDyskretna.usunObiekt();
                }
            }
            if (s.sprawdzPozycje(student.getOsobaX(), eAngielski.getTestX(), student.getOsobaY(), eAngielski.getTestY())) {
                if(indeks.Angielski.size()<2){}
                else
                if (c == 2 && indeks.Angielski.get(0) / 2 + indeks.Angielski.get(1) / 2 >= 2.75) {
                    indeks.Angielski.add(s.wystaw_ocene(eAngielski.prog));
                    eAngielski.usunObiekt();
                }
            }
            if (s.sprawdzPozycje(student.getOsobaX(), eTeoriaSystemow.getTestX(), student.getOsobaY(), eTeoriaSystemow.getTestY())) {
                if(indeks.TeoriaSystemow.size()<2){}
                else
                if (c == 2 && indeks.TeoriaSystemow.get(0) / 2 + indeks.TeoriaSystemow.get(1) / 2 >= 2.75) {
                    indeks.TeoriaSystemow.add(s.wystaw_ocene(eTeoriaSystemow.prog));
                    eTeoriaSystemow.usunObiekt();
                }
            }
            if (s.sprawdzPozycje(student.getOsobaX(), eProgramowanieObiektowe.getTestX(), student.getOsobaY(), eProgramowanieObiektowe.getTestY())) {
                if(indeks.ProgramowanieObiektowe.size()<2){}
                else
                if (c == 2 && indeks.ProgramowanieObiektowe.get(0) / 2 + indeks.ProgramowanieObiektowe.get(1) / 2 >= 2.75) {
                    indeks.ProgramowanieObiektowe.add(s.wystaw_ocene(eProgramowanieObiektowe.prog));
                    eProgramowanieObiektowe.usunObiekt();
                }
            }
            if (s.sprawdzPozycje(student.getOsobaX(), eAlgebra.getTestX(), student.getOsobaY(), eAlgebra.getTestY())) {
                if(indeks.Algebra.size()<2){}
                else
                if (c == 2 && indeks.Algebra.get(0) / 2 + indeks.Algebra.get(1) / 2 >= 2.75) {
                    indeks.Algebra.add(s.wystaw_ocene(eAngielski.prog));
                    eAlgebra.usunObiekt();
                }
            }
            student.rozmieszczanie();
            pracownik1.rozmieszczanie();
        }
        // wystawianie ocen niedostatecznych do egzaminow do ktorych student nie podszedl
        int x;
        x = indeks.AnalizaMatematyczna.size();
        if (x < 3){
            if (x == 0){
                indeks.AnalizaMatematyczna.add(2.0);
                indeks.AnalizaMatematyczna.add(2.0);
                indeks.AnalizaMatematyczna.add(2.0);
            }
            if (x == 1){
                indeks.AnalizaMatematyczna.add(2.0);
                indeks.AnalizaMatematyczna.add(2.0);
            }
            if (x == 2){
                indeks.AnalizaMatematyczna.add(2.0);
            }
        }
        x = indeks.MatematykaDyskretna.size();
        if (x < 3){
            if (x == 0){
                indeks.MatematykaDyskretna.add(2.0);
                indeks.MatematykaDyskretna.add(2.0);
                indeks.MatematykaDyskretna.add(2.0);
            }
            if (x == 1){
                indeks.MatematykaDyskretna.add(2.0);
                indeks.MatematykaDyskretna.add(2.0);
            }
            if (x == 2){
                indeks.MatematykaDyskretna.add(2.0);
            }
        }
        x = indeks.Angielski.size();
        if (x < 3){
            if (x == 0){
                indeks.Angielski.add(2.0);
                indeks.Angielski.add(2.0);
                indeks.Angielski.add(2.0);
            }
            if (x == 1){
                indeks.Angielski.add(2.0);
                indeks.Angielski.add(2.0);
            }
            if (x == 2){
                indeks.Angielski.add(2.0);
            }
        }
        x = indeks.TeoriaSystemow.size();
        if (x < 3){
            if (x == 0){
                indeks.TeoriaSystemow.add(2.0);
                indeks.TeoriaSystemow.add(2.0);
                indeks.TeoriaSystemow.add(2.0);
            }
            if (x == 1){
                indeks.TeoriaSystemow.add(2.0);
                indeks.TeoriaSystemow.add(2.0);
            }
            if (x == 2){
                indeks.TeoriaSystemow.add(2.0);
            }
        }
        x = indeks.ProgramowanieObiektowe.size();
        if (x < 3){
            if (x == 0){
                indeks.ProgramowanieObiektowe.add(2.0);
                indeks.ProgramowanieObiektowe.add(2.0);
                indeks.ProgramowanieObiektowe.add(2.0);
            }
            if (x == 1){
                indeks.ProgramowanieObiektowe.add(2.0);
                indeks.ProgramowanieObiektowe.add(2.0);
            }
            if (x == 2){
                indeks.ProgramowanieObiektowe.add(2.0);
            }
        }
        x = indeks.Algebra.size();
        if (x < 3){
            if (x == 0){
                indeks.Algebra.add(2.0);
                indeks.Algebra.add(2.0);
                indeks.Algebra.add(2.0);
            }
            if (x == 1){
                indeks.Algebra.add(2.0);
                indeks.Algebra.add(2.0);
            }
            if (x == 2){
                indeks.Algebra.add(2.0);
            }
        }
        indeks.printIndeks();
    }
        boolean sprawdzPozycje ( int X1, int X2, int Y1, int Y2){
            if (X1 == X2 && Y1 == Y2) {
                return true;
            } else return false;
        }
    }
