package VendingMachine;

import java.util.Scanner;

public class VM_3 {

        int item_id;
        double amountPaid;
        double balanceAmount=0;
        double amountInVendingMachine=0;

        public void menuCard(){
            System.out.println("-----Welcome to Foodie--------");
            System.out.println("Item_id----- Item----- Rate");
            System.out.println("1.Chocolate---10");
            System.out.println("2.IceCream---30");
            System.out.println("3.Burger---140");
            System.out.println("4.Pizza---210");
            System.out.println("5.Sandwich---50");
            System.out.println("6.Amount in Vending Machine");
            userOrder();
        }

        public void userOrder(){
            String nextOrder;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the item_id");
            item_id = sc.nextInt();
            if(item_id<6) {
                System.out.println("Enter amount paid");
                amountPaid = sc.nextDouble();
            }
            balanceAmountCalculation();
            System.out.println("Do you want to go for another order? Type yes or no");
            nextOrder = sc.next();
            if(nextOrder.equalsIgnoreCase("yes"))
                menuCard();
            else
                System.out.println("Thank you !!! visit again Foodies !!!");
        }
        public void amountTally(String item, double rate){
            if (amountPaid > rate)
                balanceAmount = amountPaid - rate;
            System.out.println("Balance amount given to user:" + balanceAmount);
            System.out.println("Dispensing "+ item);
            amountInVendingMachine=amountInVendingMachine+rate;
        }
        public void balanceAmountCalculation(){
            if (amountPaid>0) {
                switch (item_id) {
                    case 1:
                        amountTally("Chocolate",10);
                        break;
                    case 2:
                        amountTally("IceCream",30);
                        break;
                    case 3:
                        amountTally("Burger",140);
                        break;
                    case 4:
                        amountTally("Pizza",210);
                        break;
                    case 5:
                        amountTally("Sandwich",50);
                        break;
                    case 6:
                        System.out.println("Total amount in the Vending machine :" + amountInVendingMachine);
                        break;
                    default:
                        System.out.println("Wrong Item_id");
                        break;
                }

            }

        }

        public static void main(String[] args) {
            VM_3 cust1 = new VM_3();
            cust1.menuCard();

        }
    }


