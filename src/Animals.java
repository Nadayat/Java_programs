
interface AnimalEat {
    void eat();
}
interface AnimalTravel extends AnimalEat {
    void travel();
}
class Animal implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void travel() {
        System.out.println("Animal is travelling");
    }
}
public class Animals {
    public static void main(String args[]) {
        AnimalTravel a = new Animal();
        a.eat();
        a.travel();
    }
}
