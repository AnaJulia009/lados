 import java.util.Scanner;

//instrução1
//instrução2
//instrução3
//instrução4
//instrução5
//... 

class Lados {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
			Console console = new Console();
    
    		int x = 1;
			int y = 1;
			int z = 1;
			
			String tipo = "isosceles";
			int continuar;
			
			
        
		    if(x == y && x == z){
				console.clear();
				tipo ="equilatero";
				
			}
			
			
			
			if(x != y && x != z){
               console.clear();
			   tipo = "escaleno";
			   
			   
    		System.out.printf("triangulo %5\n\n\n\n\n(:\n\n\n",tipo);
			System.out.printf("Deseja inserir outro triangulo?(1 - Para sim| 2 - para nao|\n");
			continuar = teclado.nextInt();
			
			}
			
			System.exit(0);
			
	}

}
