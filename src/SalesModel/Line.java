
package sales.model;

public class Line {
    private String itm;
    private double price;
    private int count;
    private Invoice invoice;

    public Line() {
    }

    public Line(String itm, double price, int count, Invoice invoice) {
        this.itm = itm;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }

    public double getLineTotal() {
        return price * count;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return itm;
    }

    public void setItem(String item) {
        this.itm = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getNum() + ", item=" + itm + ", price=" + price + ", count=" + count + '}';
    }

    public Invoice getInvoice() {
        return invoice;
    }
    
    public String getAsCSV() {
        return invoice.getNum() + "," + itm + "," + price + "," + count;
    }
    
}
