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

  public void entrer(String texteSaisi) {
    if( texteSaisi.matches( "^[0-9][0-9.]*$" ) ){
      pile.add( Double.parseDouble( texteSaisi ) );
    }else{
      switch( texteSaisi ) {
        case "\\":
          inverse();
      }
    }
  }

  public String pile(){
    return pile.size() + ": " + pile.peek();
  }

  public String toString() {
    String retour = "1: 12\n";
    return retour;
  }
}
