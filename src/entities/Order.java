package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Cliente client;
	
	
	public Order(Date moment, OrderStatus status, Cliente client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.add(item);
	}
	
	public double total() {
		return 0;
	}
	
	

}
