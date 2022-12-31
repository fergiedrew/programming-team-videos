import java.util.Scanner;

class Carrots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // "2 1"
        String[] splitInput = input.split(" "); // ["2", "1"]
        int numContestants = Integer.parseInt(splitInput[0]);

        for (int i = 0; i < numContestants; i++) {
            scanner.nextLine();
        }

        System.out.println(splitInput[1]);
    }

}