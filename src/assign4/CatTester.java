package assign4;

public class CatTester {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        tom.eat("milk");
        tom.eat("mouse");
        tom.sleep(5);
        tom.isHungry();
        tom.eat("mouse");
        tom.isHungry();
        tom.play("ball");
    }
}
