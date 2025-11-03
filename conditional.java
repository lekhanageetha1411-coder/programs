public class condtional{
    int guestCount;
    int RestaurentSpace;
    boolean isRestaurentOpen;
    boolean isConfirmed;

    public condtional(int count,int space,boolean open ){
        if(count <1 || count <10){
            System.out.println("invalid not allowed for guest");
        }
        guestCount = count;
        RestaurentSpace=space;
        isRestaurentOpen=open;
    }
    public void isreservationStatus(){
        if(RestaurentSpace >=guestCount && isRestaurentOpen){
            System.out.println("reservation done");
        }else{
            System.out.println("reservation not done");
        }
    }
    public void isConfirmed(){
        if(!isConfirmed){
            System.out.println("sorry reservation is not confirmed");
            System.out.println("betterluck");
            isConfirmed = false;
        }else{
            System.out.println("is confirmed enjoy your mealll");
            isConfirmed = true;
        }
        
    }
    public static void main(String[] args){
         condtional new1 = new condtional(12, 10, false);
         condtional new3 = new condtional(2, 12, true);
        new1.isreservationStatus();
        new1.isConfirmed();
        new3.isreservationStatus();
        new3.isConfirmed();

        }
}
