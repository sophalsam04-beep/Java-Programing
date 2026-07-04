// MultiLevel Inheritence in Java Programing
// that one class that inherit from original class and three class inherit from two class


class Animal{
    void eat(){
        System.out.println("Animal eating food...!");
    }
}

class Dog extends Animal{
        void sleep(){
            System.out.println("Dog sleep well");
        }
}


class Cat extends Animal{
    void sound(){
        System.out.println("Cat sound meow meow");
    }
}


public class Main {
    public static void main(String[] args) {

        // MultiLevel Programing -> Alot of Inherited

        System.out.println("-----MultiLevel Inhertiences------");
                Cat c = new Cat();
                    c.sound();
                    c.eat();

        System.out.println("--------------------------------");

        }

}
