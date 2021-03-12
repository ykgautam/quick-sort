package edu.practice.datastructure.linkedlist;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean flag = true;

		while (flag) {
			System.out.println();
			System.out.println("1. Add item to the list at start");
			System.out.println("2. Add item to the list at last");
			System.out.println("3. Add item to the list at require position");
			System.out.println("4. delete first item from the list");
			System.out.println("5. delete last item from the list");
			System.out.println("6. delete item from the list at given position");
			System.out.println("7. view list");
			System.out.println("8. Exit");

			System.out.println("enter your choice");
			int choice = sc.nextInt();
			int position, value;
			switch (choice) {

			case 1:
				System.out.println("enter the value you want to insert at first");
				value = sc.nextInt();
				list.insertAtFirst(value);
				break;

			case 2:
				System.out.println("enter the value you want to insert at last");
				value = sc.nextInt();
				list.insertAtLast(value);
				break;

			case 3:
				System.out.println("enter the position at which you want to insert the value");
				position = sc.nextInt();
				System.out.println("enter the value you want to insert");
				value = sc.nextInt();
				list.insertAtPosition(value, position);
				break;

			case 4:
				list.deleteFirst();
				break;

			case 5:
				list.deleteLast();
				break;

			case 6:
				System.out.println("enter the position from which you want to delete the value");
				position = sc.nextInt();
				list.deleteAtPosition(position);
				break;

			case 7:
				list.viewList();
				break;

			case 8:
				flag = false;
				break;
			default:
				System.out.println("invalid choice");
			}
		}
		sc.close();
	}
}
