package org.junittesting;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {

	@BeforeSuite 
	private void tc0() {
System.out.println("test0 - method beforesuite");
	}
	@BeforeTest
	private void tc1() {
		System.out.println("test1 - method beforetest");
		}
	@BeforeClass
	private void tc2() {
		System.out.println("test2 - method beforeclass");
}
	@Test
	private void tc3() {
		System.out.println("test3 - method test");
}
	@BeforeMethod
	private void tc4() {
		System.out.println("test4 - method beforemethod");
}
	@Test
	private void tc5() {
		System.out.println("test5 - method test");
}
	@AfterMethod
	private void tc6() {
		System.out.println("test6 - method aftermethod");
}
	@Test
	private void tc7() {
		System.out.println("test7 - method test");
}
	@AfterTest
	private void tc8() {
		System.out.println("test8 - method after test");
}
	@AfterSuite
	private void tc9() {
		System.out.println("test9 - method aftersuite");
}
}
