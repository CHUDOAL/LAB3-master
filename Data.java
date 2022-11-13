import java.lang.String;
import java.util.Scanner;

public class Data {

    static public void setdata(){

    System.out.print("Введите дату доставки: ");
    Scanner date = new Scanner(System.in);
    Magazin.dates = date.nextLine() + " ";

    
    }

}
