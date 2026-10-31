package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    private String downloadURl;
    private double fileSizeMB;

    public DigitalProduct() {}

    public DigitalProduct(long id, String name, double price, String downloadURl,double fileSizeMB){
        super(id,name,price);
        this.downloadURl = downloadURl;
        this.fileSizeMB = fileSizeMB;

    }

    public String getDownloadURl(){
        return downloadURl;

    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }
}
