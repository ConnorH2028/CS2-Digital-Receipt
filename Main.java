

   

public class Main {

  
  
  
  
  
  public static void main(String [] args) {
     // RECEIPT PRINTOUT SECTION
     int orderNumber = (int) (Math.random() * 100 + 1);
      int drinksOrdered = (int) (Math.random() * 3);
      int candiesOrdered = (int) (Math.random() * 3);
      int hotdogsOrdered = (int) (Math.random() * 3);
      int hamburgersOrdered = (int) (Math.random() * 3);
      String highSchoolName = "Jack";
      String itemList1 = "Drink";
      String itemList2 = "Candy";
      String itemList3 = "Hot Dog";
      String itemList4 ="Hamburger";
      double drinkPrice = 1.50;
      double candyPrice = 1.25;
      double hotDogPrice = 2.75;
      double hamburgerPrice = 3.50;
      double taxRate = 0.05;
      double subTotal = hotdogsOrdered*hotDogPrice+drinksOrdered*drinkPrice+candiesOrdered*candyPrice+hamburgersOrdered*hamburgerPrice;
      double totalTax = subTotal*taxRate;
      double total = subTotal+totalTax;
      double value = ((int)(total * 100)/100.0);

     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*        " + highSchoolName  + " Snack Bar              *");
     System.out.println("*                                    *");
     System.out.println("*     " +drinksOrdered + " " + itemList1 + "..........$" + drinkPrice +     "          *");                      
     System.out.println("*     " + candiesOrdered +" "+ itemList2 + "..........$" + candyPrice    +    "         *");     
     System.out.println("*     " + hotdogsOrdered + " "+ itemList3 + "..........$" + hotDogPrice +       "       *");     
     System.out.println("*     "+ hamburgersOrdered +" "+ itemList4 +"..........$" + hamburgerPrice +       "      *");     
     System.out.println("*     Order number:" + orderNumber +            "                *"); 
    System.out.println("*     Total Cost: $"   + value+                            "             *");   
     System.out.println("*                                    *");    
     System.out.println("**************************************");
   } 
}
