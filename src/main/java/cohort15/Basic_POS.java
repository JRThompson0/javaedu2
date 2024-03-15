package cohort15;

import java.util.Scanner;
class Basic_POS {
    public static void main(String[] args) {
        System.out.println("Item Name?");
        Scanner textScan = new Scanner(System.in);
        String itemName = textScan.nextLine();
        System.out.println("Cost of item?");
        double itemCost = textScan.nextDouble();
        System.out.println("Enter Qty.");
        textScan = new Scanner(System.in);
        int itemQty = textScan.nextInt();
        double pricePickup = itemQty * itemCost;
        System.out.println("How far away are you?");
        double distanceHouse = textScan.nextDouble();
        double priceTotal = 0.0;
        if (distanceHouse < 5)
        {
            priceTotal = pricePickup + 2.0;
        }
        if (5 <= distanceHouse && distanceHouse >= 15)
        {
            priceTotal = pricePickup + 5.0;
        }
        if (15 < distanceHouse && distanceHouse >= 25)
        {
            priceTotal = pricePickup + 10.0;
        }
        if (25 < distanceHouse && distanceHouse >= 50)
        {
            priceTotal = pricePickup + 15.0;
        }
        if (distanceHouse > 50)
        {
            priceTotal = pricePickup + 20.0;
        }
        System.out.println("Your total is:  " +priceTotal);
    }
}