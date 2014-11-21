import java.util.Scanner;
public class JuegoGato{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] table= new char[3][3];
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
						for(int f=0; f<table.length; f++){
							for (int c=0; c<table[f].length; c++) {
								
							}
						}

						System.out.print("Ingrese fila: ");
						x = scan.nextInt();
						if(x<0 || x>table.length){
							System.out.println("Fila Incorrecta!");
						}
					}while(x<0 || x>table.length);
				break;
			}
		}while(rest!=2);
	}
}