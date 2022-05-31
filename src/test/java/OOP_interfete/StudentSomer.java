package OOP_interfete;

public class StudentSomer extends PersoanaInterfata implements Student,Somer{


    public StudentSomer(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Someaza() {
        System.out.println("Studentul somer " + getNume() +" "+ getPrenume() + " someaza");

    }

    @Override
    public void PrimesteAjutor() {
        System.out.println("Studentul somer" + getNume() +" "+ getPrenume() + " primeste ajutor social");

    }

    @Override
    public void Invata() {
        System.out.println("Studentul somer" + getNume() +" "+ getPrenume() + " invata.");
    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Studentul somer" + getNume() +" "+ getPrenume() + " primeste bursa.");
    }
}
