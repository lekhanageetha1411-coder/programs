public class Switch {
    public static void main(String[] args) {
     String Sub = "Toc";
     
     switch(Sub){
        case "SE":
        System.out.println("Software engineering");
        break;
        case "CN":
        System.out.println("Computer networks");
        break;
        case "DS":
        System.out.println("Distributed System");
        break;
        case "Toc":
        System.out.println("Theory of coputation");
        break;
        default:
        System.out.println("Not found any subjects");

     }
    }
    
}
// without the break statement it will print the after the toc and all if it continues
