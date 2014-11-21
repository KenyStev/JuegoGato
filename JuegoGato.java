import java.util.Scanner;
public class JuegoGato{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] table= new Char[3][3];
		boolean win = false, turno=true;
		int resp, x,y;

		do{
			System.out.println("1. Jugar X-O");
			System.out.println("Ingrese fila: ");

			System.out.print("Ingrese Opcion: ");
			resp = scan.nextInt();
			switch(resp){				
				case 1: 
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
						if(y<0 || y>table.length){
							System.out.println("Fila Incorrecta");
						}
					}while(y<0 || y> table.length);

				break;
			}
		}while(rest!=2);
	}
}