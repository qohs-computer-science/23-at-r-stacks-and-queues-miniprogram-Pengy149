/*
 * Name: Kevin Zheng 
 * Date: 12/09/2024 
 * Class Period: 3 
 * File Name: StackQueueMini.java 
 * Program Description: The purpose of this java file is to 
 */

// Scanner is imported in order to be able to get user input. 
import java.util.Scanner;

// 
import java.util.Stack;

// 
import java.util.Queue;

// 
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
		}
		System.out.println("Bottom of Stack");


    Queue <Integer> firstStk = new LinkedList<Integer>(); 
    Queue <Integer> oddQ = new LinkedList<Integer>(); 
		for(int i = 0; i < 10; i++) {
      System.out.println("Enter a whole number: ");
      userNum = userIn.nextInt();
      firstQ.add(userNum);
    } // end for loop  		

    if(userNum % 2 != 0)
      oddQ.add(userNum);
    else 
      firstQ.add(userNum);

    while(!oddQ.isEmpty())
		{
			Integer temp = oddQ.remove();
			firstQ.add(temp);
		}

    System.out.println("Front of Queue");
		while(!firstQ.isEmpty())
		{
			Integer temp = firstQ.remove();
			System.out.println(temp);
		}
		System.out.println("Back of Queue");

  } // end main
} // end class
