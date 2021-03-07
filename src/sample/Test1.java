package sample;

import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void a() {
		System.out.println("Test1 a");	
		System.out.println("Test1 a");	
		System.out.println("Test1 a");	
	}
	
	@Test
	public void b() {
		System.out.println("Test1 b");	
		System.out.println("Test2 c");	
		System.out.println("Test2 c");	

	}

	@Test
	public void b2() {
		System.out.println("Test1 b2");	
		System.out.println("Test2 c");	
		System.out.println("Test2 c");	

	}
	
	@Test
	public void c2() {
		System.out.println("Test1 b2");	
	}
	
	@Test
	public void c3() {
		System.out.println("Test1 b2");	
	}

}
