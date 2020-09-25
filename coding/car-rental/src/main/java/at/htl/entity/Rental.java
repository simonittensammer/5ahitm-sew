package at.htl.entity;

import java.time.LocalDate;

public class Rental {

    private Customer customer;
    private double discount;

    // Constructors
    public Rental() {
    }

    public Rental(Customer customer, double discount) {
        this.customer = customer;
        this.discount = discount;
    }

    // Getter and Setter
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
