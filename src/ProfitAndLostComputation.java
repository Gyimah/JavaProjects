import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ProfitAndLostComputation {


    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        //initializeArray();

                double totalPurchase = 0;
        double totalSales = 0;
        double productCost;
        double productSale;

        System.out.format("%-8s %s%n %-8s %s%n %-8s %s%n %-8s %s%n %-8s %s%n", "Name", "| Purchases", " | Sales", " | Cost",
                " | Selling Price", " | Total Purchase", " | Total Sales", " | P/L%", " | Profit/Loss/Break-even");

        ProductDetails[] productinfo = initializeArray();
//        System.out.format("%10s %8s %8s %8s %8s %8s %8s %8s %8s %n", "Name", "| Purchases", " | Sales", " | Cost",
//                " | Selling Price", " | Total Purchase", " | Total Sales", " | P/L%", " | Profit/Loss/Break-even");


        for (ProductDetails product: productinfo) {
            productCost = product.getCostPrice() * product.getNumberPurchased();
            productSale = product.getSellingPrice() * product.getNumberSold();
            totalPurchase = totalPurchase + productCost;
            totalSales = totalSales + productSale;
            System.out.format("%10s %8s %8s %8s %8s %8s %8s %8s %8s %n", product.getProductName(), product.getNumberPurchased(),
                    product.getNumberSold(), df2.format(product.getCostPrice()), df2.format(product.getSellingPrice())
                    , df2.format(productCost), df2.format(productSale), df2.format(product.getProfitLosspercentage())
                    ,product.getProfitStatus());
        }

        double totalProfitOrLossPercentage = ((totalSales - totalPurchase) / totalPurchase) * 100 ;



    }


    public static double computeProfitOrLoss(int numberPurchased, int numberSold, double cost, double sPrice){
        double profitAndLoss;

        double totalProductSales = sPrice * numberSold;
        double totalProductCost = cost * numberPurchased;
        profitAndLoss = totalProductSales - totalProductCost;

        return profitAndLoss;
    }


    public static double computeProfitOrLossPercentage(int numberPurchased, int numberSold, double cost, double sPrice){
        double profitAndLossPercetage;

        double profitOrLoss= computeProfitOrLoss(numberPurchased, numberSold, cost, sPrice );
        double totalProductCost = cost * numberPurchased;
        profitAndLossPercetage = (profitOrLoss / totalProductCost) * 100;

        return profitAndLossPercetage;
    }



    public static ProductDetails[] initializeArray(){

        int numberOfProducts;

        Scanner sc = new Scanner(System.in);
       try {
        System.out.print("Enter The Number of Products: ");
        numberOfProducts = sc.nextInt();
        } catch (InputMismatchException e) {
           sc.nextLine();
            System.out.print("Invalid input!!: Enter The Number of Products: ");
            numberOfProducts = sc.nextInt();
        }


        Scanner input = new Scanner(System.in);
        ProductDetails[] products = new ProductDetails[numberOfProducts];

        String name;
        int nPurchased;
        int nSold;
        double cost;
        double sPrice;

        for (int i = 0; i < numberOfProducts; i++){

            try {
            System.out.print("Enter the name of the product: ");
            name  = input.nextLine();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.print("Invalid input!!: Enter the name of the product: ");
                name  = input.nextLine();
            }

            try {
            System.out.print("Enter the number of " + name + " purchased: ");
            nPurchased  = input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.print("Invalid input!!: Enter the number of " + name + " purchased: ");
                nPurchased  = input.nextInt();
            }

            try {
            System.out.print("Enter the number of " + name + " sold: ");
            nSold  = input.nextInt();
            }catch (InputMismatchException e) {
                input.nextLine();
                System.out.print("Invalid input!!: Enter the number of " + name + " sold: ");
                nSold  = input.nextInt();
            }

            try {
            System.out.print("Enter the cost of each " + name + ": " );
            cost  = input.nextDouble();
            }catch (InputMismatchException e) {
                input.nextLine();
                System.out.print("Invalid input!!: Enter the cost of each " + name + ": " );
                cost  = input.nextDouble();
            }

            try {
            System.out.print("Enter the selling price of each " + name + ": ");
            sPrice  = input.nextDouble();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.print("Invalid input!!: Enter the selling price of each " + name + ": ");
                sPrice  = input.nextDouble();
            }

            input.nextLine(); // clears the buffer


            double profitandloss = computeProfitOrLoss(nPurchased, nSold, cost, sPrice);
            double profitOrLossPercentage = computeProfitOrLossPercentage(nPurchased, nSold, cost, sPrice);
            String profitStatus;

            if(profitandloss > 0) {
                    profitStatus = "PROFIT";
                }else if(profitandloss < 0){
                    profitStatus = "LOSS";
            }else{
                profitStatus = "BREAK-EVEN";
            }


            ProductDetails product = new ProductDetails(name, nPurchased, nSold, cost, sPrice, profitandloss
                    ,profitOrLossPercentage, profitStatus);

            products [i] = product;
            System.out.println();
        }


        return products;

    }

}





