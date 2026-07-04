// OOP
    // Class and object -> Field data store | Constructor | main functons

class Student{
    String name;
    int age;
    String address;

    // Field -> Store data
    double salary;
    String first_name;
    String last_name;

    void info(){
            System.out.println(name+"is Studying...!");
    }
}


class Car{

    // Field
    String name;
    String brand;
    String model;

            // constructor
        Car(String name, String brand, String model){
                this.name = name;
                this.brand = brand;
                this.model = model;
        }

        // Methods -> object can data working into here
            void speed(){
                System.out.println(name+"have speed 10000sm");
            }



            void driver(){
                System.out.println("People can driver greater than 18 year old ....!");
            }

        void sound(){
                System.out.println(name+"Making a sound...!");
        }
}

public class Main {
    public static void main(String[] args) {
            // call class and object
            Student st = new Student();

            // call object to variable
                st.name = "Un virak";
                st.address = "Phnom Penh";
                st.age = 22;

                st.info();

                Car c = new Car("Mazda", "LeapMotor", "American");

                c.sound();

                c.speed();
                c.driver();



    }


}
