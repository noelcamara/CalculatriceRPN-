package edu.mermet.calc;

import java.util.Stack;

/**
 * Calculatrice RPN.
 *
 */
public class Calculatrice {

  private Stack<Double> pile;

  public Calculatrice(){
    pile = new Stack<>();
  }

  public void inverse(){
    pile.add( 1/pile.pop() );
  }

  public void log(double x){
    pile.add( Math.log(x)/Math.log(10) );
  }
   public void ln(double x){
    pile.add( Math.log(x) );
  }



  public void entrer(String texteSaisi) {
    if( texteSaisi.matches( "^[0-9][0-9.]*$" ) ){
      pile.add( Double.parseDouble( texteSaisi ) );
    }else{
      switch( texteSaisi ) {
        case "\\":
          inverse();

         case "log":
          log(double x);
          case "ln": ln(double x);

      }
    }
      
   }
  

  public String pile(){
    return pile.size() + ": " + pile.peek();

  }

  public String pile(){
    return pile.size() + ": " + pile.peek();
  }
  
  public String toString() {
    String retour = "1: 12\n";
    return retour;
  }
}

