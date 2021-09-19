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
 * @return string
 */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
  
  
 /**
 * @return string
 */
public String sayHello() {
	  return "Hello";
  }
}
