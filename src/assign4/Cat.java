package assign4;

public class Cat {
    private final String name;
    private boolean hungry;

    public Cat(String name) {
        this.name = name;
        this.hungry = true;
    }

    public void isHungry() {
        if (hungry) {
            System.out.println(name + " is hungry");
        } else {
            System.out.println(name + " is not hungry");
        }
    }

    public void eat(String food) {
        if (hungry) {
            System.out.println(name + " is eating " + food);
            hungry = false;
        } else {
            System.out.println(name + " is not hungry");
        }
    }

    public void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }

    public void sleep(int hours) {
        System.out.format(name + " is going to sleep for %d hours\n", hours);
        hungry = true;
    }
}
