import java.text.DecimalFormat;
import java.util.Scanner;
public class triangsAreas {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        double height, base, triang;
        
        System.out.print("Enter the triangle`s base: \n");
        base = sc.nextDouble();
        
        System.out.print("\nEnter the triangle`s height: \n");
        height = sc.nextDouble();
        
        triang = (base * height)/2;
        String area_t;        
        DecimalFormat formatt = new DecimalFormat("#.00");
        area_t = formatt.format(triang);
        
        System.out.print("\nUr Triangle`s Area is: " + area_t + "\n");
        System.out.print("\n------Other way to represent....------\n");
        
        String area_t2 = area_t.replace(',','.');   
        System.out.print("\nThe Area is: "+area_t2+"\n");
    }     
}
