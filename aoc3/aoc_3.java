import java.io.IOException;
import java.util.*; 
import java.io.*; 

/*
 *  Sarah Kogan
 *  Advent of Code: Day 3
 *  Input file: aoc_3_input.txt
 */
class aoc_3_1 {
    public static void main(String[] args) {

        try {

            File f = new File("aoc_3_input.txt");
            Scanner s = new Scanner(f);

            int sum = 0, groupsum = 0, countLines = 0;              
            String[] ar = new String[3]; 

            while (s.hasNextLine()) {
                String input = s.nextLine(); 

                // star 1
                sum += getPriority ( findSame ( input.substring ( 0, input.length()/2 ), input.substring ( input.length()/2 ) ) );

                countLines++; 

                switch ( countLines%3 ) {
                    case 1: ar[0] = input; break; 
                    case 2: ar[1] = input; break; 
                    case 0: ar[2] = input; 
                            // star 2
                            groupsum += getPriority ( findSame ( ar[2], ( findSame ( ar[0], ar[1]) ) ) );
                            break;
                }
            }

            System.out.println(sum + " " + groupsum); 

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String findSame(String a, String b) {
        String out = ""; 
        for (char i : a.toCharArray()) {
            for (char j : b.toCharArray()) {
                if (i == j) { out += i; };
            }
        }
        return out;
    }

    public static int getPriority(String s) {
        char a = s.charAt(0);
        return (Character.isLowerCase(a) ?  (int) a - 96 : (int) a - 38); 
    }
}