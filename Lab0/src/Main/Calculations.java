
package Main;

import Oprerations.*;
import java.util.Scanner;

public class Calculations {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int f,s;
        System.out.println("Input f number");
        f=scanner.nextInt();
        
        System.out.println("Enter s number");
        s=scanner.nextInt();
        
        Arithmetic arithmetic= new Arithmetic(f,s);
       
        Calculator Calculator = new Calculator();
        int result = Calculator.difference();
        
         
    }
    
}
