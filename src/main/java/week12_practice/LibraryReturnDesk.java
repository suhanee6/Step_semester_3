package week12_practice;

import java.util.Scanner;

public class LibraryReturnDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stack = new String[3];
        String[] queue = new String[3];
        int top = -1, front = 0, rear = 0, size = 0;

        while (sc.hasNext()) {
            String command = sc.next().replace(",", "");
            if (command.equalsIgnoreCase("RETURN")) {
                if (!sc.hasNext()) break;
                String book = sc.next().replace(",", "");
                if (top == 2) System.out.println(book + " rejected: pile is full");
                else {
                    stack[++top] = book;
                    System.out.println(book + " placed on pile");
                }
            } else if (command.equalsIgnoreCase("SHELVE")) {
                if (top == -1) System.out.println("pile is empty");
                else System.out.println("shelved " + stack[top--]);
            } else if (command.equalsIgnoreCase("WAIT")) {
                if (!sc.hasNext()) break;
                String student = sc.next().replace(",", "");
                if (size == 3) System.out.println(student + " rejected: line is full");
                else {
                    queue[rear] = student;
                    rear = (rear + 1) % 3;
                    size++;
                    System.out.println(student + " joined the line");
                }
            } else if (command.equalsIgnoreCase("SERVE")) {
                if (size == 0) System.out.println("no one waiting");
                else {
                    System.out.println("served " + queue[front]);
                    front = (front + 1) % 3;
                    size--;
                }
            }
        }
        sc.close();
    }
    // Each RETURN, SHELVE, WAIT and SERVE operation: O(1) time; O(1) space (fixed arrays).
}