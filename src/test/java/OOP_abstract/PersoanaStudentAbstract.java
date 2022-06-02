package OOP_abstract;

public class PersoanaStudentAbstract extends PersoanaAbstract{
    private String Nume;
    private String Prenume;
    private String Meserie;

    public PersoanaStudentAbstract(String nume, String prenume, String meserie) {
        Nume = nume;
        Prenume = prenume;
        Meserie = meserie;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public String getMeserie() {
        return Meserie;
    }

    public void setMeserie(String meserie) {
        Meserie = meserie;
    }


    @Override
    void Munceste() {

    }

    @Override
    void PrimesteSalar() {

    }

    @Override
    void Invata() {

    }

    @Override
    void PrimesteBursa() {

    }

    @Override
    void Someaza() {

    }

    @Override
    void PrimesteAjutor() {

    }
}
