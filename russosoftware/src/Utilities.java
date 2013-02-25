package russosoftware.src;

import java.util.ArrayList;
import java.util.List;

public class Utilities 
{
	public static String convertCharListToString(List<Character> charList) 
	{
		StringBuilder decryptedString = new StringBuilder();
		for(char char1 : charList)
		{
			decryptedString.append(char1);
		}
		return decryptedString.toString();
	}

	public static Integer[] getBinaryValues(String[] src) 
	{
		List<Integer> intList = new ArrayList<Integer>();
		for(String src1 : src)
		{
			intList.add(Integer.parseInt(src1));
		}
		return intList.toArray(new Integer[intList.size()]);
	}
}
