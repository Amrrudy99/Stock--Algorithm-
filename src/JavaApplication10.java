
// Java implementation of the approach  Brute Force Algorithm
  
//  author Amr Rudy

// Algorithm class
class task4 
{ 
    
 // Java implementation of the approach  Brute Force Algorithm
// Function to calcalute the maximum profit 

    static int beststock(int prices[]) {
         // Initialise the profit 
        int max_profit = 0;
        
        // No operations
    if (prices.length == 0) 
    {
        return 0; 
    }
        // 1st loop to calcu mimimum for i 
        for (int i = 0; i < prices.length - 1; i++) 
         {
            
            //2st loops to calcu maxmimum for j 
             for (int j = i + 1; j < prices.length; j++) 
             {
                
             // to check j->sell > i->buy 
                int profit = prices[j] - prices[i];
                if (profit > max_profit)
                {
                    max_profit = profit;
                }   
            }
        }
        return max_profit ;
    }

  
// Driver code 
public static void main(String[] args) 
{ 
    //input array
    int price[] = { 7 , 1 , 5 , 3 , 6 , 4 }; 
    
    String input = "{";
    for(int i=0;i<price.length ;i++){
        input += price[i] + ",";
    }
    input += "}";
    
    System.out.println("Input : " + input);
  
    //calling algorithm function
    System.out.println("OutPut : " + beststock(price)); 
    
    
}
} 
  