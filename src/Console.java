import java.util.Scanner;

public class Console {

    static Scanner scanValue = new Scanner(System.in);

    public static int scanInt() {
        int intValue = scanValue.nextInt();
        scanValue.nextLine();
        return intValue;
    }

    public static String scanSting() {
        String strValue = scanValue.nextLine();
        return strValue;
    }

    public static float scanFloat() {
        float floValue = scanValue.nextFloat();
        scanValue.nextLine();
        return floValue;
    }
    
}