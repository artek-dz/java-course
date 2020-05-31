package assign6;

public class BeerTester {

    public static void main(String[] args) {
        Beer prazdroj = new Beer("Plzeňský prazdroj", "pale lager", 12.00, 330);
        System.out.println(prazdroj);
        System.out.println(prazdroj.hashCode());

        Beer gambrinus = new Beer("Gambrinus Unpasteurized", "unpasteurised pale lager", 4.3, 500);
        System.out.println(gambrinus);
        System.out.println(gambrinus.hashCode());

        System.out.println("Are equal? " + prazdroj.equals(gambrinus));
        System.out.println("Same hashCodes? " + (prazdroj.hashCode() == gambrinus.hashCode()));

        Beer urquelle = new Beer("Plzeňský prazdroj", "pale lager", 12.002, 330);
        System.out.println(urquelle);
        System.out.println(urquelle.hashCode());

        System.out.println("Are equal? " + prazdroj.equals(urquelle));
        System.out.println("Same hashCodes? " + (prazdroj.hashCode() == urquelle.hashCode()));

        Beer gambrinus2 = new Beer("Gambrinus Unpasteurized", "unpasteurised pale lager", 4.3, 350);
        System.out.println(gambrinus2);
        System.out.println(gambrinus2.hashCode());

        System.out.println("Are equal? " + gambrinus2.equals(gambrinus));
        System.out.println("Same hashCodes? " + (gambrinus2.hashCode() == gambrinus.hashCode()));
    }
}
