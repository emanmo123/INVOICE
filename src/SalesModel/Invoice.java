
package sales.model;

import java.util.ArrayList;

public class Invoice {
    private int number;
    private String date1;
    private String customer_;
    private ArrayList<Line> lines;
    
    public Invoice() {
    }

    public Invoice(int number, String date, String customer) {
        this.number = number;
        this.date1 = date;
        this.customer_ = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (Line line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<Line> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customer_;
    }

    public void setCustomer(String customer) {
        this.customer_ = customer;
    }

    public int getNum() {
        return number;
    }

    public void setNum(int num) {
        this.number = num;
    }

    public String getDate() {
        return date1;
    }

    public void setDate(String date) {
        this.date1 = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "number=" + number + ", date=" + date1 + ", customer=" + customer_ + '}';
    }
    
    public String getAsCSV() {
        return number + "," + date1 + "," + customer_;
    }
    
}


