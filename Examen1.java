public class Examen1

 	public static void main (Strings args[]) 
			 
			//devuelve x multiplicado por 2 (1pt)
			 //creamos una variable y la multiplico por 2
	
			{
	                	return x * 2 ;
                           }
		
			
			//devuelve el numero mayor entre a, b, c y d (2pts)
			int getMayor(int a, int b, int c, int d)
			{
		if(a > b && a > c && a > d)
		{
			System.out.println(a + " es el numero mayor");
			return a;
		}
		else if(b > a && b > c && b > d)
		{
			System.out.println(b + " es el numero mayor");
			return b;
		}
		else if(c > a && c > b && c > d) // similar al ejercicio de tarea ya que creamos todas las variables
		{
			System.out.println(c + " es el numero mayor");
			return c;
		}
		else if(d > a && d > b && d > c)
		{
			System.out.println(d + " es el numero mayor");
			return d;
		}
		else
		{
			System.out.println("Resultado: "+ a +" (Todos los numeros son iguales!)"); // creamos al final 
			return a;
		}
	}
	
				
			
			//Pide 2 nombres de personas.
			//Si los nombres son iguales imprime "Tocayos" de lo contrario imprime "No son tocayos". (2pts)
			void sonTocayos()
			//hay que crear el string para que nos deje poner texto
			
			String nom1;
		String nom2;
		System.out.println("ingrese Nombre: ");
           nom1=s.next();
           System.out.println("ingrese otro nombre: ");  //pedimos que ingrese la segunda variable
           nom2=s.next();
           {
        	   if(nom1.equals(nom2 ))
        	   {
        		   
           
        		System.out.println("son tocayos ");
        	   
        	   }else 
        	   {
        		   System.out.println("no son tocayos ");
        	   }
           }
	}
	
			
			
			//Imprime 100 numeros que sean multiplos de 5(3pts)
			void imprimirMultiplosDe5()
			{
				Scanner teclado=new Scanner(System.in);
		        int multiplo5;
		        {
		        multiplo5=0;
		        
		        for(f=1;f<=10;f++) {
		            System.out.print("Ingrese un valor:");
		            teclado.nextInt();
		            if (5==0) {
		                multiplo5=5+1;
		                {
		                	
		        System.out.print("Cantidad de valores ingresados múltiplos de 5:");
		        System.out.print(multiplo5);
		                }
		            }
		          
			
			//Devuelve true si edad es menor o igual a 25 y promedio mayor o igual a 85 (3pts)
			boolean aplicaBeca(int edad, int promedio)
			{
				return false;
			}
			
			//Pide 4 numeros, si todos son pares devuelve true, de lo contrario devuelve false (4puntos)
			boolean sonPares()
			{
		
	if( edad >= 25 && promedio >= 85)
	{
	return true;
	}
	return false;
		}
			
			//Pueden probar sus funciones en el main pero no es necesario ni será evaluado
			public static void main(String args[])
			{
				
				
				
				//Algunos ejercicios se los copie a Mike Sabillon
			}
		}
	}
}

