import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Birinci sayıyı girin: ");
        int x = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int y = scanner.nextInt();

      
        int result = obeb.gcd(x, y);

        
        System.out.println("GCD(" + x + ", " + y + ") = " + result);

        scanner.close(); 
    }
}

