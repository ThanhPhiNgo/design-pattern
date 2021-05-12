package com.phint2.pattern.creational.singleton.reflectionbreak;

import com.phint2.pattern.creational.singleton.eager.EagerSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakSingleton {

	public static void main(String[] args)
			throws InvocationTargetException, InstantiationException, IllegalAccessException {

		EagerSingleton instanceOne = EagerSingleton.getInstance();
		EagerSingleton instanceTwo = null;

		Constructor<?>[] constructors = EagerSingleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors){
			constructor.setAccessible(true);
			instanceTwo = (EagerSingleton) constructor.newInstance();
		}

		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
