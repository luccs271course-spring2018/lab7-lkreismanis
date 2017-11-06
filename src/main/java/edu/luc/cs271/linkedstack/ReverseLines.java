package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // DONE read successive input lines until EOF, then print out in reverse order
    System.out.println("Print ReverseLines Executed");
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    String line;
    line = input.nextLine();
    LinkedStack<String> newStack = new LinkedStack<String>();
    while (input.hasNextLine()) {
      line = input.nextLine();
      newStack.push(line);
    }
    while (!newStack.isEmpty()) {
      System.out.println(newStack.pop());
    }
    // DONE recursively read and print successive input lines until EOF, then print them out in
    // reverse order
    if (input.hasNextLine()) {
      // final String line = input.nextLine();
      System.out.println(line);
      printReverse(input);
      System.out.println(line);
    } else {
      return;
    }
  }
}
