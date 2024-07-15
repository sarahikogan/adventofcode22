/*
* 
* create an arraylist that holds all the boxes with subarrays for each stack, which holds the letters from the bottom to the top
* 
* split instructions by spaces
* 
* pop the unneeded ones, and push onto the needed ones -- a.get(stack).add(moved) for each in the amount needed to move 
* 
* at the end: print last item in each list
* 
*/

import java.util.*; import java.io.*; 

class aoc5 {
    public static void main(String[] args) {

        try {
            File f = new File("aoc5input.txt");
            Scanner s = new Scanner(f);

            // hardcoding in crates :( for speed
            ArrayList<ArrayList<Character>> stacks = new ArrayList<ArrayList<Character>>();
            stacks.add(Arrays.asList('Z', 'J', 'N', 'W', 'P', 'S')); 
            stacks.add(Arrays.asList('G', 'S', 'T')); 
            stacks.add(Arrays.asList('V', 'Q', 'R', 'L', 'H')); 
            stacks.add(Arrays.asList('V', 'S', 'T', 'D')); 
            stacks.add(Arrays.asList('Q', 'Z', 'T', 'D', 'B', 'M', 'J')); 
            stacks.add(Arrays.asList('M', 'W', 'T', 'J', 'D', 'C', 'Z', 'L')); 
            stacks.add(Arrays.asList('L', 'P', 'M', 'W', 'G', 'T', 'J')); 
            stacks.add(Arrays.asList('N', 'G', 'M', 'T', 'B', 'F', 'Q', 'H'));
            stacks.add(Arrays.asList('R', 'D', 'G', 'C', 'P', 'B', 'Q', 'W')); 
                // stacks.add(Arrays.asList({'Z', 'J', 'N', 'W', 'P', 'S'})); 
                // stacks.add({'G', 'S', 'T'});
                // stacks.add({'V', 'Q', 'R', 'L', 'H'}); 
                // {'V', 'S', 'T', 'D'},
                // {'Q', 'Z', 'T', 'D', 'B', 'M', 'J'},
                // {'M', 'W', 'T', 'J', 'D', 'C', 'Z', 'L'},
                // {'L', 'P', 'M', 'W', 'G', 'T', 'J'},
                // {'N', 'G', 'M', 'T', 'B', 'F', 'Q', 'H'},
                // {'R', 'D', 'G', 'C', 'P', 'B', 'Q', 'W'}

            int countlines=0; 


            while (s.hasNextLine()) {
                String input = s.nextLine(); 
                System.out.println(input);

                countlines++; 

                if (countlines > 10) {
                    String[] t = input.split(' ');
                    int[] ins = {(int) insts[1], (int) insts[3], (int) insts[5]};   // instructions
                    
                    // insts[1] = how many
                    // insts[3] = from
                    // insts[5] = to

                    // set a temp and remove the temp from the from stack
                    // for the amount of items needed, 
                    //      take off that many items from the top of the needed stack 
                    //      add all those items to the end of the next stack
                    // add the temp to the to stack

                    ArrayList<Character> temp; 
                    for (int i=0; i<ins[0]; i++) {
                        temp.add(stacks.get(ins[1]-1).get(stacks.get(ins[1]-1).size()-1-i));    
                    }

                    stacks.get(ins[3]-1).addAll(temp);

                    System.out.println(stacks);

                    temp.clear(); 
                }
            }
         } catch (IOException e) {
            e.printStackTrace(); 
         }


    }

}
