package com.foodorderdeliverySystem.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodorderdeliverySystem.entity.FoodOrder;
import com.foodorderdeliverySystem.exception.ResourceNotFoundException;
import com.foodorderdeliverySystem.repository.FoodOrderRepo;
import com.foodorderdeliverySystem.service.FoodOrderService;

@Service
public class FoodOrderServiceimpl implements FoodOrderService {
	
	@Autowired
	FoodOrderRepo foodOrderRepo;
	public FoodOrder getFoodOrderByOrderId(int orderId ) {
		Optional<FoodOrder> pay=Optional.ofNullable(foodOrderRepo.findByOrderId(orderId));

		FoodOrder p;
		if(pay.isPresent())
       {
			 p=pay.get();
		}
else {
			throw new ResourceNotFoundException();
		}
		return p;
}
	public FoodOrder addFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepo.save(foodOrder);
	}
	public FoodOrder updateDb(int OrderId, FoodOrder foodOrder) {
		FoodOrder s1 = foodOrderRepo.findByOrderId(OrderId);
		if(s1!=null) {
			s1.setOrderId(foodOrder.getOrderId());   
			s1.setRestaurant(foodOrder.getRestaurant());
			s1.setFoodType(foodOrder.getFoodType());
			s1.setTotalAmount(foodOrder.getTotalAmount());
		return foodOrderRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}
	public void deleteDb(int OrderId) {
		FoodOrder s2 = foodOrderRepo.findByOrderId(OrderId);
		if(s2!=null) {
			foodOrderRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
}

	}


