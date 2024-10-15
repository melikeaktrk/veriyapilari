public class main2 {

    static void secmeliSiralama(int[] dizi) {
        int n = dizi.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (dizi[j] < dizi[min_index]) {
                    min_index = j;
                }
            }

            // Eğer min_index, i'den farklıysa, elemanları değiştir
            if (min_index != i) {
                int temp = dizi[i]; // Dizi elemanlarını değiştir
                dizi[i] = dizi[min_index];
                dizi[min_index] = temp;
            }
        }
    }

    static void diziYazdir(int[] dizi) {
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] dizi = {29, 10, 14, 37, 13};  
        System.out.println("Sıralamadan önce:");
        diziYazdir(dizi);

        secmeliSiralama(dizi);  

        System.out.println("Sıralamadan sonra:");
        diziYazdir(dizi);  
    }
}

