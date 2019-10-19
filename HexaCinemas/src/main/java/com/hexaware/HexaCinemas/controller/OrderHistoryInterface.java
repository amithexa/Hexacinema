package com.hexaware.HexaCinemas.controller;

import org.springframework.data.repository.CrudRepository;

import com.hexaware.HexaCinemas.model.OrderHistory;

public interface OrderHistoryInterface extends CrudRepository<OrderHistory, Integer>{
	

}
