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
				case 1: 

					for(int f=0; f<table.length; f++){
						for (int c=0; c<table[f].length; c++) {	
							System.out.print(table[f][c] + " ");
						}
						System.out.println();
					}

					do{
						System.out.print("Ingrese fila: ");
						x = scan.nextInt();
						if(x<0 || x>table.length){
							System.out.println("Fila Incorrecta!");
						}
					}while(x<0 || x>table.length);

					do{
						System.out.println("Ingrese columna:");
						y= scan.nextInt();

					}while(y<0|| y > table.length);
				break;
			}
		}while(rest!=2);
	}
}