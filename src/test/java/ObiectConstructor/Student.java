package ObiectConstructor;

import org.checkerframework.checker.units.qual.C;

import java.util.List;

public class Student {
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public Double Inaltime;
    public Character Sex;
    public Boolean areBursa;
    public List<Integer> noteMatematica;
    public List<Integer> noteRomana;
    public List<Integer> noteMaghiara;

    //obiect = instanta unei clase
    //constructor = are ca rol sa initializze variabilele unei clase
    //tipuri constructor = constructor cu parametri si fara parametri
    // by default avem un constructor fara parametri in orice clasa
    //intr-o clasa putem avea n constructori
    // structura constructor: public numele Clasei(are sau nu parametri)
    //nu exista constructor cu return

    public Student(String Nume, String Prenume, Integer Varsta, Double Inaltime, Character Sex, Boolean areBursa, List<Integer> noteMatematica, List<Integer> noteRomana) {
        this.Nume = Nume;
        this.Prenume = Prenume;
        this.Varsta = Varsta;
        this.Inaltime = Inaltime;
        this.Sex = Sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
    }
    //facem un alt construct doar cu MAtematica


    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa, List<Integer> noteMatematica) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
    }

    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa, List<Integer> noteMatematica, List<Integer> noteRomana, List<Integer> noteMaghiara) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
        this.noteMaghiara = noteMaghiara;
    }

    public void InfoStudent() {
        System.out.println(" Numele studentului este: " + Nume);
        System.out.println(" Prenumele studentului este: " + Prenume);
        System.out.println(" Varsta studentului este: " + Varsta);
        System.out.println(" Inaltimea studentului este: " + Inaltime);
        System.out.println(" Sexul studentului este: " + Sex);
        System.out.println(" Are bursa studentul? " + areBursa);
    }

    public void InfoNote(String Materie) {
        if (Materie.equals("romana") || Materie.equals("ROMANA")) {
            System.out.println("Notele studentului la romana sunt urmatoarele: ");
            PrintNoteLista(noteRomana);
        }
        if(Materie.equals("matematica")||Materie.equals("MATEMATICA")) {
        System.out.println("Notele studentului la matematica sunt urmatoarele: ");
        PrintNoteLista(noteMatematica);
        }
        if (Materie.equals("maghiara") || Materie.equals("MAGHIARA")) {
            System.out.println("Notele studentului la maghiara sunt urmatoarele: ");
            PrintNoteLista(noteMaghiara);
            }
        }

    public void PrintNoteLista(List<Integer> note){
        for (Integer index = 0; index < note.size(); index++) {
            System.out.println(note.get(index));
        }
    }

    public void CalculMedie(String Materie) {
        if (Materie.equals("matematica") || Materie.equals("MATEMATICA")) {
            System.out.print("Media studentului la matematica este: ");
            PrintCalculMedie(noteMatematica);
        }
        if (Materie.equals("romana") || Materie.equals("ROMANA")) {
            System.out.print("Media studentului la romana este: ");
            PrintCalculMedie(noteRomana);
        }
        if (Materie.equals("maghiara") || Materie.equals("MAGHIARA")) {
            System.out.print("Media studentului la maghiara este: ");
            PrintCalculMedie(noteMaghiara);
        }
    }
    public void PrintCalculMedie(List<Integer> note){
        double sum = 0;
        Integer nrelemente = note.size();
        for (Integer index = 0; index < note.size(); index++) {
            sum = sum + note.get(index);
        }
        double medie = sum/nrelemente;
        System.out.println(medie);
    }

}