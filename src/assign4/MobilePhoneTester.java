package assign4;

public class MobilePhoneTester {
    public static void main(String[] args) {
        MobilePhone samsung = new MobilePhone("Samsung galaxy", 1000, 500);
        samsung.installApplication("Google maps", 100);
        samsung.installApplication("Tinder", 200);
        samsung.installApplication("Pokemon GO", 250);
        samsung.use("YouTube", 5);
        samsung.use("Facebook", 6);
        samsung.use("Angry Birds", 2);
        samsung.charge();
        samsung.use("Angry Birds", 2);
    }
}
