/*
 * Name: Kevin Zheng 
 * Date: 12/10/2024 
 * Class Period: 3 
 * File Name: StackQueueMini.java 
 * Program Description: The purpose of this program is to first ask the user for 5 whole numbers for a stack and then duplicate each number in that stack but still maintain the 
 * same order as the original order. Then, the program asks the user for 10 whole numbers for a queue and then changes the order so that the odd numbers are located 
 * after the even numbers. 
 */

// Scanner is imported in order to be able to get user input. 
import java.util.Scanner;

// Stack is imported in order to be able to temporarily store user inputs  
import java.util.Stack;

// Queue is imported to be able to temporarily store user inputs 
import java.util.Queue;

// LinkedList is imported to be used as initial value for Queue 
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {
    Queue <Integer> firstQ = new LinkedList<Integer>(); 
    Stack <Integer> dupStk = new Stack<Integer>(); 
		Scanner userIn = new Scanner(System.in);
    int userNum;
    
    for(int i = 0; i < 5; i++) {
      System.out.println("Enter a whole number: ");
      userNum = userIn.nextInt();
      firstQ.add(userNum);
    } // end for loop  		

    while(!firstQ.isEmpty())
		{
			Integer temp = firstQ.remove();
			dupStk.add(temp);
      dupStk.add(temp);
		} // end while loop 

    System.out.println("Top of Stack");
		while(!dupStk.isEmpty())
		{
			Integer temp = dupStk.pop();
			System.out.println(temp);
		} // end while loop 
		System.out.println("Bottom of Stack");


    Queue <Integer> initialQ = new LinkedList<Integer>(); 
    Queue <Integer> newQ = new LinkedList<Integer>(); 
		for(int i = 0; i < 10; i++) {
      System.out.println("Enter a whole number: ");
      userNum = userIn.nextInt();
      initialQ.add(userNum);
    } // end for loop  		

    for(int i = 0; i < 10; i++) {
      Integer temp = initialQ.remove();
      if(temp % 2 == 0) 
        newQ.add(temp);
      else 
        initialQ.add(temp);
		} // end for loop 

    while(!initialQ.isEmpty())
		{
			Integer temp = initialQ.remove();
			newQ.add(temp);
		} // end while loop 

    System.out.println("Front of Queue");
		while(!newQ.isEmpty())
		{
			Integer temp = newQ.remove();
			System.out.println(temp);
		} // end while loop 
		System.out.println("Back of Queue");

  } // end main
} // end class
