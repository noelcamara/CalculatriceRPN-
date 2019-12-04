package edu.mermet.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculatrice c = new Calculatrice();

        //mode automatique
        if(args.length > 0){
            for( String s:args ){
                c.entrer( s );
            }
        //mode interactif
        }else{
            Scanner s = new Scanner( System.in );
            String entree = s.next();
            while( !entree.equals("quit") ){
                c.entrer( entree );
                System.out.println( c.pile() );
                entree = s.next();
            }
        }
    }
}
