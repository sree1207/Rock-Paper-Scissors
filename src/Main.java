//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RPC obj = new RPC();
        Scanner sc = new Scanner(System.in);
        String playerChoice = sc.nextLine();
        String result =obj.playRockPaperScissor(playerChoice);
        String compC = obj.getComputerChoice();
        System.out.println("Computer choice is "+compC);
        System.out.println(result);

    }
}