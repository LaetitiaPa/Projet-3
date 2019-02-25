import java.util.Scanner;

    public class Menu {

        public static void displayGamesMenu() {
            Scanner input = new Scanner(System.in);
            System.out.println("Veuillez choisir un jeu: ");
            System.out.println(" 1- Plus ou Moins ");
            System.out.println(" 2- Mastermind ");

            int choice = input.nextInt();

            Game game = new Game();
            game.displayModeMenu();

            boolean bonChoix = true;

            while (bonChoix) {

                if (choice == 1) {
                    PlusMoins guess = new PlusMoins();
                    guess.displayModeMenu();

                } else if (choice == 2) {
                    Mastermind mastermind = new Mastermind();
                    mastermind.displayModeMenu();

                } else {

                    System.out.println("Erreur de saisi, veuillez ressaisir un nombre correct");
                    Scanner reader = new Scanner(System.in);
                    choice = reader.nextInt();

                }

            }
        }

    }