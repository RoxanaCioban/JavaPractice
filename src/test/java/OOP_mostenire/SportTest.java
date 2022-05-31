package OOP_mostenire;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SportTest {
    @Test
    public void mostenireTest(){
        //facem primul obiect(copil) pentru fotbal
        List<String> reguliFotbal = new ArrayList<>();
        reguliFotbal.add("Nu ai voie sa atingi mingea cu mana");
        reguliFotbal.add("Nu ai voie sa faci fault");
        reguliFotbal.add("Nu ai voie sa iti dai tricou jos");


       fotbal fotbalSport = new fotbal("Fotbal","Sport de echipa"
               , true, 11, true, 3,reguliFotbal);

      fotbalSport.InfoFotbal();
      fotbalSport.InfoSport();
    }
}
