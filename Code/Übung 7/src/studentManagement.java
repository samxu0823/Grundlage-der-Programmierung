
public class studentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test:Aufgabe a
		examination GdP = new examination("GdP", 1.0);
		examination GdW = new examination("GdW", 1.3);
		System.out.print("name: " + GdP.name);
		System.out.println("  note: " + GdP.note);
		System.out.print("name: " + GdW.name);
		System.out.println("  name: " + GdW.note);

//		Test:Aufgabe d
		noteList NL = new noteList(2);
		examination MM2 = new examination("MM2", 5.0);
		NL.klausurEintragen(GdP);
		NL.klausurEintragen(GdW);
		NL.klausurEintragen(MM2);

//		Test:Aufgabe g
		student s1 = new student("Wei", "Xu");
		student s2 = new student("Sam", "Xu");
		noteList NL2 = new noteList(1);
		NL2.klausurEintragen(MM2);
		s1.leistungsspiegel = NL;
		s2.leistungsspiegel = NL2;
		System.out.println(s1.matrikelnr + " hat " + s1.leistungsspiegel.anzahlKlausuren + " Klausuren absolviert");
		System.out.println(s2.matrikelnr + " hat " + s2.leistungsspiegel.anzahlKlausuren + " Klausuren absolviert");
	}

}
