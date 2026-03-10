package Restrunt;

import java.util.ArrayList;

public class Rest {
     private String item;
     private double price;
     private ArrayList<String>items=new ArrayList<>();
     private ArrayList<Double>prices=new ArrayList<>();
     Rest(){
     }
     Rest(String item,double price){
    	 this.item=item;
    	 this.price=price;
    	 items.add(item);
    	 prices.add(price);
     }
     public void showItems(){
    	 System.out.println("======items=========||======prices=======");
    	 for(int i=0;i<items.size();i++) {
    		 System.out.print((i+1)+")"+items.get(i));
    		 for(int j=0;j<26-String.valueOf(items.get(i)).length();j++) {
    			 System.out.print(" ");
    		 }
    		 System.out.println(prices.get(i));
    	 }
     }
     public void additems(String item,double price) {
    	 items.add(item);
    	 prices.add(price);
     }
     public void setPrice(String item,double price) {
    	 prices.set(items.indexOf(item), price);
     }
     public String getItem(String item){
    	 return items.get(items.indexOf(item));
     }
     public double getPrice(String item) {
    	 return prices.get(items.indexOf(item));
     }
  
}
