package OOP_incapsulare;

import org.junit.Test;

public class masinaTest {



    @Test
    public void incapsulareTest(){
        Audi audiA6 = new Audi("Audi", "A6", 70000);
        System.out.println(audiA6.getPret());
        audiA6.setModel("A3");
        System.out.println(audiA6.getModel());
        audiA6.cumparaMasina();


    }
}
