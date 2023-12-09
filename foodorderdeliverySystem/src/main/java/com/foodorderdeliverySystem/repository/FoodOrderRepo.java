package com.foodorderdeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.foodorderdeliverySystem.entity.FoodOrder;

@Repository
public interface FoodOrderRepo extends JpaRepository<FoodOrder, Integer> {
		@Query(value =  "select * from FoodOrder where  orderId =?" , nativeQuery = true)
		FoodOrder findByOrderId(int orderId);
}
