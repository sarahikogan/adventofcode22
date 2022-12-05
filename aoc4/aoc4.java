import java.util.*; 
import java.io.*; 

class aoc4 {
     public static void main(String[] args) {
        int count1 = 0, count2 = 0;                             // counter for pt1, pt2

        try {
            File f = new File("aoc4_input.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {

                String[] temp = (s.nextLine().split("[-,-]"));
                
                int[] inputs = new int[4]; 
               
                for (int i=0; i<4; i++) { inputs[i] = Integer.parseInt(temp[i]); }; 
                if ((inputs[0] <= inputs[2] && inputs[3] <= inputs[1]) || (inputs[2] <= inputs[0] && inputs[1] <= inputs[3] )) {        // check if 1 is contained in 2, or if 2 is contained in 1
                    count1++; 
                }
                if ((inputs[0] <= inputs[2] && inputs[1] >= inputs[2]) || (inputs[2] <= inputs[0] && inputs[3] >= inputs[0]) ) {        // check if start2 is contained in 1, or if start1 is contained in 2
                    count2++; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count1 + " " + count2);
    }
}