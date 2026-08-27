import java.util.*;
public class Bignumbermultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Originally developed independently in 2016 by Jāsh

        System.out.println("Welcome to BigNumberMultiplier.");
        System.out.println("Enter number one . ");
        String n1= sc.next();
        System.out.println("Enter number two . ");
        String n2 = sc.next();
        
        int max;                        // making user-friendly
        if(n1.length()>n2.length())
        {
            int dif=n1.length()-n2.length();
            for (int a=0;a<dif;a++)
            {
                n2="0"+n2;
            }
        }
        
        else
        {
               int dif=n2.length()-n1.length();
            for (int a=0;a<dif;a++)
            {
                n1="0"+n1;
            }
        }
        
        
        
                                                             // if n1.length and n2.length are equal 
         int loop = (2*n1.length())-1;
             int midloop = n1.length();
             int loop2 =0;
             int pos1=n1.length();   int pos2=n2.length()-1;
             int sum=0;  String z ="";
             int adj=0;

             for (int i=1;i<=loop;i++ )
              {

                   sum = sum+adj;
                           
                  if (i>midloop)       // error point!
                     {
                      loop2--; 
                       pos2--;
                     }
                     
                     else
                      {
                       loop2++;
                       pos1--;
                       }  
                         
                       int pos2a=pos2;
                       int pos1a=pos1;
                    
                   for (int j=1;j<=loop2;j++)
                   {                                      // keep updating pos2a and pos1a here 
                       
                     
                        char ch2 = n2.charAt(pos2a);
                        char ch1 = n1.charAt(pos1a);    
                        
                         int a = Character.getNumericValue(ch2);
                         int b = Character.getNumericValue(ch1);
                         
                         int mul = a*b;
                         sum = sum+mul;
                         
                         


                    pos2a--;   pos1a++;  // in every case 
                  
                    }
                   
                   if (sum>9)
                   {
                       adj = sum/10;
                       sum = sum%10;
                   }
                   else
                   {
                       adj=0;
                   }
                   z = sum+z;
                   sum=0;

                                     


                 }
              z = adj+z;             // adj still to be added
             
             
        
      int b=0;                 // again making user-friendly
      
        for (b=0;b<z.length();b++)
        {
           char n=z.charAt(b);
           
           if (n!='0')
           {
               break;
           }
        }
        
        z=z.substring(b);

      System.out.println("Output : "+z);  
      
      
      
    }
}