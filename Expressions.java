
public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /**********************************************************
     * 3 and 4 are added with sum 7       
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println("#1 " + ((a + b) / c));   
    
    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division       
     * 3 is added to 0 with sum 3
     *  The value displayed is 3
     ***********************************************************/
    System.out.println("#2 " + (a + b / c));       
    
    //increment 3 by 1, getting the result of 4
    //The value displayed is 4
    System.out.println("#3 " + (++a));

    //The value of a is now 4, it is then decrement by 1 to get the result of 3
    //The value displayed is 3 
    System.out.println("#4 " + (--a));

    //The value of a is now 3, 3 is returned and then increment by 1 to get 4
    //The value displayed is 3
    System.out.println("#5 " + (a++));  

    //The value of a is now 4, 4 is returned and then decrement by 1 to get 3
    //The value displayed is 4     
    System.out.println("#6 " + (a--));

    //The value of a is back to 3
    //adding 3 and 1, getting the sum of 4
    //The value displayed is 4
    System.out.println("#7 " + (a + 1));  

    //17 mod 5, which is equal to the remainder of 17 divide by 5
    //The result of this mod is 2
    //The value displayed is 2     
    System.out.println("#8 " + (d % c));  

    //Divide 17 by 5 with 3 as the result of integer division
    //The value displayed is 3  
    System.out.println("#9 " + (d / c)); 

    //17 mod 4, which is equal to the remainder of 17 divide by 4 
    //The result of this mod is 1
    //The value displayed is 1    
    System.out.println("#10 " + (d % b));  

    //Divide 17 by 4 with 4 as the result of integer division
    //The value displayed is 4     
    System.out.println("#11 " + (d / b));  

    //Because division has higher precedence, 3 is divided by 17 with 0 as the result og integer division
    //17 is added to 0, getting 17 and then added again to 4 to get the sum equal to 21
    //The value displayed is 21    
    System.out.println("#12 " + (d + a / d + b)); 

    //17 is added to 3 getting 20
    //17 is added to 4 getting 21
    //20 is then divided by 21 with 0 as the result of integer division
    //The value displayed is 0     
    System.out.println("#13 " + ((d + a) / (d + b)));  

    //The value 4 is square rooted with 2 as the result
    //The value displayed is 2.0     
    System.out.println("#14 " + (Math.sqrt(b)));   

    //3 is raised to the power of 4, resulting with 81
    //The value displayed is 81.0    
    System.out.println("#15 " + (Math.pow(a, b))); 

    //The absolute value of -3 is 3
    //The value displayed is 3      
    System.out.println("#16 " + (Math.abs(-a)));

    //The max of 3 and 4 is 4
    //The value displayed is 4
    System.out.println("#17 " + (Math.max(a, b)));    
  } 
} 
