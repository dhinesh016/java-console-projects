package Restrunt;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order o = new Order();
		boolean exit = true;
		while (exit) {
			System.out.println(
					" 1)show manu \n 2)to book order \n 3)modify order \n 4)cancel order\n 5) exit  \nEnter a choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				o.getRest().showItems();
			}break;
			case 2: {
				o.getRest().showItems();
				System.out.println("please book your items");
				String s1 = "yes";
				while (s1.equalsIgnoreCase("yes")) {
					System.out.println("enter item name");
					String item = sc.next();
					System.out.println("enter item qty");
					int qty = sc.nextInt();
					o.addOrderedItems(item, qty);
					System.out.println("do you want to add more items plase enter yes");
					s1 = sc.next();
				}
				System.out.println("Your Ordered items");
				o.showOrderedItems();
				System.out.println("Please confirm your Order enter yes");
				String s = sc.next();
				if (s.equalsIgnoreCase("yes")) {
					break;
				} else {
					System.out.println("do you want to modify any items please enter yes");
					String s2 = sc.next();
					if (s2.equalsIgnoreCase("yes")) {
						System.out.println("enter modify item name");
						String modifyitem = sc.next();
						System.out.println("enter modify item qty");
						int qty = sc.nextInt();
						if (qty > 0) {
							o.setOrderedQty(modifyitem, qty);
							o.showOrderedItems();
						} else {
							o.removeOrderedItems(modifyitem);
							o.showOrderedItems();
						}
					} else {
						System.out.println("Please confirm your Order enter yes");
						s = sc.next();
						if (s.equalsIgnoreCase("yes")) {
							break;
						}
					}
				}
			}break;
			case 3:{
				System.out.println("under construction");
			}break;
			case 4:{
				o.cancelOrder();
			}break;
			case 5:{
				System.out.println("thank you");
				exit=false;
			}break;
			default:{
				System.out.println("invaild choice");
			}
			}

		}

	}
}
