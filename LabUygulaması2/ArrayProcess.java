public class ArrayProcess {

	 // Dizinin elemanlarını ekrana yazdırır
    public static void diziYaz(int[] dizi) {
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println();
    }

    //yeni eleman ekle
    public static int[] elemanEkle(int[] array, int yeni) {
        int[] yeniDizi = new int[array.length + 1]; 
        System.arraycopy(array, 0, yeniDizi, 0, array.length); // Eski diziyi kopyala
        yeniDizi[array.length] = yeni; 
        return yeniDizi; 
    }

    //eleman sil
    public static int[] elemanSil(int[] array) {
        if (array.length == 0) return array; 
        int[] yeniDizi = new int[array.length - 1]; 
        System.arraycopy(array, 1, yeniDizi, 0, yeniDizi.length); // İlk elemanı hariç diğer elemanları kopyala
        return yeniDizi; 
    }

    //sayar
    public static int diziElemanSay(int[] dizi, int aranan) {
        int sayac = 0; 
        for (int eleman : dizi) {
            if (eleman == aranan) {
                sayac++; 
            }
        }
        return sayac; 
    }

    //indeks bulur
    public static int[] diziArananElemanIndeks(int[] dizi, int aranan) {
        int[] indeksler = new int[diziElemanSay(dizi, aranan)]; // Eleman sayısı kadar yeni dizi
        int sayac = 0; 
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                indeksler[sayac] = i; 
                sayac++;
            }
        }
        return indeksler; 
    }

    //elemanları döngü ile gezer
    public static void diziGezinme(int[] dizi) {
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println(); 
    }

    //elemanları özyineli gezer
    public static void recDiziGezinme(int[] dizi, int index) {
        if (index < dizi.length) {
            System.out.print(dizi[index] + " ");
            recDiziGezinme(dizi, index + 1); 
        } else {
            System.out.println();
        }
    }
     //eleman arar
    public static int diziAra(int[] dizi, int aranan) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                return i; 
            }
        }
        return -1; 
    }

    //özyineli arar
    public static int recDiziAra(int[] dizi, int aranan, int index) {
        if (index >= dizi.length) {
            return -1; 
        }
        if (dizi[index] == aranan) {
            return index; 
        }
        return recDiziAra(dizi, aranan, index + 1); 
    }

    
    public static void main(String[] args) {
        int[] dizi = {9, 3, 5, 6, 3, 1, 4, 1, 10};

        
        dizi = elemanEkle(dizi, 5);
        System.out.println("Yeni dizi elemanları:");
        diziYaz(dizi);

        
        dizi = elemanSil(dizi);
        System.out.println("Dizi elemanları (ilk eleman silindi):");
        diziYaz(dizi);

        
        System.out.println("Dizide 1 elemanının sayısı: " + diziElemanSay(dizi, 1));

        
        System.out.println("Dizide 1 elemanının indeksleri:");
        int[] indeksler = diziArananElemanIndeks(dizi, 1);
        diziYaz(indeksler);

        
        System.out.println("Klasik dizi gezinme:");
        diziGezinme(dizi);

        
        System.out.println("Öz yinelemeli dizi gezinme:");
        recDiziGezinme(dizi, 0);

        
        int aranan = 3;
        int bulunanIndeks = diziAra(dizi, aranan);
        if (bulunanIndeks != -1) {
            System.out.println(aranan + " elemanı dizi içinde " + bulunanIndeks + ". indekste bulundu.");
        } else {
            System.out.println(aranan + " elemanı dizi içinde bulunamadı.");
        }

        
        bulunanIndeks = recDiziAra(dizi, aranan, 0);
        if (bulunanIndeks != -1) {
            System.out.println(aranan + " elemanı öz yinelemeli aramada " + bulunanIndeks + ". indekste bulundu.");
        } else {
            System.out.println(aranan + " elemanı öz yinelemeli aramada bulunamadı.");
        }
    }
}

