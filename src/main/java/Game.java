import java.util.Scanner;

public class Game extends Menu {

    private int secretKey;
    private int proposition;
    private int response;
    private int numTry;

    public Game(int secretKey, int proposition, int response, int numTry) {
        this.secretKey = secretKey;
        this.proposition = proposition;
        this.response = response;
        this.numTry = numTry;
    }

    public Game() {

    }


    public int getSecretKey() {
        return secretKey;
    }

    public int getProposition() {
        return proposition;
    }

    public int getResponse() {
        return response;
    }

    public int getNumTry() {
        return numTry;
    }

    public void setSecretKey(int secretKey) {
        this.secretKey = secretKey;
    }

    public void setProposition(int proposition) {
        this.proposition = proposition;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public void setNumTry(int numTry) {
        this.numTry = numTry;
    }


    public void displayModeMenu(){

    }
}




