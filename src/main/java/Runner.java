import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class Runner {

    public static void main(String args[]){
        //Runner main = new Runner();
        Load load = new Load("input.txt", "assets"); 
        String input = load.readTheFile();
        Scanner scan = new Scanner(input);
        int total = 0;
        String test = "", line = "";
        int[] nums = new int[5];

        //Part 1
        while(scan.hasNextLine()){ 
            line = scan.nextLine(); 
            test = line.replaceAll("-", ",");
            for(int i = 0; i < 4; i++){
                nums[i] = Integer.parseInt(test.split(",")[i]);
            }

            if(nums[0] <= nums[2] && nums[1] >= nums[3]){
                total++;
            } else if(nums[2] <= nums[0] && nums[3] >= nums[1]){
                total++;
            }
        }

        System.out.println("Total contained ranges: " + total);

        //Part 2
        while(scan.hasNextLine()){ 
            line = scan.nextLine(); 
            test = line.replaceAll("-", ",");
            for(int i = 0; i < 4; i++){
                nums[i] = Integer.parseInt(test.split(",")[i]);
            }

            if(nums[0] <= nums[2] && nums[1] >= nums[3] || nums[1] >= nums[2] && nums[3] >= nums[0]){
                total++;
            } else if(nums[2] <= nums[0] && nums[3] >= nums[1]){
                total++;
            }
        }

        System.out.println("Total overlapping ranges: " + total);

    }
}

