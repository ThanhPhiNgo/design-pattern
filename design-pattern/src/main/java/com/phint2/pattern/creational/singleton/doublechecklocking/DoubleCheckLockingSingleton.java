package com.phint2.pattern.creational.singleton.doublechecklocking;

public class DoubleCheckLockingSingleton {

	private static volatile DoubleCheckLockingSingleton INSTANCE;

	private DoubleCheckLockingSingleton() {
	}

	public static DoubleCheckLockingSingleton getInstance(){
		// Do something before get instance
		if(null == INSTANCE){
			// Do the task too long before create instance ...
			// Block so other threads cannot come into while initialize
			synchronized (DoubleCheckLockingSingleton.class){
				// Re-check again. Maybe another thread has initialized before
				if(null == INSTANCE){
					INSTANCE = new DoubleCheckLockingSingleton();
				}
			}
		}
		// Do something after get instance ...
		return INSTANCE;
	}
}
