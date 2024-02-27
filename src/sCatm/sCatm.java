package sCatm;

import java.util.Scanner;

public class sCatm {

	public static void main(String[] args) {
		
		int bakiye=3500, hak=3,secim=0,yatirilan,cekilen;
		String kullaniciAdi,sifre;
        Scanner input = new Scanner(System.in);
		   
        
        while(true) {
        
            System.out.print("Kullanıcı adınız : ");
            kullaniciAdi=input.nextLine();
            
            System.out.print("Parolanız : ");
            sifre=input.nextLine();        	
        	
            if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
        	
            	while (secim!=4) {
        	
            		System.out.println("\nMerhaba, BurçBanka Hoşgeldiniz!\n");
            
            		System.out.println("1-Para yatırma\n" +
                    "2-Para Çekme\n" +
                    "3-Bakiye Sorgula\n" +
                    "4-Çıkış Yap");
            		System.out.print("\nLütfen yapmak istediğiniz işlemi seçiniz : ");
            		secim = input.nextInt();
            
            		System.out.print("\n");
            
            		switch (secim) {
            	
            		case 1:
            	
            			System.out.print("Yatırılacak tutarı giriniz : ");
            			yatirilan=input.nextInt();
            	
            			bakiye=bakiye+yatirilan;
            	
            			System.out.print("\nGüncel Bakiyeniz : "+bakiye);
            			System.out.println("");
            	
            		break;
            	
            		case 2:
            
            			System.out.print("Çekilecek tutarı giriniz : ");
            			cekilen=input.nextInt();
            			bakiye=bakiye+cekilen;
            	
            			System.out.print("\nGüncel Bakiyeniz : "+bakiye);
            			System.out.println("");
            	
            		break;
            		
            		case 3:
            			
            			System.out.println("Bakiyeniz : "+bakiye);
            			System.out.println("");
            		
            		break;
            		} 	
            	}
            	System.out.println("Tekrar görüşmek üzere.");
            	break;
        	}          
        
        else {
        	hak--;
        	System.out.println("\nHatalı kullanıcı adı veya şifre. Tekrar deneyiniz.\n");
            if (hak == 0) {
            	System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            	break;    
            } 
            else {
                    System.out.println("Kalan Hakkınız : " + hak);
                    System.out.println("");
                }
            }
        }
	}
}

        



