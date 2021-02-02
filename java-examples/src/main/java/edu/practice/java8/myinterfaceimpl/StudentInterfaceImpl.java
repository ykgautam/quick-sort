package edu.practice.java8.myinterfaceimpl;

import java.util.Collections;
import java.util.List;

import edu.practice.java8.myinterface.StudentInterface;

public class StudentInterfaceImpl implements StudentInterface {

	@Override
	public int getMaxNumber(List<Integer> intList) {
		Integer maxNumber = Collections.max(intList);
		return maxNumber;
	}

}
