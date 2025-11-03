package com.kk.learn_spring_framework.calinterfaceImpl;

import org.springframework.stereotype.Component;

import com.kk.learn_spring_framework.calinterface.DataService;

@Component
public class MySqlDbServer implements DataService{

	@Override
	public int[] retriveData() {
		return new int[] {1, 2, 3, 4, 5};
	}

	
}
