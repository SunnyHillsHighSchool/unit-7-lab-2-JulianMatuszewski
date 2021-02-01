//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Julian Matuszewski
//Date - 2/1/21

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean doesRepeatLast( List<Integer> list)
	{
    //set new int equal to last element
    int last = list.get(list.size()-1);
    //for loop moving through but stopping before last index
    for (int i = 0; i <= list.size()-2; i++)
      //if statement checks if each number equals last
      if (list.get(i) == last) 
        //if passed, return true
        return true;
    //return false if no successful checks
    return false;
	}
}