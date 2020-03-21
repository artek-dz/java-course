package assign2;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        String trafficLightColor;
        System.out.println("What's the trafic light?");
        Scanner input = new Scanner(System.in);
        trafficLightColor = input.nextLine().toLowerCase();

        switch (trafficLightColor) {
            case "green" : {
                System.out.println("Go!");
                break;
            }
            case "red + yellow" : {
                System.out.println("Get ready to go!");
                break;
            }
            default:
                System.out.println("Stop!");
 //               break;
        }
    }
}
