	import java.util.Scanner;
	public class JuegoGato{
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			char[][] table= new char[3][3];
			boolean win = false, turno=true;
			int resp, x, y, TRES = 3;
			int fx=0,f0=0,cx=0,c0=0,xpx=0,xp0=0;

			do{
				System.out.println("1. Jugar X-O");
				System.out.println("Ingrese fila: ");

				System.out.print("Ingrese Opcion: ");
				resp = scan.nextInt();
				switch(resp){				
					case 1: 

						for(int f=0; f<table.length; f++){
							for (int c=0; c<table[f].length; c++) {	
								table[f][c] = '_';
							}
						}
						do{
							for(int f=0; f<table.length; f++){
								for (int c=0; c<table[f].length; c++) {	
									System.out.print(table[f][c] + " ");
								}
								System.out.println();
							}

							do{
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

								if(table[x][y] == '_' ){
									System.out.println("Celda vacia");
									if(turno){
										table[x][y]= 'X';
									}else{
										table[x][y]= '0';
									}
									turno = !turno;
								}
							}while(table[x][y]=='_');

							for (int i=0; i<TRES; i++) {
								if(table[x][i]=='X'){
									fx++;
									if(fx==TRES){
										System.out.println("Win X por fila: ["+x+"]: ");
										win=true;
										break;
									}
								}else if(table[x][i]=='0'){
									f0++;
									if(f0==TRES){
										System.out.println("Win 0 por fila: ["+x+"]: ");
										win=true;
										break;
									}
								}

								if(table[i][y]=='X'){
									cx++;
									if(cx==TRES){
										System.out.println("Win X por columna: ["+y+"]");
										win=true;
										break;
									}
								}else if(table[i][y]=='0'){
									c0++;
									if(c0==TRES){
										System.out.println("Win 0 por columna: ["+y+"]");
										win=true;
										break;
									}
								}
							}
							fx=0; f0=0; cx=0; c0=0;
						}while(!win);
						win = false;
					break;
				}
			}while(resp!=2);
		}
	}