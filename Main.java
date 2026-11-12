

   

public class Main {

  
  
  
  
  
  public static void main(String [] args) {
     // RECEIPT PRINTOUT SECTION
     int orderNumber = (int) (Math.random() * 100 + 1);
      int drinksOrdered = (int) (Math.random() * 3);
      int candiesOrdered = (int) (Math.random() * 3);
      int hotdogsOrdered = (int) (Math.random() * 3);
      int hamburgersOrdered = (int) (Math.random() * 3);
      double taxRate = 0.5;
      double subTotal = 17.0;
      double totalTax = 1.0;
      double total = 18.0;
      String highSchoolName = "Jack";
      String itemList1 = "Drink";
      String itemList2 = "Candy";
      String itemList3 = "Hot Dog";
      String itemList4 ="Hamburger";
      double drinkPrice = 1.50;
      double candyPrice = 1.25;
      double hotDogPrice = 2.75;
      double hamburgerPrice = 3.50;
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*        " + highSchoolName  + " Snack Bar              *");
     System.out.println("*                                    *");
     System.out.println("*     " + itemList1 + "..........$" + drinkPrice +     "            *");                      
     System.out.println("*     " + itemList2 + "..........$" + candyPrice    +    "           *");     
     System.out.println("*     " + itemList3 + "..........$" + hotDogPrice +       "         *");     
     System.out.println("*     "+ itemList4 +"..........$" + hamburgerPrice +       "        *");     
     System.out.println("*     Order number:" + orderNumber +            "                *"); 
     System.out.println("*                                    *");    
     System.out.println("**************************************");
   } 
}
