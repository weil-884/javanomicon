package ppj.training.tasks.one;

public class StringEncoder {

	public static void main(String[] args) {
		
		String szyfrTestowy = encode("testowy string encoder");
		System.out.println(szyfrTestowy);
		System.out.println(decode(szyfrTestowy));
	
	}
	
	public static String encode(String s) {
		char[] ch = s.toCharArray();
		char[] encoded = new char[ch.length];
		
		for (int i = 0; i < ch.length; i++) {
			encoded[i] = (char) (ch[ch.length - 1 - i] + (ch.length -1 - i));
			
		}
		
		String sEncoded = new String(encoded);
		
		return sEncoded;
	}
	
	public static String decode(String s) {
		char[] ch = s.toCharArray();
		char[] decoded = new char[ch.length];
		
		for (int i = 0; i < ch.length; i++) {
			decoded[i] = (char) (ch[ch.length - 1 - i] - i);
		}
		
		String sDecoded = new String(decoded);
		
		return sDecoded;
	}
	
}
