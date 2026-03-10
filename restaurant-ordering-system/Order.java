package Restrunt;

import java.util.ArrayList;

public class Order {
	private ArrayList<String> orderedItems = new ArrayList<>();
	private ArrayList<Double> orderedItemPrice = new ArrayList<>();
	private Rest r;
	private double total;

	Order() {
		this.r = new Rest();
		r.additems("idly", 20);
		r.additems("dosa",40);
		r.additems("sambar", 35);
	}
	
	public Rest getRest() {
		return r;
	}
	
	public void addOrderedItems(String item, int qty) {
		orderedItems.add(r.getItem(item));
		orderedItemPrice.add(r.getPrice(item) * qty);
	}
    public void setOrderedQty(String item,int qty){
    	orderedItemPrice.set(orderedItems.indexOf(item),r.getPrice(item)*qty);
    }
    public void removeOrderedItems(String item){
    	orderedItems.remove(r.getItem(item));
		orderedItemPrice.remove(r.getPrice(item));
    }
    public void cancelOrder(){
    	orderedItems.removeAll(orderedItems);
		orderedItemPrice.removeAll(orderedItemPrice);
		System.out.println("your order succeesfully canceled");
    }
    public  void totalPrice(){
    	int sum=0;
    	for(double a:orderedItemPrice) {
    		sum+=a;
    	}
    	total=sum;
    }
	public void showOrderedItems() {
		System.out.println("======OrderedItems==========||===Qty===||======Prices=======");
		for (int i = 0; i < orderedItems.size(); i++) {
			System.out.print((i + 1) + ")" + orderedItems.get(i));
			for (int j = 0; j < 31 - String.valueOf(orderedItems.get(i)).length(); j++) {
				System.out.print(" ");
			}
			System.out.print(orderedItemPrice.get(i)/r.getPrice(orderedItems.get(i)));
			for (int j = 0; j < 15 - String.valueOf(orderedItems.get(i)).length(); j++) {
				System.out.print(" ");
			}
			System.out.println(orderedItemPrice.get(i));
		}
		totalPrice();
		System.out.println("==============total=============================="+total);
	}
	
}
