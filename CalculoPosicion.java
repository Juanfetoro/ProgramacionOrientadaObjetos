class CalculoPosicion{
public static void main(String[] args) {
{
System.out,println("Escriba el valor de v");
String v=System.console().readLine();
System.out.println("Escriba el valor de t");
String t=System.console().readLine();
System.out,println("Escriba el valor de a");
String a=System.console().readLine();
System.out,println("Escriba el valor de xinicial");
String xinicial=System.console().readLine();
double v=Double.parseDouble(v);
double t=Double.parseDouble(t);
double a=Double.parseDouble(a);
double xinicial=Double.parseDouble(xinicial);
double Posicion=0.5*a*Math.pow(t,2)+v*t+xinicial;
System.out.println(Posicion);
}
}