
import java.util.Scanner;


public class Test {
    
    private static Sarkicilar sarkicilar=new Sarkicilar();//Başka bir objeyi biz direk classımıza ozellik olarak ekledik biz burda Composition yaqpmış olduk
    private static Scanner scanner=new Scanner(System.in);
    
    
    public static void islemleriBastir(){
        
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan çık");
    }
    
    public static void sarkiciGoruntule(){
        
        sarkicilar.sarkicilariBastir();
        
    }
    
    public static void sarkiciEkle(){
        
        System.out.println("Eklemek istediğiniz şarkıcının ismi : ");
        
        String isim=scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
        
        
    }
    
    public static void sarkiciGuncelle(){
        
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3,...)");
        
        int pozisyon=scanner.nextInt();
        scanner.nextLine();//Enter'i bir input olarak almaması için kullanıyoruz
        
        String yeni_isim=scanner.nextLine();
        
        sarkicilar.sarkiciGuncelle(yeni_isim, pozisyon - 1);//Pozisyon değerinin bir eksiği olaması lazım
        
    }
    
    public static void sil(){
        
        System.out.println("Silmek istediğiniz pozisyon(1,2,3,...)");
        int pozisyon=scanner.nextInt();
        sarkicilar.sarkiciSil(pozisyon-1);
    }
    
    public static void ara(){
        
        System.out.println("Aramak istediğiniz şarkıcı : ");
        
        String isim=scanner.nextLine();
        
        sarkicilar.sarkiciAra(isim);
    }
    
    public static void main(String[] args) {
        
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz...");
        
        islemleriBastir();
        
        boolean cikis=false;
        
        int islem;
        
        while (!cikis) {//not cikis yani True olacak, sonsuz bir döngüye girecek           
            
            System.out.print(" Bir işlem seçiniz : ");
            
            islem=scanner.nextInt();
            
            
            scanner.nextLine();//Enterin bu tarfatan algılanmasını istiyorum
            
            switch(islem){
                
                case 0:
                    islemleriBastir();
                    break;//Switch direk son buluyor demektir
                    
                case 1:
                    sarkiciGoruntule();
                    break;
                
                case 2:
                    sarkiciEkle();
                    break;
                    
                case 3:
                    sarkiciGuncelle();
                    break;
                
                case 4:
                    sil();
                    break;
                    
                case 5:
                    ara();
                    break;
                    
                case 6:
                    cikis=true;
                    System.out.println("Uygulamadan Çıkılıyor...");
            }
            
            
            
        }
        
        
    }
}
