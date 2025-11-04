public class ComparingPrimitives {
    public static void main(String[] args){
        System.out.println("Comparing ints");
        int numb1 = 3;
        int numb2 = 4;
        int numb3 = 3;
        System.out.println(numb1 == numb2 );
        System.out.println(numb1 != numb2);
        System.out.println(numb1 == numb3);

        System.out.println("Comparing Chars");
        char a = 'a';
        char b = 'b';
        char c = 'a';
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a == c);

        System.out.println("Comparing String");
        String name = "anu";
       String name1 = "jan";
        String name2 = "anu";
        System.out.println(name == name1);
        System.out.println(name != name1);
        System.out.println(name == name2);

    }
}
