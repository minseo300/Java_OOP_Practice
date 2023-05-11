package domain;

import config.DBConnection;

import java.util.List;

public class Order {
    private List<MenuItem> orders;
    private int totalPay;
    DBConnection dbConnection;

}
