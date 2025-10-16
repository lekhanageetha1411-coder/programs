public class Store{
  // instance variables
  public String productType;
  public double initialPrice;
  public double tax = 0.03;
  
// constructor method
public Store(String product, double pprice){
  productType = product;
  initialPrice = pprice;
}
// calling an method with double to print double value using return
public double increaseSize(double addTo){
   initialPrice += addTo;
  return initialPrice;
}
  // it is an another type of method with void 
public void pric(){
    System.out.println("this is product name : " + productType + " and the price is : " + initialPrice);
}
  // it is also double type used to return values 
  public double totalPrice(){
    double totalPrice1 = initialPrice +initialPrice*tax;
    return totalPrice1;
  }
  public static void main(String[] args){
    Store store = new Store("lemon", 2.5);
    Store store2 = new Store("cookies", 5.5 );
    store.pric(); // to print the sentence from the void we have to use the dot operation if we use s.o.p it will give errors
    store2.pric();
    System.out.println("the product price is " + store.totalPrice());
    System.out.println("the product price is " + store2.totalPrice());
    System.out.println("the inceased price is " + store.increaseSize(10));
    System.out.println("the inceased price is " + store2.increaseSize(100));
  }
}
    
  
