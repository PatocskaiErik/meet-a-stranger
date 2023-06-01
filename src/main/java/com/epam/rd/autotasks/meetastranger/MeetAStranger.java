package com.epam.rd.autotasks.meetastranger;
public class MeetAStranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("Hello, " + input);
    }
}
