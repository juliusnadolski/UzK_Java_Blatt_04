package h3;

public class H3_main {
    public static void main(String[] args) {
        float celciusFloat = 14.2f;
        float fahrenheitFloat = 0f;
        double celciusDouble = 14.2;
        double fahrenheitDouble = 0;

        fahrenheitFloat = (celciusFloat * 9 / 5) + 32;
        fahrenheitDouble = (celciusDouble * 9 / 5) + 32;

        System.out.println("celcius:" + celciusFloat + "fahrenheit:" + fahrenheitFloat);
        System.out.println("celcius:" + celciusDouble + "fahrenheit:" + fahrenheitDouble);
    }
}
