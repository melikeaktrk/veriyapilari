package YeniPkg;

import java.util.Scanner;

public class IkınciSinif {
    private int maas;
    private int DogumYili;
    private String DogumYeri;

    
    public int getmaas() {
        return maas;
    }
    public void setmaas(int maas) {
        this.maas = maas;
    }

    public int getDogumYili() {
        return DogumYili;
    }
    public void setDogumYili(int DogumYili) {
        this.DogumYili = DogumYili;
    }

    public String getDogumYeri() {
        return DogumYeri;
    }
    public void setDogumYeri(String DogumYeri) {
        this.DogumYeri = DogumYeri;
    }

    
    public IkınciSinif(int maas, int DogumYili, String DogumYeri) {
        this.maas = maas;
        this.DogumYili = DogumYili;
        this.DogumYeri = DogumYeri;
    }

    
    public void IkınciSinifDegerYazdir() {
        System.out.println("MAAŞ: " + getmaas());
        System.out.println("DOĞUM YILI: " + getDogumYili());
        System.out.println("DOĞUM YERİ: " + getDogumYeri());
    }

  
    public void ikinciSinifaDegerAta(int maas, int DogumYili, String DogumYeri) {
        setmaas(maas);
        setDogumYili(DogumYili);
        setDogumYeri(DogumYeri);
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        IkınciSinif[] dizi = new IkınciSinif[10];

        
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = new IkınciSinif(0, 0, ""); 
        }

        
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1) + ". kişi için bilgileri giriniz:");

            
            System.out.print("Maaş: ");
            int maas = scanner.nextInt();

           
            System.out.print("Doğum Yılı: ");
            int DogumYili = scanner.nextInt();

            
            scanner.nextLine(); 
            System.out.print("Doğum Yeri: ");
            String DogumYeri = scanner.nextLine();

            
            dizi[i].ikinciSinifaDegerAta(maas, DogumYili, DogumYeri);
        }

        
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("\n" + (i+1) + ". kişinin bilgileri:");
            dizi[i].IkınciSinifDegerYazdir();
        }

        scanner.close();
    }
}

