
import java.util.ArrayList;


public class Sarkicilar {
    
    private ArrayList<String> sarkici_listesi=new ArrayList<String>();
    
    public void sarkicilariBastir(){
        System.out.println("Şarkıcı Listesinda "+sarkici_listesi.size()+" kadar şarkıcı var");
        
        for (int i = 0; i < sarkici_listesi.size(); i++) {
            
            System.out.println((i+1)+".ŞArkıcı :"+sarkici_listesi.get(i));
        }
    }
    
    public void sarkiciEkle(String isim){
        sarkici_listesi.add(isim);
        System.out.println("Şarkıcı Listesi Güncellendi!");
    }
    
    public void sarkiciGuncelle(String yeni_isim, int pozisyon){
        sarkici_listesi.set(pozisyon, yeni_isim);
        System.out.println("Şarkıcı Listesi Güncellendi!");    
    }
    
    public void sarkiciSil(int pozisyon){
        
        String isim=sarkici_listesi.get(pozisyon);//O anki pozisyonunu almış olacağız
        
        sarkici_listesi.remove(pozisyon);
        
        System.out.println(isim+" isimli şarkıcı listeden silindi...");
        
    }
    
    public void sarkiciAra(String sarkici_ismi){
        
        int pozisyon=sarkici_listesi.indexOf(sarkici_ismi);
        
        if (pozisyon>=0) {//Şarkıcımız liste de var demektir
            
            System.out.println("şarkıcı Bulundu.");
            System.out.println(sarkici_ismi+" isimli şarkıcı "+(pozisyon+1)+". pozisyonda");
        }
        
        else{
            System.out.println("Şarkıcı Bulunamadı...");
        }
    }
}
