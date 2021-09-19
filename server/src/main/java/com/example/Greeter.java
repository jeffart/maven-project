package com.example;


/**
 * @author Intro
 *
 */
public class Greeter {


  public Greeter() {

  }


 /**
 * @param someone
 * @return
 */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
  
  
 /**
 * @return
 */
public String sayHello() {
	  return "Hello";
  }
}
