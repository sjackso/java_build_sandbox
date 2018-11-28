package io.musedev.mvn_test;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void exceptionInstatiator(){
        new Exception();
    }

    public int downcastProblems( double x ) {
        return Math.round( (int)(x) );
    }

    public int deadVar(){
        int x = 123;
        return 49;
    }

    public int deprecatedStuff(){
        java.util.Date myDate = new java.util.Date();
        int currentDay = myDate.getDay();
        return currentDay;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
