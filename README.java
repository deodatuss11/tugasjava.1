///Deodatus F.M. Jordan///
///A11.2017.10234///

public class tugas1 {
	public static void main(String[] args) {
	
	int a1=-5, a2=8, a3=6;
	int b1=55, b2=9, b3=9;
	int c1=20, c2=-3, c3=5, c4=8;
	int d1=5, d2=15, d3=3, d4=2, d5=8, d6=3;
	int hasila ;
	int hasilb ;
	int hasilc ;
	int hasild ;
	String soal1= "-5+8*6 =";
	String soal2= "(55+9)%9 =";
	String soal3= "20+-3*5/8 =";
	String soal4= "5+15/3*2-8%3 =";
	hasila = a1+a2*a3;
	hasilb = (b1+b2)%b3;
	hasilc = c1+c2*c3/c4;
	hasild = d1+d2/d3*d4-d5%d6;
	System.out.println(soal1+" "+hasila);
	System.out.println(soal2+" "+hasilb);
	System.out.println(soal3+" "+hasilc);
	System.out.println(soal4+" "+hasild);
	
	
	}
}
