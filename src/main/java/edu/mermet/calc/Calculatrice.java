package edu.mermet.calc;

import java.util.Stack;
/**
 * Calculatrice RPN.
 *
 */
public class Calculatrice{

	  private Stack<Double> pile;

	  public Calculatrice(){
	    pile = new Stack<>();
	  }


  
  public void entrer(String texteSaisi) {
  }

  
  public void produit(){
	  pile.add( pile.pop() * pile.pop());
  }
  public void division(){
	  pile.add(pile.pop() / pile.pop());
  }  
  public void oppposit(){
	  pile.add(-pile.pop());
	  //pile.add(-pile.pop().doubleValue()); 
  }
  
  public void puissance(){
	  pile.add(Math.pow(pile.pop(), 2));
  }

  public void cosinus(){
	  pile.add(Math.cos(pile.pop()));
  }
  
  public void tangente(){
	  pile.add(Math.tan(pile.pop()));
  }
  public void exponetielle(String op1){
	  pile.add(Math.exp(pile.pop()));
  }
  public void raz(){
	  pile.clear();
  }
  
  public static void main(String[] args) {
	  Calculatrice c = new Calculatrice();
	  c.pile.add(2.0);
	  c.pile.add(3.0);
	  c.produit();
	  c.oppposit();
	  for(Double i : c.pile) {
	      System.out.println(i);
	  }
  }
}

