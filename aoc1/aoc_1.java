// goal: find the elf with the most calories and return that number of calories
import java.io.*; 
import java.util.*; 



public class aoc_1 {

    public static void main(String[] args) {

        try {
            File f = new File("aoc1_input.txt");             // take in file
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
                System.out.println(calcMax(ints));
            }

            System.out.println(sums);
            System.out.println(calcMax(ints));

            // part 1: 


            int topthree = 0; 

            int max = calcMax(sums); 
            topthree += sums.get(max);
            sums.remove(max);

            int second = calcMax(sums);
            topthree += sums.get(second);
            sums.remove(second);

            int third = calcMax(sums);
            // topthree += sums.get(third);

            System.out.println(topthree);



        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

    }

    public static int addArr(List<Integer> arr) {
        int sum = 0; 
        for (int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum; 
    }

    public static int calcMax(List<Integer> arr) {
        int max = 0; 
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i) > arr.get(max)) {
                max = i;
            }
        }
        return max; 
    }
}