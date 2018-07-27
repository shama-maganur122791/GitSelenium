package com.tests;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  System.out.println("in f()");
  }
  
  @Test(priority=0)
  public void xyz()
  {
	  System.out.println("in xyz()");
  }
  
  @Test(priority=1)
  public void testabc()
  {
	  System.out.println("in testabc()");
  }
  
  @Test
  public void lmn()
  {
	  System.out.println("in lmn()");
  }
}
