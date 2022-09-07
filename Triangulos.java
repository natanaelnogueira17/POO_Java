package aplication;
import java.util.Locale;
import java.util.Scanner;
public class Triangulos {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
}
Scanner sc = new Scanner(System.in);
Triangle x, y;
x - new Triangle ();
x= new Triangle ();
System.out.println("enter the measures of triangle x: ");
x.a = sc.nextDouble();
x.b = sc.nextDouble();
x.c = sc.nextDouble();
System.out.println("enter the measures of triangle y: ");
y.a = sc.nextDouble();
y.b = sc.nextDouble();
y.c = sc.nextDouble();

double p = (x.a+x.b + x.c) / 2 );
double areaX = Math.sqrt(p*(p-xA)*(p -xB) * (p-xC));

p = (yA+yB+yC) / 2 );
double areaY = Math.sqrt(p*(p-yA)*(p -yB) * (p-yC));

System.out.pritln("area X : ", + areaX)
}

}
sc.close();
}