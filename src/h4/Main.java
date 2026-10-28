package h4;

public class Main {
	public static void main (String[] args) {
		// Aufgabe 4a)
		System.out.println("Aufgabe 4a)");
		int a,b,div;
		a = 50;
		b = 5;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt: " + div);
		
		// Aufgabe 4b)
		System.out.println();
		System.out.println("Aufgabe 4b)");
		
		System.out.println("Division funktioniert auch, wenn eine oder beide Zahlen negativ sind");
		a = -50;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt: " + div);
		System.out.println("oder");
		b = -5;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt: " + div);	
	
		// Aufgabe 4c)
		System.out.println();
		System.out.println("Aufgabe 4c)");
		
		System.out.println("Man kann auch 0 durch eine andere Zahl teilen.");
		a = 0;
		b = 5;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt: " + div);	
		
		// Aufgabe 4d)
		System.out.println();
		System.out.println("Aufgabe 4d)");
		System.out.println("Wenn wir versuchen durch 0 zu teilen bekommen wir folgende Error Message:");
		try {
		a = 50;
		b = 0;
		div = a/b;
		
			System.out.println(a + " geteilt durch " + b + " ergibt: " + div);			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		// Aufgabe 4e)
		System.out.println();
		System.out.println("Aufgabe 4e)");
		System.out.println("Wenn Dezimalzahlen bei einer Division entstehen, wird immer die nächst kleinere ganze Zahl ausgegeben");
		
		a = 1;
		b = 2;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt: " + div + " anstatt 0,5 oder 1 würde man richtig runden.");
		
		a = 5;
		b = 3;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt: " + div + " anstatt 1,6 oder 2 würde man richtig runden.");
		
		// Aufgabe 4f)
		System.out.println();
		System.out.println("Aufgabe 4f)");
		System.out.println("Option A is richtig, weil immer gegen 0 gerundet wird. Und für Wert C setzen wir -1 ein, da - 1,67 gegen 0 gerundet wird.");
		
		a = 10;
		b = -6;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt für Wert C: " + div);
		
		a = 18;
		b = -4;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt: " + div);
		
		// Aufgabe 4g)
		System.out.println();
		System.out.println("Aufgabe 4g)");
		System.out.println("Option A is richtig, weil immer gegen 0 gerundet wird. Und für Wert C setzen wir -1 ein, da - 1,67 gegen 0 gerundet wird.");
			
		a = -10;
		b = 6;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt für Wert C: " + div);
		
		a = -15;
		b = 4;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt: " + div);
		

		// Aufgabe 4h)
		System.out.println();
		System.out.println("Aufgabe 4h)");
		System.out.println("Option A is richtig, weil immer gegen 0 gerundet wird. Und für Wert C setzen wir 1 ein, da 1,67 gegen 0 gerundet wird.");
		
		a = -10;
		b = -6;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt für Wert C: " + div);
		
		a = -15;
		b = -4;
		div = a/b;
		System.out.println(a + " geteilt durch " + b + " ergibt: " + div);
		
		
		
	}
	
}
