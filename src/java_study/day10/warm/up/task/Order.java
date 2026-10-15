package java_study.day10.warm.up.task;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String code;
    private int amount;
    private Status status;

    private static final List<Order> extent = new ArrayList<>();

    public Order(String code, int amount, Status status) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Code cannot be null or empty");
        }
        this.code = code;
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be lest or equals than 0");
        }
        this.amount = amount;
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        this.status = status;
        extent.add(this);
    }

    public List<Order> getExtent() {
        return new ArrayList<>(extent);
    }

    public static double averageAmount(Status status) {
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        double sum = 0;
        int count = 0;
        for (Order order : extent) {
            if (order.getStatus() == status) {
                sum += order.getAmount();
                count++;
            }
        }
        if (sum == 0) {
            return sum;
        } else {
            return sum / count;
        }
    }

    public static List<Order> above(int threshold) {
        if (threshold < 1) {
            throw new IllegalArgumentException("Threshold cannot be less than 0");
        }
        List<Order> result = new ArrayList<>();
        for (Order order : extent) {
            if (order.getAmount() > threshold) {
                result.add(order);
            }
        }
        return result;
    }

    public static Order cheapestWithStatus(Status status) {
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        Order result = null;
        for (Order order : extent) {
            if (order.getStatus() == status && (result == null || order.getAmount() < result.getAmount())) {
                result = order;
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("Order with status " + status + " do not exist");
        }
        return result;
    }

    public String getCode() {
        return code;
    }

    public int getAmount() {
        return amount;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return code + " " + amount + " " + status;
    }
}
