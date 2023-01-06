import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Thanos {
    public static void main(String[] args)  throws IOException {
        int x = 9999 * 9999999;
        System.out.println(x);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t;  i++) {
            String input = reader.readLine();
            String[] splitInput = input.split(" ");
            int initialPop = Integer.parseInt(splitInput[0]);
            int growthRate = Integer.parseInt(splitInput[1]);
            int foodSupply = Integer.parseInt(splitInput[2]);
            double newPop = (double)initialPop;
            int numYears = 0;
    
            while(newPop <= foodSupply) {
                numYears++;
                newPop = newPop * growthRate;
            }
    
            System.out.println(numYears);
        }
    }
}