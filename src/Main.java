import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Lista lista = new Lista();
		int valor = 0;
		String nombre; 
		String apellidos;
		String DNI;
		int edad;
		String calle;
		int numero;
		int cp;
		String provincia;
		
		do {
			
			System.out.println("MENÚ");
			System.out.println("PULSE 1 PARA CARGAR LOS DATOS DE LA TABLA EN LA LISTA");
			System.out.println("PULSE 2 PARA LISTAR TODAS LAS PERSONAS DE LA LISTA");
			System.out.println("PULSE 3 PARA INSERTAR UNA PERSONA AL FINAL DE LA LISTA");
			System.out.println("PULSE 4 PARA ELIMINAR UNA PERSONA DE LA LISTA");
			System.out.println("PULSE 5 PARA MOSTRAR EL NÚMERO DE PERSONAS DE LA LISTA");
			System.out.println("PULSE 6 PARA BUSCAR UNA PERSONA POR SU DNI");
			System.out.println("PULSE 7 PARA ORDENAR LOS ELEMENTOS DE LA LISTA POR ARRAY");
			System.out.println("PULSE 8 PARA GUARDAR EN UN FICHERO CSV");
			System.out.println("PULSE 0 PARA SALIR DEL PROGRAMA");
			
			valor = sc.nextInt();
			switch(valor) {
			
				case 1:
					
					lista.cargar();
					break;
					
				case 2:
					
					lista.listar();
					break;
					
				case 3:
					
					System.out.println("Escriba el nombre de la persona : ");
					nombre = sc.next();
					System.out.println("Escriba los apellidos de la persona : ");
					apellidos = sc.next();
					System.out.println("Escriba el DNI de la persona : ");
					DNI = sc.next();
					System.out.println("Escriba la edad de la persona : ");
					edad = sc.nextInt();
					System.out.println("Escriba la calle de la persona : ");
					calle = sc.next();
					System.out.println("Escriba el numero de domicilio de la persona : ");
					numero = sc.nextInt();
					System.out.println("Escriba el codigo postal de la persona : ");
					cp = sc.nextInt();
					System.out.println("Escriba la provincia de la persona : ");
					provincia = sc.next();
					lista.insertar(nombre, apellidos, DNI, edad, calle, numero, cp, provincia);
					break;
					
				case 4:
					
					System.out.println("Especifique la posición del array que desea eliminar:");
					int posicion = sc.nextInt();
					try {
					lista.eliminar(posicion);
					
					}catch(ArrayIndexOutOfBoundsException excepcion) {
						
						System.out.println("La posición introducida no existe");
						
					}
					
					break;
					
				case 5:
					
					lista.contar();
					break;
					
				case 6:
					
					System.out.println("Introduzca el DNI de la persona que desea buscar");
					String dni = sc.next();
					lista.buscar(dni);
					break;
					
				case 7:
					
					lista.ordenar();
					break;
					
				case 8:
					
					lista.guardar();
					break;
					
				case 0:
					
					System.out.println("Saliendo del programa.");
					break;
					
				default:
					
					System.out.println("El número introducido no es correcto");					
			
			}
			
			
		}while(valor != 0);
		
		sc.close();

	}

}
