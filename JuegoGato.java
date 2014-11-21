import java.util.Scanner;
public class JuegoGato{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
		char[][] table= new Char[3][3];
=======
		char[][] table= new char[3][3];
>>>>>>> 01b98ae75399ce61b0f373a2434c4476663a6afe
		boolean win = false, turno=true;
		int resp, x,y;

		do{
			System.out.println("1. Jugar X-O");
			System.out.println("Ingrese fila: ");

			System.out.print("Ingrese Opcion: ");
			resp = scan.nextInt();
			switch(resp){
<<<<<<< HEAD
				case 1:




				do{
					System.out.println("Ingrese columna:");
					y= lea.nextInt();

				}while(y<0|| y > table.length);
=======
				case 1: 
					do{
						System.out.print("Ingrese fila: ");
						x = scan.nextInt();
						if(x<0 || x>table.length){
							System.out.println("Fila Incorrecta!");
						}
					}while(x<0 || x>table.length);
>>>>>>> 01b98ae75399ce61b0f373a2434c4476663a6afe
				break;
			}
		}while(rest!=2);
	}
}