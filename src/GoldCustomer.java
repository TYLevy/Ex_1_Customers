public class GoldCustomer extends Customer {

    //Constructor
    public GoldCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return super.getPriceForProduct(fullPrice)* 0.8;
    }
}