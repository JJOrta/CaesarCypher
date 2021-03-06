
public class CaesarCypher {
	public int key;
	
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRTUVXYZ";
	
	private static String shiftedAlphabet;
	
	public CaesarCypher(int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0, key);
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;
	}
	public String encode (String clearText) {
		String cypherText = "";
		for (int i= 0; i<clearText.length(); i++) {
			cypherText += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
		}
		return cypherText;
	}
	
}
