
import java.util.Scanner;



public class Main {
    
    public static int carpma(int a, int b,int c){
        return (a*b*c);
    }
    
     public static int carpma(int a, int b){
        return (a*b);
    }
    
     public static int toplama(int a ,int b,int c){
        return(a+b+c);
    }
     
      public static int toplama(int a ,int b){
        return(a+b);
      }
    public static  double bolme(int a, int b){
        return((double)a/b);
    }
    public static int cikarma(int a, int b){
        return (a-b);
    }
    
    
    
    
    
    public static void main(String[] args) {
        
         // Method Overloading kullanarak bir tane hesap makinası tasarlayalım.(Çarpma ve Toplama)
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("*******************************************");
        String islemler= "1.Toplama islemi\n"
                      +  "2.Cikarma islemi\n"
                      +  "3.Carpma islemi \n"
                      +  "4.Bolme islemi\n"
                      +  "Cikis icin q ya basin.";
        
        System.out.println(islemler);
        System.out.println("*******************************************");
        
        while(true){
             System.out.print("Islemi Seciniz:");
             String islem=scanner.nextLine();
             
             if(islem.equals("q")){
                 System.out.println("Programdan cikiliyor...");
                 break;
             }
             else if(islem.equals("1")){
                 System.out.print("Kac deger toplayacaksiniz? (2 veya 3):");
                 int kacsayi=scanner.nextInt();
                 
                      if(kacsayi==2){
                          System.out.print("a:");
                          int a=scanner.nextInt();
                          System.out.print("b:");
                          int b=scanner.nextInt();
                          scanner.nextLine();
                          System.out.println("Girilen Sayilarin Toplamlari:" +toplama(a, b));
                        }
                      else if(kacsayi==3){
                          System.out.print("a:");
                          int a=scanner.nextInt();
                          System.out.print("b:");
                          int b=scanner.nextInt();
                          System.out.print("c:");
                          int c=scanner.nextInt();
                          scanner.nextLine();
                          System.out.println("Girilen Sayilarin Toplamlari:" +toplama(a, b, c));
                      }
                      else{
                          System.out.println("Bunun icin uygun metod bulunmuyor...");
                                  
                      }
                 
             }
             
             else if(islem.equals("2")){
                 
                          System.out.print("a:");
                          int a=scanner.nextInt();
                          System.out.print("b:");
                          int b=scanner.nextInt();
                          scanner.nextLine();
                          System.out.println("Girilen Sayilarin Farklari:" +cikarma(a, b));
             }
                
             
             else if(islem.equals("3")){
                 System.out.print("Kac deger carpacaksiniz? (2 veya 3):");
                 int kacsayi=scanner.nextInt();
                 
                      if(kacsayi==2){
                          System.out.print("a:");
                          int a=scanner.nextInt();
                          System.out.print("b:");
                          int b=scanner.nextInt();
                          scanner.nextLine();
                          System.out.println("Girilen Sayilarin Carpimlari:" +carpma(a, b));
                        }
                      else if(kacsayi==3){
                          System.out.print("a:");
                          int a=scanner.nextInt();
                          System.out.print("b:");
                          int b=scanner.nextInt();
                          System.out.print("c:");
                          int c=scanner.nextInt();
                          scanner.nextLine();
                          System.out.println("Girilen Sayilarin Carpimlari:" +carpma(a, b, c));
                      }
                      else{
                          System.out.println("Bunun icin uygun metod bulunmuyor...");
                                  
                      }
                 
             }
             
              else if(islem.equals("4")){
                 
                          System.out.print("a:");
                          int a=scanner.nextInt();
                          System.out.print("b:");
                          int b=scanner.nextInt();
                          scanner.nextLine();
                          System.out.println("Girilen Sayilarin Bolumu:" +bolme(a, b));
             }
             
              else{
                  System.out.println("Gecersiz Islem...");
              }
             
             
             
        }
    }
}
