public class Main {
    public static void main(String[] args) {
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        if (boxer1 > boxer2)
            System.out.println(boxer1 - boxer2);
            else
            System.out.println(boxer2 - boxer1);
            // задание 2
        double banan = 80;
        double moloko = 105;
        double iceCream = 100;
        double egg = 70;
        double breakfast = banan * 5 + moloko * 2 + iceCream * 2;
         breakfast = breakfast / 1000;
        System.out.println(breakfast + "kg");
        // задание 3
        double volume = 7 * 1000;
        double minLose = 250;
        double maxLose = 500;

        minLose = 250 ;
        maxLose = 500;
        double averageLose = (minLose + maxLose) / 2;
        System.out.println( volume / minLose + " дней если терять по 250 грамм" );
        System.out.println( volume / maxLose + " дней если терять по 500 грамм" );
        System.out.println( volume / averageLose + " дней при среднем значении потери грамм");
        // задание 4
        double masha = 67760;
        double denis = 83690;
        double kristina = 76230;
        double masha1 = masha + masha * 0.1;
        double denis1 = denis + denis * 0.1;
        double kristina1 = kristina + kristina * 0.1;
        double yearMasha = masha * 12;
        double yearDenis = denis * 12;
        double yearKristina = kristina * 12;
        double yearMasha1 = masha1 * 12;
        double yearDenis1 = denis1 * 12;
        double yearKristina1 = kristina1 * 12;
        System.out.println("маша будет получать " + masha1);
        System.out.println("денис  будет получать " + denis1);
        System.out.println("кристина будет получать " + kristina1);
        System.out.println("маша будет получать за год " + yearMasha1);
        System.out.println("денис будет получать за год " + yearDenis1);
        System.out.println("кристина будет получать за год " + yearKristina1);

















    }
}