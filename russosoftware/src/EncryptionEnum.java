package russosoftware.src;

public class EncryptionEnum 
{
	private EncryptionEnum(){}
	
	/**
	 * @author Alexander Russo
	 * @version 1.0.0.0
	 * 
	 * Static Encryption Class used to decrypt messages. Other encryption CharSets may be included at a later date.
	 **/
	public static enum Char
	{
		UPPERCASEA('A', 'G', 0b01101010),
		UPPERCASEB('B', 'i', 0b01110011),
		UPPERCASEC('C', 'F', 0b01101011),
		UPPERCASED('D', 'M', 0b01100101),
		UPPERCASEE('E', 'C', 0b01111000),
		UPPERCASEF('F', 'o', 0b01101000),
		UPPERCASEG('G', 'd', 0b01100001),
		UPPERCASEH('H', 'J', 0b01110111),
		UPPERCASEI('I', 'm', 0b01110001),
		UPPERCASEJ('J', 'c', 0b01111010),
		UPPERCASEK('K', 'K', 0b01101111),
		UPPERCASEL('L', 'b', 0b01110000),
		UPPERCASEM('M', 'T', 0b01110010),
		UPPERCASEN('N', 'E', 0b01111001),
		UPPERCASEO('O', 'L', 0b01110100),
		UPPERCASEP('P', 'I', 0b01110110),
		UPPERCASEQ('Q', 'r', 0b01101001),
		UPPERCASER('R', 'l', 0b01101110),
		UPPERCASES('S', 'g', 0b01100010),
		UPPERCASET('T', 'R', 0b01101101),
		UPPERCASEU('U', 'W', 0b01100011),
		UPPERCASEV('V', 'Y', 0b01100110),
		UPPERCASEW('W', 'k', 0b01100100),
		UPPERCASEX('X', 'B', 0b01101100),
		UPPERCASEY('Y', 'e', 0b01100111),
		UPPERCASEZ('Z', 'S', 0b01110101),
		LOWERCASEA('a', 'N', 0b01101010),
		LOWERCASEB('b', 'f', 0b01110011),
		LOWERCASEC('c', 'X', 0b01101011),
		LOWERCASED('d', 'H', 0b01100101),
		LOWERCASEE('e', 's', 0b01111000),
		LOWERCASEF('f', 'Q', 0b01101000),
		LOWERCASEG('g', 'j', 0b01100001),
		LOWERCASEH('h', 'U', 0b01110111),
		LOWERCASEI('i', 'O', 0b01110001),
		LOWERCASEJ('j', 'y', 0b01111010),
		LOWERCASEK('k', 'D', 0b01101111),
		LOWERCASEL('l', 'q', 0b01110000),
		LOWERCASEM('m', 'a', 0b01110010),
		LOWERCASEN('n', 'v', 0b01111001),
		LOWERCASEO('o', 'Z', 0b01110100),
		LOWERCASEP('p', 'x', 0b01110110),
		LOWERCASEQ('q', 'P', 0b01101001),
		LOWERCASER('r', 't', 0b01101110),
		LOWERCASES('s', 'z', 0b01100010),
		LOWERCASET('t', 'u', 0b01101101),
		LOWERCASEU('u', 'h', 0b01100011),
		LOWERCASEV('v', 'n', 0b01100110),
		LOWERCASEW('w', 'V', 0b01100100),
		LOWERCASEX('x', 'p', 0b01101100),
		LOWERCASEY('y', 'A', 0b01100111),
		LOWERCASEZ('z', 'w', 0b01110101),
		SPACE(' ', ';', 0b00100000),
		CHAR0('0', '6', 0b00110000),
		CHAR1('1', '3', 0b00110001),
		CHAR2('2', '7', 0b00110010),
		CHAR3('3', '1', 0b00110011),
		CHAR4('4', '8', 0b00110100),
		CHAR5('5', '4', 0b00110101),
		CHAR6('6', '9', 0b00110110),
		CHAR7('7', '2', 0b00110111),
		CHAR8('8', '0', 0b00111000),
		CHAR9('9', '5', 0b00111001),
		DASH('-', '/', 0b00101101),
		PERIOD('.', '-', 0b00101110),
		COMMA(',', '.', 0b00101100),
		APOSTROPHE('\'', ',', 0b00100111),
		QUESTIONMARK('?', '\'', 0b00111111),
		EXCLAMATIONPOINT('!', '$', 0b1010101),
		QUOTES('"', '>', 0b01111111),
		LESSTHAN('<', '>', 0b011101),
		GREATERTHAN('>', '"', 0b01100),
		SEMICOLON(';','_', 0b1010101),
		COLON(':', '`', 0b0101010),
		EQUALS('=', '*', 0b101010),
		PLUS('+', '~', 0b101010),
		MINUS('-', '(', 0b10101010),
		OPENPARENTHESES('(', '^', 0b10101010),
		CLOSEDPARENTHESES(')', '%', 0b0101010),
		FOREWARDSLASH('/', '@', 0b0101010),
		BACKSLASH('\\', '&', 0b10101010),
		ASTERISK('*', '+', 0b1010101010), 
		VERTLINE('|', '=', 0b101010101),
		OPENBRACKET('[', '|', 0b0101010),
		CLOSEDBRACKET(']', '#', 0b010101),
		OPENBRACE('{', ')', 0b01010101),
		CLOSEBRACE('}', '!', 0b01010110);
		
		private final char enumChar;
		private final char encryptedChar;
		private final int binaryRepresentation;
		
		Char(final char character, final char encryptedChar, final int binaryRepresentation)
		{
			this.enumChar = character;
			this.encryptedChar = encryptedChar;
			this.binaryRepresentation = binaryRepresentation;
		}
		
		public final char getEncryptedChar()
		{
			return this.encryptedChar;
		}
		
		public final char getDecryptedChar()
		{
			return this.enumChar;
		}
		
		public final int getBinaryVal()
		{
			return binaryRepresentation;
		}
	}
}
