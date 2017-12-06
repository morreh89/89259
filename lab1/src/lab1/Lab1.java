
package lab1;


public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        String input = "is";
        int user_input = Integer.parseInt (input);
    }
        catch (NumberFormatException e){
               
                System.out.println(e.getMessage());
        }
         catch (Exception ex){
             System.out.println(ex);
         }
    
}
    
}
