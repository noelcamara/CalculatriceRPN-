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
  
  public void addition()
{
	int res = 0;

	res = pile.pop() + pile.pop();

	pile.add(res);
}

public void soustraction()
{
	int res = 0;
	double op1, op2;
	
	int op2 = pile.pop();
	int op1 = pile.pop()

	res = op1 - op2;

	pile.add(res);
}

public void modulo()
{
	int res = 0;
	
	int op2 = pile.pop();
	int op1 = pile.pop()

	res = op1 % op2;

	pile.add(res);
}

public void divisionEuclidienne()
{
	int res = 0;

	int op2 = pile.pop();
	int op1 = pile.pop()

	res = op1 / op2;


	pile.add(res);
}
public void puissance()
{
	int op2 = pile.pop();
	int res,op1 = pile.pop()

	for(int i=1; i <= (op2 -1); i++)
	{
		res *= op1;
		
	}
	
	pile.add(res);
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

