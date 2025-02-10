package ex_02_TO;

public class Lab__010_Three_largest {
    public static void main(String[] args) {

        int n1;
        n1 = 3;
        int n2;
        n2 = 9;
        int n3 ;
        n3 = 1;
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number:"+largest);





    }
}
