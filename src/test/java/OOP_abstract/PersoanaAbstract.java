package OOP_abstract;

public abstract class PersoanaAbstract {
    // abstractizare = conceptul pe baza caruia definim comportamentul unei clase
    // recunoastem o clasa abstracta dupa cuvantul "abstract"
    // clasa abstracta poate sau nu sa contina metode abstracte
    // o clasa poate sa extinda o clasa abstracta
    // o o clasa abstracta poate sa implementeze o interfata
    // poti sa mostenesti o singura clasa abstracta
    // clasa care mosteneste clasa abstracta =. implementeaza toate metodele abstracte
    // clasa abstracta poate sa contina un constructor =. nu poti creea obiecte

    abstract void Munceste();
    abstract void PrimesteSalar();
    abstract void Invata();
    abstract void PrimesteBursa();
    abstract void Someaza();
    abstract void PrimesteAjutor();

    public void VerificaVarsta(Integer varsta){
        if (varsta >= 18){
            System.out.println("Persoana este majora");
        }
        else {
            System.out.println("Persoana este minora");
        }
    }

}
