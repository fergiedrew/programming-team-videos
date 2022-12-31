import java.util.Scanner;

class Carrots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        int numContestants = Integer.parseInt(splitInput[0]);
        int numProblemsSolved = Integer.parseInt(splitInput[1]);
        for (int i = 0; i < numContestants; i++) {
            scanner.nextLine();
        }
        System.out.println(String.valueOf(numProblemsSolved));
    }
}