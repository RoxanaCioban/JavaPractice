package OOP_incapsulare;

import java.util.List;

public class Audi extends masina{

    public List<String> dotariInterioare;
    public List<String> dotariExterioare;


    public Audi(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }

    public void infoAudi(){
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getPret());
    }

    //suprascriem o metoda din clasa parinte

    @Override
    public void cumparaMasina(){
        System.out.println("Vreau sa cumpar Audi!");
        super.cumparaMasina();
    }

    //polimorfism static

    public void afiseazaMasini(){
        System.out.println("Nu avem masini");
    }
    public void afiseazaMasini(String brand){
        System.out.println("Nu avem masini");
    }
    public void afiseazaMasini(String brand, Integer an){
        System.out.println("Nu avem masini");
    }
    public void afiseazaMasini(Integer brand){
        System.out.println("Nu avem masini");
    }

    //polimorfism static la metode cu return

    public String getNume(){
        return "Nicu";
    }
    public String getNume(Integer varsta){
        return "Nicu";
    }
    public String getNume(String varsta){
        return "Nicu";
    }

    // polimorfismul static se poate aplica doar la metodele cu return care au parametri
    // Nu are nici o importanta numarul sau tipul parametrilor

}
