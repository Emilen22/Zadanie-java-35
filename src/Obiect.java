public class Obiect {

    private String productName;
    private int productionYear;
    private int productionNumber;

    int counter = 0;

    Obiect[] obiect = new Obiect[3];

    public Obiect(String productName, int productionYear, int productionNumber) {
        this.productName = productName;
        this.productionYear = productionYear;
        this.productionNumber = productionNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumber(int productionNumber) {
        this.productionNumber = productionNumber;
    }
}
