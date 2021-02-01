//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Julian Matuszewski
//Date - 2/1/21

//add imports as needed
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
 public static void main( String args[] )
 {
    System.out.println( ListLast.doesRepeatLast( Arrays.asList(21,32,43,124,5)));//false
    System.out.println( ListLast.doesRepeatLast( Arrays.asList(12,1342,54,7,-1,12)));//true
    System.out.println( ListLast.doesRepeatLast( Arrays.asList(213,231,1231,213,213)));//true
    System.out.println( ListLast.doesRepeatLast( Arrays.asList(-999,213,1023,900,32,56)));//false
 }
}