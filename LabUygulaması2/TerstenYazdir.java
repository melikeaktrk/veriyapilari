public class TerstenYazdir {
    
    
    public static void Reverse(char[] s, int index) {
        
        if (index < 0) {
            return;
        }
        
        
        System.out.print(s[index]);
        
        
        Reverse(s, index - 1);
    }
}

