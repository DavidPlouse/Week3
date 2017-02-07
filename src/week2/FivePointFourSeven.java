/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FivePointFourSeven {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
  // Enter saving amount
  System.out
    .print("Enter the first 12 digits of an ISBN-13 as a string:");
  String s = input.nextLine();
  int sum = 0;
 
  if (s.length() != 12) {
   System.out.println(s + " is an invalid input");
   System.exit(0);
  }
 
  for (int i = 0; i < s.length(); i++) {
   if ((i + 1) % 2 == 0) {
    sum += s.charAt(i) - 48;
   } else {
 
    sum += 3 * (s.charAt(i) - 48);
   }
  }
   
  sum = (10 - sum%10)%10;
  System.out.println("The ISBN-13 number is " +s + sum);
    
 }
}
