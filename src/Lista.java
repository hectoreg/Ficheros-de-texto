import java.util.*;
import java.io.*;
public class Lista {
	
	ArrayList<Persona> p = new ArrayList<Persona>();
	
	public ArrayList<Persona> getP() {
		return p;
	}

	public void setP(ArrayList<Persona> p) {
		this.p = p;
	}

	public void cargar() {
		
		String csvFile = "fichero.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {


                String[] contenido = line.split(cvsSplitBy);
                int edad = Integer.parseInt(contenido[3]);
                int numero = Integer.parseInt(contenido[3]);
                int cp = Integer.parseInt(contenido[3]);

                Persona p1 = new Persona(contenido[0],contenido[1],contenido[2],edad,contenido[4],numero,cp,contenido[7]);
                p.add(p1);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		 
	    }
		
		
	
	
	public void listar() {
		
		for(Persona s:p) {
			
			System.out.println(s.toString());
			
		}
			
	}
	
	public void insertar(String nombre, String apellidos, String dni, int edad, String calle, int numero, int cp, String provincia) {
		
		p.add(new Persona(nombre, apellidos, dni, edad, calle, numero, cp, provincia));
		
	}
	
	public void eliminar(int posicion) {
	
		p.remove(posicion);
		
	}
	
	public void contar() {
		
		System.out.println("Hay " + p.size() + " personas en la lista");
		
	}
	
	public void buscar(String dni) {
		
		int SeEncontro = 0;
		for (Persona s:p) {
			
			if (s.getDni().equals(dni)) {
				
				System.out.println("La persona que busca es " + s.toString());
				SeEncontro = 1;
				
			}
			
			
		}
		
		if(SeEncontro == 0) {
			
			System.out.println("La persona que busca no se encuentra en la lista.");
			
		}
		
	}
	
	public void ordenar() {
		
	Collections.sort(p);
	System.out.println(p);

}
	
	public void guardar() {
		
		try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ficheroguardado.csv"));
            for(Persona s:p) {
            	bw.write(s.toString());
            	bw.newLine();
            }
        	bw.close();
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        } 
		
	}
	
}
