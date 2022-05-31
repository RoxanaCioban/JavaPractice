package ObiectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    //obiect = instanta unei clase
    //obiectul este strict legat de constructor
    //dintr-o clasa putem declara n obiecte
    //obiectele se diferentiaza pe baza numelui
    //structura obiect: nume clasa + nume obiect = new nume clasa(valori paramentri)
    //recunoastem un obiectul dupa cuvantul "new"


    public StudentTest() {
    }

    @Test
    public void MetodaTest(){
        //primul obiect
        List<Integer> noteRomanaRoxana = new ArrayList<>();
        noteRomanaRoxana.add(5);
        noteRomanaRoxana.add(5);
        noteRomanaRoxana.add(5);
        List<Integer> noteMatematicaRoxana = new ArrayList<>();
        noteMatematicaRoxana.add(8);
        noteMatematicaRoxana.add(5);
        noteMatematicaRoxana.add(9);
        noteMatematicaRoxana.add(2);
        Student CiobanRoxana = new Student("Cioban", "Roxana", 33, 1.70, 'F', true, noteMatematicaRoxana, noteRomanaRoxana);
        CiobanRoxana.InfoStudent();
        CiobanRoxana.InfoNote("romana");
        CiobanRoxana.InfoNote("matematica");
        CiobanRoxana.Prenume = "Camelia";
        CiobanRoxana.InfoStudent();

        List<Integer> noteRomanaAlex = new ArrayList<>();
        noteRomanaAlex.add(5);
        noteRomanaAlex.add(9);
        noteRomanaAlex.add(10);
        List<Integer> noteMatematicaAlex = new ArrayList<>();
        noteMatematicaAlex.add(8);
        noteMatematicaAlex.add(9);
        noteMatematicaAlex.add(9);
        noteMatematicaAlex.add(7);
        Student DorhaAlex = new Student("Dorha", "Alex", 27, 1.80, 'M', true, noteMatematicaAlex, noteRomanaAlex);
        DorhaAlex.InfoStudent();
        DorhaAlex.InfoNote("matematica");
        DorhaAlex.InfoNote("romana");

        List<Integer> noteMatematicaClaudiu = new ArrayList<>();
        noteMatematicaClaudiu.add(8);
        noteMatematicaClaudiu.add(9);
        noteMatematicaClaudiu.add(9);
        noteMatematicaClaudiu.add(7);
        Student PopClaudiu = new Student("Pop", "Claudiu", 27, 1.80, 'M', true, noteMatematicaClaudiu);
        PopClaudiu.InfoStudent();
        PopClaudiu.InfoNote("matematica");


        List<Integer> noteMatematicaJuji = new ArrayList<>();
        noteMatematicaJuji.add(9);
        noteMatematicaJuji.add(6);
        noteMatematicaJuji.add(5);
        List<Integer> noteRomanaJuji = new ArrayList<>();
        noteRomanaJuji.add(7);
        noteRomanaJuji.add(7);
        noteRomanaJuji.add(7);
        List<Integer> noteMaghiaraJuji = new ArrayList<>();
        noteMaghiaraJuji.add(8);
        noteMaghiaraJuji.add(8);
        noteMaghiaraJuji.add(8);
        Student Juji = new Student("Csilla", "Juji", 27, 1.80, 'F', true, noteMatematicaJuji, noteRomanaJuji, noteMaghiaraJuji);
        Juji.InfoStudent();
        Juji.InfoNote("maghiara");
        Juji.CalculMedie("matematica");
        Juji.CalculMedie("maghiara");
        Juji.CalculMedie("romana");



    }

    //declaram un obiect pentru al doilea constructor

}
