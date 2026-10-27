import java.io.*;
public class es5 {
public static void main (String []args) throws Exception {
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int x,y,somma;
System.out.println("inserisci i valori di x e y");
x = Integer.parseInt(input.readLine());
y = Integer.parseInt(input.readLine());
somma = x + y;
if (somma>=50) {
System.out.println("la somma è maggiore o uguale di 50: " + somma);
}
else {
System.out.println("la somma è minore di 50: " + somma);    
}
}
}