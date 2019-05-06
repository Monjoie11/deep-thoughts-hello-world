package edu.cnm.deepdive.prework;

public class HelloWorld {

  public static void main(String[] args) {
      salute( (args.length > 0) ? args[0] : "unfathomable nothingness" ) ;
  }
 private static void salute(String target) {
    System.out.println("Look," + target + ",I can make my computer do stuff!") ;
 }
}
