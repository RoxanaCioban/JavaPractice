package OOP_mostenire;

import java.security.PublicKey;

public class Sport {
    public String Nume;
    public String Denumire;
    public Boolean esteEchipa;
    public Integer NrMembri;

    public Sport(String nume, String denumire, boolean esteEchipa, Integer nrMembri) {
        Nume = nume;
        Denumire = denumire;
        this.esteEchipa = esteEchipa;
        NrMembri = nrMembri;
    }
    //OOP mostenire = principiul pe baza caruia clasa parinte poate sa fie mostenita de n clase copii
    //exemplu: casa bunicilor cu nepotii
    //in java putem mosteni o singura clasa
    //in momentul in care clasa copil mosteneste clasa parinte trebuie sa apelam constructorul din clasa parinte
    public void InfoSport(){
        System.out.println(Nume);
        System.out.println(Denumire);
        System.out.println(esteEchipa);
        System.out.println(NrMembri);
    }

}

