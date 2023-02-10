// Write a program that will count number of notes from given array[1000,500,200,100,50,20,10,5,2,1]

import java.util.*;
import java.lang.*;
public class CountNotes {
       public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 1000,500,200,100,50,20,10,5,2,1 };
        int[] noteCounter = new int[10];

        // count notes using Greedy approach
        for (int i = 0; i < 10; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        System.out.println("Currency Count ->");
        for (int i = 0; i < 10; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

      public static void main(String argc[]){
        int amount = 562;
        countCurrency(amount);
    }
}
