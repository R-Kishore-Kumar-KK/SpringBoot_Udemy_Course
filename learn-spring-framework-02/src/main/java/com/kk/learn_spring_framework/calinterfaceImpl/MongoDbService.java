package com.kk.learn_spring_framework.calinterfaceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.kk.learn_spring_framework.calinterface.DataService;

@Component
@Primary
public class MongoDbService implements DataService{

	@Override
	public int[] retriveData() {
		return new int[] {11, 22, 33, 44, 55};
	}

}
