package h3;

public class Main {
	public static void main(String[] args) {
		int a,b,c,d,arith;
		a = 10;
		b = 20;
		c = a + 10;
		d = b + 100;
		
		arith = 1;
		
		String str = "Wert für a:" + a + "\nWert für b:" + b + "\nWert für c:" + c + "\nWert für d:" + d + "\nWert für arith:" + arith;
	
		System.out.println(str);
		
		if(arith > 1) {
			System.out.println("Weil arith größer als 1 ist, geben wir c aus:" + c);
		}
		if(arith < 1) {
			System.out.println("Weil arith kleiner als 1 ist, geben wir d aus:" + d);
		}
		if(arith == 1) {
			System.out.println("Weil arith gleich 1 ist, geben wir d-c aus:" + (d - c));
		}
		
		
	}
}
