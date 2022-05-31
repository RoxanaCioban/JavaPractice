package structuri;

import org.junit.Test;

import java.time.temporal.TemporalUnit;

public class matematica {

    //structuri = alternative si repetitive
    // structuri alternative = if.....then....else sau switch...case

    @Test
    public void MatematicaTest() {
        numarMaiMareCa20();
        numarPar();
        numarMaiMareCaUnNR(68, 18);
        numarMaiMareCaUnNR(5, 10);
        verificParitate(9);
        verificParitate(48);
        verificNumarImparDivizibil(5);
        verificNumarImparDivizibil(9);
        verificNumarImparDivizibil(10);
        verificNumarImparDivizibil(14);
        PrinteazaZi("Luni");
    }

    //verificam daca un numar este mai mare decat 20
    public void numarMaiMareCa20() {
        if (38 > 20) {
            System.out.println("Numarul 38 este mai mare decat 20");
        } else {
            System.out.println("Numarul 38 este mai mic decat 20");
        }
    }

    public void numarMaiMareCaUnNR(Integer Numar, Integer Comparatie) {
        if (Numar > Comparatie) {
            System.out.println("Numarul " + Numar + " este mai mare decat " + Comparatie);
        } else {
            System.out.println("Numarul " + Numar + " este mai mic decat " + Comparatie);
        }
    }


    //verificam daca un numar este par
    // "/" pentru cât
    // "%" pentru rest

    public void numarPar() {
        if (8 % 2 == 0) {
            System.out.println("Numarul este un numar par");
        } else {
            System.out.println("Numarul este un numar impar");
        }
    }

    public void verificParitate(Integer Number) {
        if (Number % 2 == 0) {
            System.out.println("Numarul " + Number + " este un numar par");
        } else {
            System.out.println("Numarul " + Number + " este un numar impar");
        }
    }


    //verific daca un numar este impar si divizibil cu 5

    public void verificNumarImparDivizibil(Integer Numar) {
        if (Numar % 2 == 1) {
            if (Numar % 5 == 0) {
                System.out.println(Numar + " este impar si divizibil cu 5");
            } else {
                System.out.println(Numar + " este impar dar nu este divizibil cu 5");
            }

        } else {
            if (Numar % 5 == 0) {
                System.out.println(Numar + " este par si divizibil cu 5");
            } else {
                System.out.println(Numar + " este par dar nu este divizibil cu 5");
            }
        }
    }


    //switch case pt zilele saptamanii
    public void PrinteazaZi(String ZiCurenta){
        switch (ZiCurenta){
            case "Duminica":
                System.out.println("Astazi este duminica");
                break;
            case "Luni":
                System.out.println("Astazi este luni");
                break;
            case "Marti":
                System.out.println("Astazi este marti");
                break;
            case "Miercuri":
                System.out.println("Astazi este miercuri");
                break;
            case "Joi":
                System.out.println("Astazi este joi");
                break;
            case "Vineri":
                System.out.println("Astazi este vineri");
                break;
            case "Sambata":
                System.out.println("Astazi este sambata");
                break;
        }

    }
}