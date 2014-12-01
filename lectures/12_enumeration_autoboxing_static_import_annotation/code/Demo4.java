class Demo4{
	static void m(Integer v){
		System.out.println("m() received " + v);
	}

	static int m2(){
		return 10;
	}

	static Integer m3(){
		return 99;
	}

	public static void main(String[] args){
		m(199);
		
		Integer myNum = m2();
		System.out.println("Return value from m2() is " + myNum);

		int i = m3();
		System.out.println("Return value from m3() is " + i);

		// Math.sqrt() called with object Integer.
		// Object will be auto-unboxed and its value promoted to double.
		// As Math.sqrt needs a double

		System.out.println("Square root of myNum is " + Math.sqrt(myNum));

		// Auto-unbox myNum, calculate and then rebox.
		++myNum;
		myNum += 21;
		myNum = nyNum + 12;
	}
}