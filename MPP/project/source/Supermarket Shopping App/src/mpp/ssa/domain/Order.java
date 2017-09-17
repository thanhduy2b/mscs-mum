package mpp.ssa.domain;

import java.util.*;

/**
 * 
 */
public class Order {

    /**
     * Default constructor
     */
    public Order() {
        setLineItemList(new ArrayList<LineItem>());
    }

    public Order(String orderId, Date dateCreated, Date dateShipped,
                 String status, String bankCardNo, String shippingAddress, double shippingCost) {
        setOrderId(orderId);
        setDateCreated(dateCreated);
        setDateShipped(dateShipped);
        setStatus(status);
        setBankCardNo(bankCardNo);
        setShippingAddress(shippingAddress);
        setShippingCost(shippingCost);
    }

    private Customer customer;

    private List<LineItem> lineItemList;

    private String orderId;

    private Date dateCreated;

    private Date dateShipped;

    private String status;

    private String bankCardNo;

    private String shippingAddress;

    private double shippingCost;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<LineItem> getLineItemList() {
        return lineItemList;
    }

    public void setLineItemList(List<LineItem> lineItemList) {
        this.lineItemList = lineItemList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double calculateTotalLineItems() {
        double totalValue = 0;
        for(LineItem item : lineItemList) {
            totalValue += item.getSubtotal();
        }
        return totalValue;
    }
}