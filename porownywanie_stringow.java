import java.util.Scanner;
class porownywanie_stringow {
 	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
        System.out.print("podaj haslo : ");
        String s = scan.next();
		final String h = "jajo";
        if(s.equals(h) ){
			System.out.println("te same hasla");
		}
		else{
			System.out.println("nie dziala twoje haslo");
		}
 	}
 }