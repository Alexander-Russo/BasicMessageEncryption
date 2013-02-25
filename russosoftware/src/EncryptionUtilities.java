package russosoftware.src;

import java.util.ArrayList;
import java.util.List;

import russosoftware.src.EncryptionEnum.Char;

public class EncryptionUtilities 
{
	public static String encryptString(final String str)
	{
		List<Character> charList = new ArrayList<Character>();
		char[] decryptedStrChars = str.toCharArray();
		Char[] chars = Char.values();
		
		for(char char1 : decryptedStrChars)
		{
			for(Char char2 : chars)
			{
				if(char1 == char2.getDecryptedChar())
				{
					charList.add(char2.getEncryptedChar());
				}
			}
		}
		return Utilities.convertCharListToString(charList);
	}
}
