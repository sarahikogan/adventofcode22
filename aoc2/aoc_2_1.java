import java.util.*; 
import java.io.*; 



/*
 * 1 1, 2 2, 3 3
 * 1 2 :: 6
 * 
 * 
 */
class aoc_2_1 {
    public static void main(String[] args) {
        try { 
            File f = new File("aoc_2_1_input.txt");
            Scanner s = new Scanner(f);

            int finalscore = 0; 

            while (s.hasNextLine()) {
                String input = s.nextLine();

                int p1 = num(input.charAt(0));
                int p2 = num(input.charAt(2));

                // System.out.println(p1 + " " + p2);

                if (p1 == p2) { 
                    finalscore += 3; 
                } else {
                        // case 1:  // +1 (rock). rock defeats scissors, paper defeats rock
                    if (p2 == 1) {
                        if (p1 == 2) {
                            finalscore += 0; 
                        } else if (p1 == 3) {
                            finalscore += 6; 
                        } else {
                            System.out.println("DRAWWWWW ON 1");
                        }
                    } else if (p2 == 2) {
                        if (p1 == 3) {
                            finalscore += 0; 
                        } else if (p1 == 1) {
                            finalscore += 6;
                        } else {
                            System.out.println("DEIDOJWELFIJWEF");
                        }
                    } else if (p2 == 3) {
                        if (p1 == 1) {
                            finalscore += 0; 
                        } else if (p1 == 2) {
                            finalscore += 6; 
                        }
                    }
                        

                            // finalscore += (p1 == 2 ? 0 : 6);
                            // break; 
                            // switch (p1) { // ROCK
                            //     case 2: finalscore += 0; break;  // paper X rock
                            //     case 3: finalscore += 6; break;  // scissor _ rock
                            // }
                       //  case 2: // +2 (paper). rock defeats paper, paper defeats scissors
                            
                        //     finalscore += (p1 == 3 ? 0 : 6);
                            // switch (p1) { // PAPER
                            //     case 1: finalscore += 6; break; // rock _ paper
                            //     case 3: finalscore += 0; break;  // scissor X scissor
                            // }
                         //    break; 
                        // case 3: 
                         //    finalscore += (p1 == 1 ? 0 : 6);
                            // switch (p1) { // SCISSOR
                            //     case 1: finalscore += 0; break; // rock X scissor
                            //     case 2: finalscore += 6; break; // paper _ scissor
                            // }
                          //  break; 
                    // }
                    finalscore += p2; 
                }
            }
            
            System.out.println(finalscore); 

            s.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR");
            e.printStackTrace(); 
        }
    }

    // convert to numbers 
    
    public static int num(char s) {
        if (s == 'X' || s == 'A') { return 1; };
        if (s == 'Y' || s == 'B') { return 2; };
        if (s == 'Z' || s == 'C') { return 3; }; 
        return 500000; 
    }
    

    /* 
    // return int depending on string input
    public static int shape(char s) {
        if (s == 'A' || s == 'X') { return 1; };       // rock
        if (s == 'B' || s == 'Y') { return 2; };       // paper
        if (s == 'C' || s == 'Z') { return 3; };       // scissors
        return 100000000;                                                            // TODO update
    }

    // return int depending on round outcome
    public static int round(String s) {
        int p1 = shape(s.charAt(0)), p2 = shape(s.charAt(2));

        // draw
        if (p1 == p2) { return 3; }
        else if (p1 == 1) { return (p2 == 2 ? 6 : 0); }         // rock X scissors _ paper
        else if (p1 == 2) { return (p2 == 3 ? 6 : 0); }         // paper X rock _ scissors
        else if (p1 == 3) { return (p2 == 2 ? 6 : 0); }         // scissors X paper _ rock
        return 70000000; 
    }
    */

}