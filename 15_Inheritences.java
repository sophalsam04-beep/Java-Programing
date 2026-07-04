// Inherienes that one class can call data memeber and methods member to other class

class Animal{
    void eat(){
        System.out.println("Animal make a sound...!");
    }
}

class Bird extends Animal{
        void bark(){
            System.out.println("Bird sound jib jib....!");
        }

}

class Rooster extends Animal{
        void bark(){
            System.out.println("Rooster sound kok kok...!");
        }
}


class Manager{
        String name = "Un virak";

        void work(){
            System.out.println(name+"as Manageer working in Office...!");
        }
}


class SeniorMobileApps extends Manager{

    void work(){
        System.out.println(name+"as Senior Mobile Apps developer IT");
    }
}
public class Main {
    public static void main(String[] args) {
            // Inheritences in Java Programing


                System.out.println("\n-------Animal Inheritences-------");
                Bird b = new Bird();
                b.bark();

                Rooster r = new Rooster();
                r.bark();



                System.out.println("\n\n-------Manager Inheritences-------");
                Manager m = new Manager();

                SeniorMobileApps sA = new SeniorMobileApps();
                sA.work();
        m.work();



    }




}
