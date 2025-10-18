lass Order{
  boolean isFilled;
  double billAmount;
  String shipping;

  public Order(boolean filled, double cost, String shippingMethod){
    if(cost > 24.8){
      System.out.println("high value");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  public void ship(){
    if(isFilled){
      System.out.println("done!");
      System.out.println("The cost of ship is :" +calculateShipping());
    }else{
      System.out.println("Order not ready");
    }
  }
  public double calculateShipping(){
    if(shipping.equals("Regular")){
      return 0;
    }else if(shipping.equals("Express")){
    return 1.75;
  } else {
    return .50;
  }
}
public static void main(String[] args){
  Order book = new Order(true,99.9,"Express");
  Order book1 = new Order(false,14.5,"Regular");
  book.ship();
  book1.ship();

}
}
