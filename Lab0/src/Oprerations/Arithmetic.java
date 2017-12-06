
package Oprerations;


public class Arithmetic {
    
    public Arithmetic ()
    {
         this.first_number=10;
        this.second_number=15;
    }
    public Arithmetic(int first, int Second){
    
        this.first_number=first;
        this.second_number=Second;
    }

        private int first_number;
        private int second_number;

    public int getFirst_number()
    {
        return first_number;
    }

    public void setFirst_number(int first_number) {
        this.first_number = first_number;
    }

    public void setSecond_number(int second_number) {
        this.second_number = second_number;
    }

    public int getSecond_number()
    {
        return second_number;
    }
    public int sum()
    {
        return second_number + second_number;
    }    
     public int difference()
    {
        return second_number-second_number;
    } 
     public int product()
    {
        return second_number* second_number;
    } 
     
    } 
  

