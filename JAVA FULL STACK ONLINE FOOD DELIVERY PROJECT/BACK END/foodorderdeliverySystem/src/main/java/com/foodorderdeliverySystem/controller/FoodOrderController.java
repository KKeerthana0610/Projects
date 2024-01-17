package com.foodorderdeliverySystem.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.foodorderdeliverySystem.entity.FoodOrder;
import com.foodorderdeliverySystem.service.FoodOrderService;

@RestController
	@CrossOrigin(origins="http://localhost:4200")
public class FoodOrderController {
	
	 @Autowired
	 FoodOrderService foodOrderServices;
		
		@GetMapping("/FoodOrder/{Id}")
		public FoodOrder getFoodOrderByOrderId(@PathVariable int orderId) {
			return foodOrderServices.getFoodOrderByOrderId(orderId); 
		}
		
		@PostMapping("/postOrder")
		public FoodOrder addFoodOrder(@RequestBody FoodOrder foodOrderServices) {
			
			return ((FoodOrderService) foodOrderServices).addFoodOrder(foodOrderServices);
		}
		
		@PutMapping("/updateFoodOrder")
		public FoodOrder update(@RequestHeader int orderId,@RequestBody FoodOrder foodOrderServices) {
			return ((FoodOrderService) foodOrderServices).updateDb( orderId ,foodOrderServices); 
		}
		@DeleteMapping("/deleteFoodOrder")
		public String delete(@RequestHeader int orderId ) {
			foodOrderServices.deleteDb(orderId );
			return "data deleted";
		}
	}

