package variableMethod;

import org.junit.Test;

public class cursant {
    // acesta e un comentariu
    /*
    acesta este un altfel de comentariu
     */

    // class = o colectie de variabile si metode
    // intr-un fisier java putem avea mai multe clase
    // recunoastem o clasa dupa cuvantul cheie "class"
    // structura clasa = public + class + nume + {}
    // orice structura invatam trebuie scrisa in interiorul unei clase (java)
    // variabila = atributul unei clase
    // o clasa poate avea n variabile sau deloc
    // tipuri variabile = globala si locala
    // o variabila trebuie sau nu sa primeasca o valoare
    // structura variabila globala = public + tip variabila (INT, string...) + nume
    // dam o valoare unei variabile cu semnul =
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Ocupatie;
    public Character Sex;
    public Double Inaltime;
    public Boolean esteAngajat;
    // metoda = actiunea unei clase
    // o clasa poate sa contina sau nu n metode
    // tipuri metode : void si return
    // structura metoda void = public + void + NumeMetoda(){}
    // metodele pot sau nu sa contina parametri

    @Test
    public void AtribuireVariabile(){
        // dam valori pt variabilele de mai sus
        Nume = "Cioban";
        Prenume = "Roxana";
        Varsta = 33;
        Ocupatie = "economist";
        Sex = 'F';
        Inaltime = 1.70;
        esteAngajat = true;

        // printam o valoare in consola
        System.out.print(Nume);
        System.out.print(' ');
        System.out.print(Prenume);
        System.out.print(' ');
        System.out.print(Ocupatie);
        System.out.print(' ');
        System.out.print(Sex);
        System.out.print(' ');
        System.out.print(Inaltime);
        System.out.print(' ');
        System.out.println(esteAngajat);
        //print vs println
        // print = printeaza si ramane pe randul curent
        // println = printeaza si sare pe randul urmator
        printeazaNota();
        System.out.println(' ');
        promovareCurs();
        System.out.println(' ');
        System.out.println(getSalar());

    }

    // variabila locala =  tip variabila + nume

    public void printeazaNota(){
        Integer notaManual = 10;
        Integer notaAutomation = 10;
        System.out.print("Cursantul Cioban Roxana a luat notele:" + notaManual + "," + notaAutomation);



    }

    public void promovareCurs(){
        Boolean promovare = true;
        System.out.print("A promovat cursantul: " +Nume+ " " +Prenume+ "? ");
        System.out.print(promovare);
    }


    // metoda return = exprimare care contine "returneaza"
    // structura metoda return = public + tip de data + nume (){}
    // exista o conventie in java ca metodele cu return sa aiba in fata "get"
    // returnam salariu dorit

    public String getSalar(){
        Integer valueSalar = 10000;
        String s = valueSalar + " lei";
        return s;
    }


}
