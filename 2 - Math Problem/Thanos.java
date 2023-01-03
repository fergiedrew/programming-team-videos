import java.util.Scanner;

class Thanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t;  i++) {
            String input = scanner.nextLine();
            String[] splitInput = input.split(" ");
            int initialPop = Integer.parseInt(splitInput[0]);
            int growthRate = Integer.parseInt(splitInput[1]);
            int foodSupply = Integer.parseInt(splitInput[2]);
            int newPop = initialPop;
            int numYears = 0;
    
            while(newPop <= foodSupply) {
                numYears += 1;
                newPop *= growthRate;
            }
    
            System.out.println(numYears);
        }
    }
}