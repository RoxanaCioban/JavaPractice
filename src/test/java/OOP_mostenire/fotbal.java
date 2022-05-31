package OOP_mostenire;

import java.util.List;

public class fotbal  extends Sport{

    public Boolean areCapitan;
    public Integer nrEchipamente;
    public List<String> Reguli;

    public fotbal(String nume, String denumire, Boolean esteEchipa, Integer nrMembri, Boolean Capitan, Integer NrEchipamente, List<String> Reguli) {
        super(nume, denumire, esteEchipa, nrMembri);
        this.areCapitan = areCapitan;
        this.nrEchipamente = NrEchipamente;
        this.Reguli = Reguli;
    }

    public void InfoFotbal(){
        System.out.println("Informatiile despre fotbal sunat: ");
        InfoSport();
        System.out.println(areCapitan);
        System.out.println(nrEchipamente);
        System.out.println(Reguli);
    }
}
