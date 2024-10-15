import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Bir karakter dizisi girin: ");
        String input = scanner.nextLine();
        
        
        char[] charArray = input.toCharArray();
        
       
        System.out.print("Tersten yazılmış hali: ");
        TerstenYazdir.Reverse(charArray, charArray.length - 1);
        System.out.println(); 
       
        scanner.close();
    }
}
