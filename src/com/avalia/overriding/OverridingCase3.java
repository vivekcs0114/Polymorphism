package com.avalia.overriding;

public class OverridingCase3 {
	public  int  method() {
		return 1;
	}

	abstract class childCase3 extends OverridingCase3 {
		public abstract int  method();
	}
}
