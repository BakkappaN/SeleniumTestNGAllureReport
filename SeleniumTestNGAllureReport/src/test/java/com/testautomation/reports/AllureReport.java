package com.testautomation.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureReport {
  @Test
  public void testReport1() {
	  System.out.println("test1 is running");
  }
  
  @Test
  public void testReport2() {
	  System.out.println("test2 is running");

  }
  
  @Test
  public void testReport3() {
	  Assert.assertTrue(false);
	  System.out.println("test3 is running");

  }
}
