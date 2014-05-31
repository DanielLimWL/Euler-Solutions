/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProjectEuler1.pkg5;

//@author Daniel
 
//If we list all the natural numbers below 10 that are multiples of 3 or 5, 
//we get 3, 5, 6 and 9. The sum of these multiples is 23
//Find the sum of all the multiples of 3 or 5 below 1000.

 public class ProjectEuler1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int LoopNr = 1;

        
        while (LoopNr < 1000) {
            if (LoopNr % 3 == 0 || LoopNr % 5 == 0) { //Modulus: Check if sum is divisible by 3
                sum = LoopNr + sum;
                ++LoopNr;   //Increment for LoopNr
            
            } else {
                ++LoopNr;
            }
        }
        System.out.println(sum);
    }
}


