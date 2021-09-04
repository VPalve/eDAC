   public class SimpleInterest{

   public static void main (String value[]){
  
   System.out.println("amount:  " + value[0] +" rate: " + value[1] +  " year:  " + value[2]);
    
  double p = Double.parseDouble(value[0]);
   
  double r =Double.parseDouble(value[1]);
   
  double y = Double.parseDouble(value[2]);
   
  double SI = (p*r*y)/100;
  
  System.out.println(SI);
   }

 }

