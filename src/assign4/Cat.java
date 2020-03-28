package assign4;

public class Cat {
    private final String name;
    private boolean isHungry;

    public Cat(String name) {
        this.name = name;
        this.isHungry = true;
    }

    public void isHungry() {
        if (isHungry) {
            System.out.println(name + " is hungry");
        } else {
            System.out.println(name + " is not hungry");
        }
    }

    public void eat(String food) {
        if (isHungry) {
            System.out.println(name + " is eating " + food);
            isHungry = false;
        } else {
            System.out.println(name + " is not hungry");
        }
    }

    public void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }

    public void sleep(int hours) {
        System.out.format(name + " is going to sleep for %d hours\n", hours);
        isHungry = true;
    }
}
