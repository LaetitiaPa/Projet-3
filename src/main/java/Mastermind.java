import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mastermind extends Game {

    public Mastermind(int secretKey, int proposition, int response, int numTry) {
        super(secretKey, proposition, response, numTry);
    }

    public Mastermind() {

    }

    public void initGameMode1() {

        Mastermind game = new Mastermind();

        System.out.println("Bienvenue sur le jeu Mastermind");




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
                Mastermind mastermind = new Mastermind();
                mastermind.initGameMode1();
        }

    }


}

