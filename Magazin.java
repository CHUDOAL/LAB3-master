//package LAB3;


import java.lang.String;
import java.util.Scanner;

public class Magazin {
    public static String user;
    public static String[] zakaz = new String[2];
    public static String adres;
    public static String dates;
    
    

    public static void main(String[] args){
        
        Setuser(); SetTovar(); setadres(); setdata();
        Getuser(); GetTovar(); Getadres(); Getdata(); getKolich();
        

    }

    public static void Setuser(){

        
        User set = new User();
        set.setUser();

    }

    public static void Getuser(){

        
        System.out.print(user+", ");

    }

    public static void SetTovar(){

        
        Tovar set = new Tovar();
        set.Settovar();

    }

    public static void GetTovar(){

        for (int i = 0; i < 2; i++)
        {       
            System.out.print(zakaz[i]);
        }
        System.out.print(", ");
    }

    public static void setadres(){

        
       // Adres set3 = new Adres();
        Adres.setadress();
        

    }

    public static void Getadres(){

        System.out.print(Magazin.adres);
        
    }

    public static void setdata(){

        
        Data set3 = new Data();
        set3.setdata();

    }

    public static void Getdata(){

        System.out.print(dates);
        
    }

    public static void getKolich(){

        Tovar setz = new Tovar();
        System.out.print(setz.getnumber());

    }

}
