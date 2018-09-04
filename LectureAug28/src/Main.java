
public class Main {
	public static void main(String[] args) {
		CaesarCypher c = new CaesarCypher(3);
		String clear = "Hello";
		String cyphered = c.encode(clear);
		System.out.println(cyphered);//H > K ,E > H, L > O ,L > O, O > R
		
		
	}

}
