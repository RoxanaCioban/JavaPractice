package structuri;

import org.junit.Test;

public class algebra {

    @Test
    public void AlgebraTest(){
        PrinteazaNumere();
        PrinteazanrWhile();
        PrinteazaPar(100);


    }

    //printam primele 50 de numere
    // for are nr finit de pasi
    // while are un nr infinit de pasi
    public void PrinteazaNumere(){
        for (Integer index = 0; index < 51; index++){
            System.out.println(index);
        }
    }
    public void PrinteazanrWhile(){
        Integer index = 0;
        while (index<51){
            System.out.println(index);
            index++;
        }
    }

    // printeaza numerele pare de la 0 pana la un numar
    public void PrinteazaPar(Integer capat){
        for(Integer index=0; index<capat; index++){
            if (index%2==0){
                System.out.println(index);
            }
        }

    }
}
