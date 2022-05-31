package Tema;

import org.junit.Test;

/*Practice - project

        a) Variables

        EXERCISES

        Clasa noua creeata
        Afiseaza pe ecran urmatoarele:
        PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI

        - Hello World
        - Varsta ta (numar)
        - Numele si prenumele pe 2 randuri
        - (Tot) Care ii data de astazi?
        1/13/2019
        18:30 PM
        Marti/Joi
        - Cat face [2+(3*4)-3]/3 ?
        Rezultatul corect este: {rezultatul}
        - afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj
        - afiseaza pe ecran produsu a 2 numere integer intr-o variabila de acelasi tip+mesaj
        - concateneaza la valoarile rezultate de mai sus mesajul "Stiu ca am calculat bine" si afiseaza-l pe ecran cu tot cu rezultatul calculului
        - Adauga la "Salut" caracterul "M" la final
        - Adauga la "Hello" caracterul "H" la inceput
        - Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z"
        - Comenteaza cerinta 2 4 6
        - Decomenteaza cerintele comentate
        - Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"

 */

public class tema1 {


    @Test
    public void Executare(){
        Cerinta1();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        Cerinta2();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        Cerinta3();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        Cerinta4();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        System.out.println(Cerinta5());
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        Cerinta6();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        Cerinta7();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        Cerinta8();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        Cerinta9();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        Cerinta10();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }

    public void Cerinta1(){
        System.out.println("Hello World");
    }
    public void Cerinta2(){
        Integer Varsta = 33;
        System.out.println("Eu am " + Varsta + " de ani.");
    }

    public void Cerinta3(){
        String Nume = "Cioban";
        String Prenume = "Roxana";
        System.out.println("Nume: " + Nume);
        System.out.println("Prenume: " + Prenume);
    }

    public void Cerinta4(){
        System.out.println("Care ii data de astazi?");
        System.out.println("1/13/2019");
        System.out.println("18:30 PM");
        System.out.println("marti/joi");
    }

    public String Cerinta5(){
        Integer rezultatul = (2+(3*4)-3)/3;
        String r = "Rezultatul corect este: " + rezultatul + ". " + "Stiu ca am calculat bine!";
        return r;
    }
    public void Cerinta6(){
        double a=15.79;
        double b=22.18;
        double c=3.5;
        double sum = a+b+c;
        System.out.println("Suma a 3 numere de tip double este: " + sum + ". " + "Stiu ca am calculat bine!");
    }
    public void Cerinta7(){
        Integer a = 58;
        Integer b = 44;
        Integer sum = a+b;
        System.out.println("Suma celor doua numere intregi este: " +sum + ". " + "Stiu ca am calculat bine!");
    }
    public void Cerinta8(){
        String polite = "Salut";
        System.out.println(polite + 'M');
    }

    public void Cerinta9(){
        String polite = "Hello";
        System.out.println(polite + 'H');
    }
    public void Cerinta10(){
        System.out.println("Ana" + 'Z' +  " are" + 'Z'+ " mere" + 'Z' + ", pere" + 'Z' + ", prune" + 'Z');
    }
}
