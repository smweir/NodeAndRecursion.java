/*
* this class demos recursive methods.
* @ Author: Farzana Rahman
* @ Version: May 06, 2020
*/
public class RecursionTest
{  
   /*
   * This function calcuates bunny years.
   * We have a number of bunnies and each bunny has two big floppy ears. 
   * We want to compute the total number of ears across all the bunnies recursively 
   * (without loops or multiplication).
   *
   *Example input/output:
   *bunnyEars(0) → 0
   *bunnyEars(1) → 2
   *bunnyEars(2) → 4
   *
   */
   public static int bunnyEars(int bunnies) {
      if (bunnies == 0){
         return 0; 
      }
   
   return 2 + bunnyEars(bunnies - 1);
   }
   
   public static int countA(String str){
      if (str.isEmpty()){
         return 0;
      }
      
      int count = (str.charAt(0) == 'A' || str.charAt(0) == 'a') ? 1 : 0;
      
      return count + countA(str.substring(1));
      
        
     
   }
   
   
   
   
   public static int fibonacci(int n) {
      if (n == 0){
         return 0;
      }
      else if (n == 1){
         return 1;
      }
      
      return fibonacci(n - 1) + fibonacci(n-2);   
  
   }

   
   
   public static void main(String[] args)
   {
      //uncomment the following to test bunnyEars() method
      //System.out.println("bunnyEars(10) = " + bunnyEars(10)); // output should be 20
      
      
      //uncomment the following to test countA() method
      //System.out.println("countA(anastasia)" + " = " + countA("anastasia")); // output should be 4
      //System.out.println("countA()" + " = " + countA("")); // output should be 0
      
      
      //uncomment the following to test fibonacci() method
      //System.out.println("fibonacci(2) = " + fibonacci(2)); // output should be 1
      //System.out.println("fibonacci(9) = " + fibonacci(9)); // output should be 34


   }

   

}
