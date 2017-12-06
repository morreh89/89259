/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Reply with");
        System.out.println("A:To add a new record");
        System.out.println("D:Delete/Remove a record");
        System.out.println("U:to Update a record");
        
        String reply;
        
        Scanner scanner=new Scanner(System.in);
        reply=scanner.nextLine();
        
        switch(reply){
            case "A":
                int student_no;
                String first_name, last_name,gender,programme;
                 System.out.println("Your student number");
                 student_no =scanner.nextInt();
                 System.out.println("your f name");
                 first_name=scanner.next();
                 System.out.println("Your l name");
                 last_name= scanner.next();
                 System.out.println("Your gender");
                 gender=scanner.next();
                 System.out.println("Your programme");
                 programme=scanner.next();
                 
                 CrudOperations crudeOperations=new CrudOperations();
                 crudeOperations.setStudent_no(student_no);
                 crudeOperations.setFirst_name(first_name);
                 crudeOperations.setLast_name(last_name);
                 crudeOperations.setGender(gender);
                 crudeOperations.setProgramme(programme);
                 crudeOperations.save();
                     
            break;
            case "D":
                int Student_no;
                System.out.println("Which record do you want to remove?");
                Student_no=scanner.nextInt();
                CrudOperations crudeOperations1=new CrudOperations();
                crudeOperations1.setStudent_no(Student_no);
                crudeOperations1.removeRecord();
            break;
            case "U":
                int student_no_x = 0;
                String first_name_x, last_name_x,gender_x,programme_x;
                 
                 System.out.println("your f name");
                 first_name_x=scanner.next();
                 System.out.println("Your l name");
                 last_name_x= scanner.next();
                 System.out.println("Your gender");
                 gender_x=scanner.next();
                 System.out.println("Your programme");
                 programme_x=scanner.next();
                 System.out.println("Your student number");
                 student_no_x =scanner.nextInt();
                 
                 CrudOperations crudeOperations2=new CrudOperations();
                 
                 crudeOperations2.setFirst_name(first_name_x);
                 crudeOperations2.setLast_name(last_name_x);
                 crudeOperations2.setGender(gender_x);
                 crudeOperations2.setProgramme(programme_x);
                 crudeOperations2.setStudent_no(student_no_x);
                 crudeOperations2.UpdateRecord();
            break;
            
            default:
                System.out.println("Invalid entry");      
                
        }
        
    }
    
}
