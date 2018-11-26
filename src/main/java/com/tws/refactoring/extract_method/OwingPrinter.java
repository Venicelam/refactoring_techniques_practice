package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {


        // print banner
        printBanner();
        double outstanding = calOutstanding(orders);
        printDetails(name, outstanding);
    }
    void printBanner(){
        System.out.println("*****************************");
        System.out.println("****** Customer totals ******");
        System.out.println("*****************************");
    }
        // print owings
        double calOutstanding(List<Order> orders) {
            double outstanding = 0.0;
            Iterator<Order> elements = orders.iterator();
            while (elements.hasNext()) {
                Order each = elements.next();
                outstanding += each.getAmount();
            }
            return outstanding;
        }

        // print details
        void printDetails(String name, double outstanding){
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }





}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
