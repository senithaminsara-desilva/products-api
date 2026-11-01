package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable{
    private String downloadURl;
    private double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct() {}

    public DigitalProduct(long id, String name, double price, String downloadURl,double fileSizeMB){
        super(id,name,price);
        this.downloadURl = downloadURl;
        this.fileSizeMB = fileSizeMB;
        this.discountedPrice = price;

    }

    public String getDownloadURl(){
        return downloadURl;

    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }
    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | Download: " + downloadURl;
    }
    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
