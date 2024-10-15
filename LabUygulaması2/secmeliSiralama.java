public class secmeliSiralama {
    
    static void secmeliSiralamaString(String[] str) {
        int n = str.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;  
            for (int j = i + 1; j < n; j++) {
                if (str[j].compareTo(str[min_index]) < 0) {  // Alfabetik sıraya göre karşılaştır
                    min_index = j;
                }
            }
            // Eğer min_index, i'den farklıysa, elemanları değiştir
            if (min_index != i) {
                String temp = str[i];
                str[i] = str[min_index];
                str[min_index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[] str = {"kadir", "ayşe", "zeynep", "mehmet"};  // Örnek string dizisi
        System.out.println("Sıralamadan önce:");
        for (String s : str) {
            System.out.println(s);
        }

        secmeliSiralamaString(str);  // Diziyi sıralar

        System.out.println("\nSıralamadan sonra:");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
