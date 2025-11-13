package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;
        boolean a = true;
        boolean b = false;
        boolean c = true;
        int input = 10; /* nur die Werte 0,1,10,11 */

        if (input == 10 | input == 11) {
            x = true;
        } else {
            x = false;
        }
        if (input == 1 | input == 11) {
            y = true;
        } else {
            y = false;
        }
        if (x == true & y == true ){
            a = true;
        } else {
            a = false;
        }
        if (x == true || x != y){
            b = true;
        } else {
            b = false; 
        }
        if (x == y){
            c = !x;
        } else if (x != y){
            c = x;
        }

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}


/* alternative loesung:

x = (input == 10 || input == 11);
y = (input == 1 || input == 11);
a = x && y;
b = x || x != y;
c = (x == y) ? !x : x;

 */