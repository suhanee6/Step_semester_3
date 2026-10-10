package week7_encapsulation.assigment_problems;
public class Cart {
 private final String cartId;private final double[] prices;private int count;
 public Cart(String cartId,int capacity){this.cartId=cartId;prices=new double[capacity];}
 public boolean addItem(double price){if(price<0||count==prices.length)return false;prices[count++]=price;return true;}
 public double getTotal(){double total=0;for(int i=0;i<count;i++)total+=prices[i];return total;}
 public int getItemCount(){return count;}public String getCartId(){return cartId;}
 public static void main(String[] args){Cart c=new Cart("CART-5",20);c.addItem(250);c.addItem(99);c.addItem(151);System.out.println(c.getTotal());System.out.println(c.getItemCount());}
}