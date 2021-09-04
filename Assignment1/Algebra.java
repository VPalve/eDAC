public class Algebra{
 
         public static void main( String num[]){
  
       System.out.println("First num: " + num[0] + "second num: " +  num[1]);
     
       Double a= Double.parseDouble(num[0]);
 
       Double b = Double.parseDouble(num[1]);
    
       Double sum = a+b; 
  
       Double sub = a-b;
   
       Double mult= a*b;
    
       Double div = a/b;
   
       Double rem= a%b;
   
       System.out.println("sum: " +sum + " substraction: " +sub + "multiplication: " +mult +"division: " +div + " reminder: " +rem);
   
        } 

} 
