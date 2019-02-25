import java.util.Random;
import java.util.Scanner;

public class PlusMoins extends Game{

    public PlusMoins (int secretKey, int proposition, int response, int numTry) {
        super(secretKey, proposition, response, numTry);
    }

    public PlusMoins() {

    }

    public static void initGameMode1() {

        Scanner reader = new Scanner(System.in);

        Random rand   = new Random();
        int solution_ =	rand.nextInt(8999);
        solution_ += 1000;

        String solution__ = Integer.toString(solution_);
        String[] solution = solution__.split("");

        int length = solution.length;
        String answer = "";
        String[] proposition;

        while(answer != "====") {

            answer = "";

            System.out.println("A vous de jouer !");

            int n = reader.nextInt();

            proposition = Integer.toString(n).split("");

            for(int i = 0; i < length; i++){

                if (solution[i] == proposition[i]) {
                    answer += "=";
                } else if (Integer.parseInt(solution[i]) > Integer.parseInt(proposition[i])) {
                    answer += "-";
                } else if (Integer.parseInt(solution[i]) < Integer.parseInt(proposition[i])) {
                    answer += "+";
                } else
                    System.out.println("erreur de saisie de caractere ");


            }

            System.out.println(answer);
        }

        System.out.println("Bravo !!");


    }

    @Override
    public void displayModeMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez choisir un mode: ");
        System.out.println("1- Challenger : ");
        System.out.println("2- Défenseur :  ");
        System.out.println("3- Duel : ");
        int choice = input.nextInt();

        switch(choice){
            case 1:
                PlusMoins game = new PlusMoins();
                game.initGameMode1();
        }

    }
}

