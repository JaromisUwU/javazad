import java.util.Scanner;
class liczeniel {
 	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
        System.out.print("podaj wyraz");
        String a = scan.nextLine();
        int dlugosc = a.length();
        System.out.print("dlugosc wyrazu = "+dlugosc);
 	}
 }