/*Let the user add any number and the computer tell him the number is either odd or even
.It will print out either odd or even
.
*/

package com.example.demo;

import java.util.Scanner;

public class OE {
public static void main(String[]args){

    Scanner input = new Scanner(System.in);
System.out.println( "Enter a number" );
 int numer = input.nextInt();

    boolean OE = true;


     int num=12;
    int i=0;
    //for (i = 0; i<input.nextInt(); i++ ) {

        if (num / 2!= 0) {
            //  int even = input.nextInt();
            System.out.println( "odd" );
        } else {
            System.out.println( "even" );
        }


  //  }

}

}
