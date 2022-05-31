package multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Obiect {


    @Test
    public void Obiect(){
        //array toate elemente sunt de acelasi tip
        //list
        //hashmap
        PrintNumeArray();
        PrintNumeLista();
        printValoriHashmap();
        TariOrase();
    }

    //printam toate valorile dintr-un array
    public void PrintNumeArray(){
        String[] Nume = new String[4];
        Nume[0]="Ana";
        Nume[1]="Alex";
        Nume[2]="Bogdan";
        Nume[3]="Maria";

        for (Integer index = 0; index<Nume.length; index++){
            System.out.println(Nume[index]);
        }
    }

    //printeaza lista
    public void PrintNumeLista(){
        List<String> Lista = new ArrayList<>();
        Lista.add("Ana");
        Lista.add("Alex");
        Lista.add("Bogdan");
        Lista.add("Rares");
        for (Integer index=0; index<Lista.size(); index++){
            System.out.println(Lista.get(index));
        }
    }
    //printeaza valori diferite dintr-o multime

    public void printValoriHashmap(){
        HashMap<String, String> HHBB = new HashMap<>();
        HHBB.put("fruct", "mar");
        HHBB.put("haina", "pantalon");
        HHBB.put("leguma", "cartof");
        for (String key: HHBB.keySet()){
            System.out.println("cheia este " + key);
            System.out.println("valoarea este " + HHBB.get(key));
        }
    }

    public void TariOrase(){
        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Dej");
        OraseRomania.add("Gherla");
        OraseRomania.add("Huedin");
        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Torina");
        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("Valencia");
        OraseSpania.add("Malaga");
        HashMap<String, List<String>> HMAP = new HashMap<>();
        HMAP.put("Romania", OraseRomania);
        HMAP.put("Italia", OraseItalia);
        HMAP.put("Spania", OraseSpania);
        for (String key: HMAP.keySet()){
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + HMAP.get(key));
        }

    }
}
