package Exercitii;

public class Persoana {
    int persAge;
    String persName;

    public  Persoana(int years, String name) {
        persAge = years;
        persName = name;
    }

    public static void main(String[] args) {
        Persoana myPers = new Persoana(69, "Mustang");
        System.out.println(myPers.persAge + " " + myPers.persName);
    }
}


