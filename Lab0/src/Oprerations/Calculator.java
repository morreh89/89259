
package Oprerations;



public class Calculator  extends Arithmetic{
    
    public int sub;
    @Override
    
    public int difference()
    {
        if(getFirst_number()>getSecond_number()){
            sub=getFirst_number()-getSecond_number();
            return getFirst_number()-getSecond_number();
        }
        
            return 0;
        
    }
}