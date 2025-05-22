package Java2OOP;

public class Persoana {
    //4 principii: mostenire, incapsulare, polimorfism, abstractizare
    //mostenire = conceptul prin care o clasa copil mosteneste o alta clasa (parinte)
    //in java putem mosteni o singura clasa
    //in mom in care o clasa mosteneste o alta clasa, clasa copil tr sa apeleze constructorul din parinte
    //in momentul in care se aplica mostenirea, copilul are vizibilitate asupra variabilelor/metodelor din parinte
    //constructorul din parinte n copil se apeleaza cu super

    public String nume;
    public String prenume;
    public Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana()
    {
        System.out.println("Numele este: " +nume);
        System.out.println("Prenumele este: " +prenume);
        System.out.println("Varsta este: " +varsta);

    }
}
