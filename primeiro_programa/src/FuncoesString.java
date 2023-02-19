
public class FuncoesString {

	public static void main(String[] args) {
		String original = "abcde FHGSAS asas  ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a','x');
		String s07 = original.replace("abc","xwz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("as");
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		for(String texto: vect) {
			System.out.println(texto);	
		}
		
		
		System.out.println(original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		
		

		
		
		

	}

}
