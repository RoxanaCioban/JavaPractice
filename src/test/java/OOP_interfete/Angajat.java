package OOP_interfete;

public interface Angajat {

    //interfata contine doar metode abstracte (se defineste tipul metodei fara sa contina body)
    //interfata se recunoaste dupa cuvantul "interface"
    // poate sa contina variabile
    // interfata nu se mosteneste ci se implementeaza
    //clasa care implementeaza interfata trebuie sa implementeze toate metodele interfetei
    //o clasa poate sa implementeze mai multe interfete
    //o clasa abstracta poate sa implementeze o interfata
    // o interfata nu contine un constructor deci nu putem declara obiecte

    void Munceste();
    void PrimesteSalar();
}
