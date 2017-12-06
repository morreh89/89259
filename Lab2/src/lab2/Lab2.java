
package lab2;


public class Lab2 {
    public static int age[]={20, 45, 47, 38, 35, 67, 18, 34};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<age.length;i++){
                    System.out.println(age[i]);
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<age.length;i++){
                System.out.println("Years elapse"+age[i]);
                }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<age.length;i++){
                int f=(age[i]-18)/5+1;
                System.out.println("No. voting"+f);
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        
       };
         
               }
