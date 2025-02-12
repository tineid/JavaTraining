//public class Tema {


   /* public static void ariaPatratului() {
        int lat = 10;
        int ariaPatratului;
        ariaPatratului = lat * lat;
        System.out.println("Aria patratului este:" + ariaPatratului);
    }





    public static void FvsC() {
        int F = 69;
        double C;
        C = (F-32)/1.8;
        System.out.println("In grade C, " + F + " grade F inseamna:" + C+ " grade C");

    }

    public static void GoOut() {
        boolean isSunny = true;
        boolean isWarm = false;
        boolean isRainy = false;
        boolean shouldGoOut;

        shouldGoOut = (isSunny && isWarm || isRainy && isWarm);
        System.out.println("Should I go out: " + shouldGoOut);
    }
    public static void Concat() {
        char letter = 'p';
        String name = "op-u";

        System.out.println("The word is: " + letter+name+letter);
    }
    public static void LeapYear() {
        int year = 2022;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void Swch() {
        String colour;
        colour = "blue";
        switch (colour) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("prepare to..");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Careful, the traffic light is not working! ");
                break;
        }
    }
    public static class Person {
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }

        public static void main(String[] args) {
            Person myObj = new Person();
            myObj.setName("John");
            System.out.println(myObj.getName());
        }

 /*   public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
//{ {1, 2, 3, 4}
//  {5, 6, 7} }
         /*   public static void main( String[] args) {


             ariaPatratului();
            FvsC();
            GoOut();
            Concat();
            LeapYear();
            Swch();


          Employee firstEmployee = new Employee();
         firstEmployee.setSalariu(1000);
       System.out.println(firstEmployee.getSalariu());

        }

          */


  //  }