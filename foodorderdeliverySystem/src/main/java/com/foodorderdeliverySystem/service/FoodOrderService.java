package com.foodorderdeliverySystem.service;

import com.foodorderdeliverySystem.entity.FoodOrder;
public interface FoodOrderService {
		FoodOrder getFoodOrderByOrderId(int orderId );
		FoodOrder addFoodOrder(FoodOrder foodOrder);
		FoodOrder updateDb(int orderId, FoodOrder foodOrder);
		void deleteDb(int orderId);
	}

