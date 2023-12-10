package com.foodorderdeliverySystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
       private int orderId;
	@Column(length=30)
       private String restaurant;
	@Column(length=35)
       private String foodType;
	@Column(length=30)
       private int totalAmount;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "FoodOrder [orderId=" + orderId + ", restaurant=" + restaurant + ", foodType=" + foodType
				+ ", totalAmount=" + totalAmount + "]";
	}
       
}