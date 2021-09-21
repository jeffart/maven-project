package com.example;


/**
* The Greeter program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  emd
* @version 1.0
* @since   2014-03-31 
*/
public class Greeter {


  public Greeter() {

  }
 
  /**
   * This method is used to print.
   * a simple hello world.
   *
   * @param someone description de argument.
   * @return string.
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
  
}
