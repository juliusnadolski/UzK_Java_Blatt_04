package h1;

public class H1_main {
    public static void main(String[] args) {
        int zone = 5; 
        double price;

        if (zone <= 0) {
            System.out.println("Ungültige Zone");
            return;
        }

        switch (zone) {
            case 1:
                price = 2.00;
                break;
            case 2:
                price = 2.35;
                break;
            case 3:
            case 4:
                price = 2.85;
                break;
            case 5:
                price = 3.55;
                break;
            default:
                price = 4.00;
                break;
        }

        System.out.println("Preis: " + price + " €");
    }
}

/* variante mit fallthrough und addition der preise:

package h1;

public class H1_main {
    public static void main(String[] args) {
        int zone = 5;
        double price = 0.0;

        switch (zone) {
            
            case 5:
                price = price + 0.70;
                
            case 3, 4:
                price = price + 0.50;
                
            case 2:
                price = price + 0.35;
                
            case 1:
                price = price + 2.00;
                break;
            case 6:
                price = 4.00;
                break;
            default:
                System.out.println("Ungültige Zone");
                return;
        }
        System.out.println("Preis: " + price);
    }
}
    
*/
