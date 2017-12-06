
package lab1;

public class Exception1 {
    public static void main(String[] args){
        
        checkAge(12);
    }
    public static void checkAge (int age){
    try{
        if(age<18){
            throw new ArithmeticException("You have not atteined voting age");
        }
        else{
        System.out.println("You are eligible to vot");
        }
    }
    catch (ArithmeticException es){
        System.out.println(es.getMessage());
    }
    catch (Exception  esd){
    System.out.println(esd);
    }
   }
}
