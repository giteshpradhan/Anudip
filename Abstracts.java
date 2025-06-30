abstract class Animal{
    abstract void walk();
    void eat (){

        System.out.println("animal can eat");
    }
}
class Dog extends Animal{
    void walk(){
        System.out.println("my extended");
    }
}
public class abstracts{
    public static void main(String[] args){
        Dog d = new Dog ();
        d.walk();
        d.eat();

    }
}
