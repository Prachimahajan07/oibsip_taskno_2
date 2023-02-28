import java.util.Random;
import java.util.Scanner;

class Game{
    int number,inputNum;
    int noOfGuesses=0;

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public Game(){
        Random random = new Random();
        this.number = random.nextInt(100);

    }
    void takeUserInput(){
        System.out.println("Guesses the number");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(number==inputNum){
            System.out.println("Your guesses is correct:"+inputNum+" and you  find it it in "+noOfGuesses+" attempt");
            return true;
        }
        else if(number<inputNum){
            System.out.println("Your entered value is greater than number");
        }
        else if(number>inputNum){
            System.out.println("Your entered value is less than number ");
        }

        return false;
    }
}
public class CHW_43_Ex3 {
    public static void main(String[] args) {
        Game p1 = new Game();
        boolean b=false;
        while (!b) {
            p1.takeUserInput();
            b = p1.isCorrectNumber();
            System.out.println(b);
        }

    }
}