package OOP_incapsulare;

public class masina {

    //incapsulare = conceptul prin care tinem departe de exterior valorile variabilelor
    //private = acces control care blocheaza valorile variabilelor sa fie vazute in afara clasei in care le-am declarat
    //ca sa vedem/modificam valorile folosim conceptul de get si set
    private String brand;
    private String model;
    private Integer pret;

    //polimorfism: dinamic si static
    //polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //polimorfismul static = mai multe metode cu acelasi nume se pot diferentia prin nr de parametri si tipul parametrilor
    //polimotrismul dinamic = over ride
    //polimotrismul static = over load
    //polimorfismul static nu se poate aplica la metodele cu return



    public masina(String brand, String model, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.pret = pret;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //definim o metoda pe care o vom suprascrie
    public void cumparaMasina(){
        System.out.println("Vreau sa cumpar masina.");

    }
}
