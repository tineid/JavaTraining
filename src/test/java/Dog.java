public class Dog {
    String dogName;
    String dogBreed;

    public Dog(String name, String breed) {
        dogName= name;
        dogBreed= breed;

    }
    public String getName() {
        return dogName;
    }
    public String getDogBreed() {
        return dogBreed;
    }

    public void setName(String dogName){
        this.dogName=dogName;
    }
    public void setBreed(String dogBreed){
        this.dogBreed=dogBreed;
    }
}

