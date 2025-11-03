package com.kk.learn_spring_framework.calinterfaceImpl;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.kk.learn_spring_framework.calinterface.DataService;

@Component
public class BusinessCalculationService {

	private DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
