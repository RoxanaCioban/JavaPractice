package Tema;
/*JavaPractice - project

        b) Structures

        EXERCISES

        Clasa noua creeate
        Rezolvam urmatoarele:
        -Citim 3 numere cu valori diferite.Daca suma primelor 2 numere este mai mare decat al 3 lea numar afisam un mesaj corespunzator +valoarea sumei, altfel afisam contrariul
        -Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre
        -Problema de mai sus intr-un alt fel rezolvata
        -Primele 5 numere divizibile cu 3
        -Primele 3 numere dibizibile cu 5
        -Primele 4 numere pozitive si pare
        -Suma numerelor pana la 10
        -Produsul numerelor pana la 5
        -Problemele de mai sus le rescriem si in for/while in functie de ce abordare a avut fiecare

 */


import org.junit.Test;

public class tema2 {

    @Test
    public void Executare(){
        Cerinta1();
        Cerinta2();
        System.out.println("  ");
        Cerinta3();
        System.out.println("  ");
        Cerinta4();
        CerintaSum();
    }

    public void Cerinta1(){
        Integer nr1 = 58;
        Integer nr2 = 14;
        Integer nr3 = 77;
        if(nr1+nr2>nr3){
            System.out.println("Suma primelor doua numere este " + (nr1 + nr2) + " si este mai mare decat al treilea numar, respectiv " + nr3 + ".");
        }
        else {
            System.out.println("Suma primelor doua numere este " + (nr1 + nr2) + " si nu este mai mare decat al treilea numar, respectiv " + nr3 + ".");
        }
    }
    public void Cerinta2(){
        for (Integer index = 0; index < 5; index++){
            System.out.print("DA ");
        }
    }
    public void Cerinta3(){
        Integer index = 0;
        while(index<5){
            System.out.print("DA ");
            index++;
        }

    }
    public void Cerinta4() {
        for (Integer index = 1; index<15; index++){
            if (index%5==0){
                System.out.print(index + " ");
            }
        }
    }
    public void CerintaSum(){
        Integer sum = 0;
        for(Integer index = 1; index<10; index++){
            sum = sum + index;
        }
        System.out.println(sum);
    }
}
