import java.util.ArrayList;

public class Indeks extends Testy {
    //Listy przechowyjace oceny
    ArrayList <Double> AnalizaMatematyczna = new ArrayList<>();
    ArrayList <Double> MatematykaDyskretna = new ArrayList<>();
    ArrayList <Double> Angielski = new ArrayList<>();
    ArrayList <Double> TeoriaSystemow = new ArrayList<>();
    ArrayList <Double> ProgramowanieObiektowe = new ArrayList<>();
    ArrayList <Double> Algebra = new ArrayList<>();

    //Drukowanie ocen
    void printIndeks(){
        System.out.println("Analiza Matematyczna kolokwia: " + AnalizaMatematyczna.get(0) + ", " + AnalizaMatematyczna.get(1));
        System.out.println("Analiza Matematyczna egzamin: " + AnalizaMatematyczna.get(2));

        System.out.println("Matematyka Dyskretna kolokwia: " + MatematykaDyskretna.get(0) + ", " + MatematykaDyskretna.get(1));
        System.out.println("Matematyka Dyskretna egzamin: " + MatematykaDyskretna.get(2));

        System.out.println("Angielski kolokwia: " + Angielski.get(0) + ", " + Angielski.get(1));
        System.out.println("Angielski egzamin: " + Angielski.get(2));

        System.out.println("Teoria Systemow kolokwia: " + TeoriaSystemow.get(0) + ", " + TeoriaSystemow.get(1));
        System.out.println("Teoria Systemow egzamin: " + TeoriaSystemow.get(2));

        System.out.println("Programowanie Obiektowe kolowia: " + ProgramowanieObiektowe.get(0) + ", " + ProgramowanieObiektowe.get(1));
        System.out.println("Programowanie Obiektowe egzamin: " + ProgramowanieObiektowe.get(2));

        System.out.println("Algebra kolokwia: " + Algebra.get(0) + ", " + Algebra.get(1));
        System.out.println("Algebra egzamin: " + Algebra.get(2));
        }

    }



