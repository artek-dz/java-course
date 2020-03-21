package assign2;

public class Swap {
    public static void main(String[] args) {
        int[] numbersArray = {10, 20};
        int[] swappedArray = new int[2];
        for (int i = 0; i < 2; i++) {
            swappedArray[i]=numbersArray[(i + 1) % 2];
        }
        System.out.println("numbersArray = {" + numbersArray[0] + ", " + numbersArray[1] + "}");
        System.out.println("swappedArray = {" + swappedArray[0] + ", " + swappedArray[1] + "}");
    }
}
