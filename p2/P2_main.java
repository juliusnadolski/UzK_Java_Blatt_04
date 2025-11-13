package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 6;
        double x = 1.5, y = 2.3;
        int intResult;
        double doubleResult;

    
        doubleResult = (double)c / b;           
        System.out.println("d) " + doubleResult);

        doubleResult = c + (double)a / b;      
        System.out.println("e) " + doubleResult);

        doubleResult = x + y * b;              
        System.out.println("f) " + doubleResult);
    }
}
