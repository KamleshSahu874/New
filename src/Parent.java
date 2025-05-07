import java.util.concurrent.Callable;

public class Parent {
    void eat(){
        System.out.println("magggieee");
    }
}
class Child extends Parent{
    int a=5;
    void eat(){
        System.out.println("pastaaa");
    }
}
class Hello{
    public static void main(String[] args) {
 Parent p=new Parent();
 p.eat();
        Child c = new Child();
        c.eat();
        System.out.println("Value of a: " + c.a);

        Parent ref = new Child();
        ref.eat();


    }
}