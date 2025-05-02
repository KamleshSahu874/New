public class Animal {
    void eat() {
        System.out.println("eating");
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("bark");
        }

        class Puppy extends Dog {
            void lazy() {
                System.out.println("cutieeee");
            }
        }
    }

    public static void main(String[] args) {

        Animal outer = new Animal();
        Dog dog = outer.new Dog();
        Dog.Puppy puppy = dog.new Puppy();

        puppy.bark();
        puppy.eat();
        puppy.lazy();
    }
}






