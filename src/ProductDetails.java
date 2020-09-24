class ProductDetails{

    String productName;
    int numberPurchased;
    int numberSold;
    double costPrice;
    double sellingPrice;
    double profitLoss;
    double profitLosspercentage;
    String profitStatus;


    public ProductDetails(String productName, int numberPurchased, int numberSold, double costPrice,
                          double sellingPrice, double profitLoss, double profitLosspercentage, String profitStatus) {
        this.productName = productName;
        this.numberPurchased = numberPurchased;
        this.numberSold = numberSold;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.profitLoss = profitLoss;
        this.profitLosspercentage = profitLosspercentage;
        this.profitStatus = profitStatus;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumberPurchased() {
        return numberPurchased;
    }

    public void setNumberPurchased(int numberPurchased) {
        this.numberPurchased = numberPurchased;
    }

    public int getNumberSold() {
        return numberSold;
    }

    public void setNumberSold(int numberSold) {
        this.numberSold = numberSold;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getProfitLoss() {
        return profitLoss;
    }

    public void setProfitLoss(double profitLoss) {
        this.profitLoss = profitLoss;
    }

    public double getProfitLosspercentage() {
        return profitLosspercentage;
    }

    public void setProfitLosspercentage(double profitLosspercentage) {
        this.profitLosspercentage = profitLosspercentage;
    }

    public String getProfitStatus() {
        return profitStatus;
    }

    public void setProfitStatus(String profitStatus) {
        this.profitStatus = profitStatus;
    }
}