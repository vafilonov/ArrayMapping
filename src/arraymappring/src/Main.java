package arraymappring.src;

import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        CallChain call = CallChainInterpreter.parseString(input);

    }

}