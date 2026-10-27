import java.io.*;
public class es3 {
public static void main (String []args) throws Exception {
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int num, successivo;
System.out.println ("inserisci un numero");
num=Integer.parseInt(input.readLine());
successivo=num+1;
System.out.print (successivo);
}
}