
public class MyString {
	public static void occurrences(String a, String b) {
		int i = 0;
		int Haeufigkeit = 0;
//		If index < length, find the a in b from position "index +1"
		while (i <  b.length()) {
//			If a was found in b, Haeufigkeit+1, Loop continue.
			if (b.indexOf(a, i) >= 0) {
					Haeufigkeit++;
					i = b.indexOf(a,i) + 1;
					System.out.println(i);
			}
//			If not, Loop break
			else {
				break;
			}
		}
		System.out.println("Haeufigkeit:" + Haeufigkeit);
	}
	
	public static void alternativeOccurrences(String a, String b) {
		int Haeufigkeit = 0;
		int index = 0;
		while(b.indexOf(a,index)!=-1) {
			index = b.indexOf(a,index)+1;
			Haeufigkeit ++;
		}
		System.out.println("Haeufigkeit:" + Haeufigkeit);
	}

	public static void caseInsensitiveOccurrences(String a, String b){
		a.toLowerCase();
		b.toLowerCase();
		occurrences(a,b);
	}
	public static void main(String args[]) {
//		occurrences("e","Java is in inSpracEe");
//		caseInsensitiveOccurrences("e","Java is in inSpracee");
		alternativeOccurrences("e","Java is in inSpracEeeee");
	}
}
