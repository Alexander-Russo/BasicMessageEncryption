package russosoftware.src;

import java.util.ArrayList;
import java.util.List;

import russosoftware.src.EncryptionEnum.Char;

/**
 * @author Alexander Russo
 * @version 1.0.0.0
 * 
 * Decryption Utilities created for usage in other areas of the Encryption Program
 **/
public class DecryptionUtilities 
{
	public static char decryptChar(int binary)
	{
		Char[] chars = Char.values();
		for(Char char1 : chars)
		{
			if(binary == char1.getBinaryVal())
			{
				return char1.getDecryptedChar();
			}
		}
		return (Character)null;
	}
	
	public static char decryptChar(char character)
	{
		Char[] chars = Char.values();
		for(Char char1: chars)
		{
			if(character == char1.getEncryptedChar())
			{
				return char1.getDecryptedChar();
			}
		}
		return (Character)null;
	}
	
	public static String decryptChars(List<Character> chars)
	{
		char[] chars2 = new char[chars.size()];
		int index = 0;
		for(char char1: chars)
		{
			chars2[index] = char1;
			index++;
		}
		return decryptChars(chars2);
	}
	
	public static String decryptChars(char[] chars)
	{
		List<Character> charList = new ArrayList<Character>();
		Char[] enumChars = Char.values();
		for(char char1 : chars)
		{
			for(Char char2 : enumChars)
			{
				if(char1 == char2.getEncryptedChar())
				{
					charList.add(char2.getDecryptedChar());
				}
			}
		}
		return Utilities.convertCharListToString(charList);
	}
	
	public static String decryptChars(int[] binary)
	{
		List<Character> charList = new ArrayList<Character>();
		Char[] enumChars = Char.values();
		for(int binaryVal : binary)
		{
			for(Char char1 : enumChars)
			{
				if(binaryVal == char1.getBinaryVal())
				{
					charList.add(char1.getDecryptedChar());
				}
			}
		}
		return Utilities.convertCharListToString(charList);
	}
}
