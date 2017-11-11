/**
 * Introduction to Java Programming I(IT151)
 * Professor Dr. Mazen Alkhatib
 * Individual Project 5
 */

/**
 * @author Nicholas Weinold
 * 5/8/2016
 */

import javax.swing.JOptionPane; 

class car {  //class containing getter, setters, constructor from week 2 START
    
    String color;  
    int seats;
    double liters;
  
     String colorGet()
     { 
         return color;
     }
     
     int seatsGet()
     {   
         return seats;
     }
     
     double litersGet()
     {   
         return liters;
     }
     
     car(String colorInit, int seatsInit, double litersInit)
     {
         color = colorInit;
         seats = seatsInit;
         liters = litersInit;        
     } // week 2 getter, setter, constructor class END
     
}

public class IndividualProject5 { //IndividualProject4 class START
    

    // week 4 method creation computeAverageSales(), computeShippingCost() START    
    static double computeAverageSales(){ 
        double totalPrice = 0;           
        double itemPrice;
        double averageSales;
        int itemCount = 0;
        int priceConfirm = 0;
        
        while(priceConfirm == JOptionPane.YES_OPTION){ 
            itemPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the item price?")); 
            totalPrice = itemPrice + totalPrice; 
            itemCount++; 
            priceConfirm = JOptionPane.showConfirmDialog(null,"Current Total = $"+totalPrice+"\n\nDo you want to add another item price?","Item Price Total",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
        } 
        averageSales = totalPrice / itemCount; 
        
        return averageSales; 
    } 
    
     static double computeShippingExpense(){ 
        double totalShippingExpense = 0.0; 
        double itemShippingExpense = 0.0;
        int shippingExpenseConfirm = 0;
        
        while(shippingExpenseConfirm == JOptionPane.YES_OPTION) { 
            itemShippingExpense = Double.parseDouble(JOptionPane.showInputDialog("Please enter the item shipping cost?")); 
            totalShippingExpense = totalShippingExpense + itemShippingExpense;
            shippingExpenseConfirm = JOptionPane.showConfirmDialog(null,"Current Shipping Total = $"+totalShippingExpense+"\n\nWould you like to enter another item shipping price?","Shipping Total",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        }
        return totalShippingExpense; 
     } 
    // week 4 method creation computeAveSales(), computeShippingCost() END
   
    public static void main(String[] args) { // week 1/2/3 declared main START
        
        //week 1/2 variables declared START
        String colorInit; 
        int seatsInit;
        int litersInit;
        // week 1/2 variables declared END
        
        // week 3 variables declared START
        String seatssInit;
        String literssInit;
        // week 3 variables declared END
        
        //week 4 variables declared START
        double averageSales;
        double totalShippingExpense;
        //week 4 variables declared END
        
        //week 5 creating an array to create multiple objects from our car class
        car[] car =new car[3];//we are allocating space for 3 objects here to keep memory low but to show an array can hold however many object allocated space we need
       
        //week 5 for loop to call multiple objects and week 1/2/3 user prompts and input checks START
    for (int i=1;i<3;i++){ //creating the for loop to call two objects using our array car[]
        
        colorInit = ""; //assigning starting values to variables within the for loop so that it will request second object inputs
        seatsInit = 0;
        litersInit = 0;
        
        while(colorInit.isEmpty()) {     
             colorInit = JOptionPane.showInputDialog("For Car"+i+" Please select one of the following colors. \n - Red \n - Blue \n - Grey \n - Black \n - White"); //user prompts display which object values they are requesting
        } 
            
        while((seatsInit<=1)||(seatsInit>5)||(seatsInit==3)) {
            seatssInit=JOptionPane.showInputDialog("For Car"+i+" How many seats would you like? \n - 2   (Two-seater) (coupe) \n - 4  " + " (4 seat sedan)  \n - 5   (added middle seat sedan)");
            if(seatssInit.matches("\\d+")) {                  
                seatsInit = Integer.parseInt(seatssInit);    
            }                                            
        }   
                    
        while((litersInit<=1)||(litersInit>4)) {         
            literssInit = JOptionPane.showInputDialog("For Car"+i+" Please select a liter option? \n 2  (liters) \n 3  (liters) \n 4  (liters)"); 
            if(literssInit.matches("\\d+")) { 
                litersInit = Integer.parseInt(literssInit);
            }                                                                     
        }
        
        // week 1/2/3 user prompts and input checks END
       
        //week 5 calling our array and displaying the stored user inputs
            car[i] = new car(colorInit, seatsInit, litersInit);
            System.out.println("Car"+i+" color = "+ car[i].colorGet()); 
            System.out.println("Car"+i+" seats = "+ car[i].seatsGet());
            System.out.println("Car"+i+" liters = "+ car[i].litersGet());

        
    } //week 5 for loop END
        
        // week 4 calling methods START
        averageSales = computeAverageSales(); 
        
        JOptionPane.showMessageDialog(null, "Average Sales Total: $"+ averageSales); 
        if(averageSales>200){ 
            JOptionPane.showMessageDialog(null, "Significant profits were attained!", "Congratulations",1); 
        } 
            
        totalShippingExpense = computeShippingExpense(); 
        JOptionPane.showMessageDialog(null, "Total Shipping Expense: $" + totalShippingExpense); 
        // week 4 calling methods END
        
    } // week 1/2/3 declared main END
    
} // IndividualProject4 class END