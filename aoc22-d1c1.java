// goal: find the elf with the most calories and return that number of calories
import java.io.*; 
import java.util.*; 



public class aoc22-d1c1 {

    public static void main(String[] args) {

        try {
            File f = new File("day1input.txt");             // take in file
        
            Scanner s = new Scanner(f);

            List<Integer> ints = new ArrayList<Integer>(); 
            List<Integer> sums = new ArrayList<Integer>(); 

            String temp; 

            // check that current line is not blank 
            while (s.hasNextLine()) {
                temp = s.nextLine();
                if (temp.equals("")) {
                    sums.add(addArr(ints));
                    ints.clear();
                } else {
                    ints.add(Integer.parseInt(temp));
                }
            }

            int max = 0;

            for (int i=0; i<sums.size(); i++) {
                if (sums.get(i) > sums.get(max)) {
                    max = i;
                }
            }

            System.out.println(sums.get(max));


        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }



        


        // read in arguments from file, separated by newline


        // add each one to array 

        // calculate sum of array 

        // find max of array 
    }

    public static int addArr(List<Integer> arr) {
        int sum = 0; 
        for (int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum; 
    }
}
