package OOP_incapsulare;

public class Jaguar extends masina{
    public Jaguar(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }



    @Override
    public void cumparaMasina(){
        System.out.println("Vreau sa cumpar Jaguar.");
        super.cumparaMasina();
    }
}
