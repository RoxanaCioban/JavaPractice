package OOP_interfete;

import org.junit.Test;

public class InterfataTest {

    @Test
    public void metodaInterfata(){

        //Persoana angajat
        PersoanaAngajat persoanaAngajat = new PersoanaAngajat("Nume1", "Prenume1", "Angajat");
        persoanaAngajat.Munceste();
        persoanaAngajat.PrimesteSalar();

        // persoana student
        PersoanaStudent persoanaStudent = new PersoanaStudent("Nume2", "Prenume2", "student");
        persoanaStudent.Invata();
        persoanaStudent.PrimesteBursa();

        //persoana angajat-student
        PersoanaStudentAngajat persoanaStudentAngajat = new PersoanaStudentAngajat("Nume3", "Prenume3", "angajat-student");
        persoanaStudentAngajat.Invata();
        persoanaStudentAngajat.Munceste();
        persoanaStudentAngajat.PrimesteBursa();
        persoanaStudentAngajat.PrimesteSalar();
    }
}
