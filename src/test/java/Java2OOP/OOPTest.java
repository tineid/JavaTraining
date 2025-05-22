package Java2OOP;

import org.junit.jupiter.api.Test;

public class OOPTest {

    @Test
    public void metodaTest(){

        Student Cristi = new Student("Pop", "Radu", 24, "UUB", "2", true);
        Cristi.infoStudent();

        Angajat Tudor = new Angajat( "Popescu", "Alin", 27, "Endava", 2, 25);
        Tudor.infoAngajat();
    }
}
