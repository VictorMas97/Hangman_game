
public class Palabra {
	
	private String pelicula;
	private char guiones [];
	private int aciertos;
	private String letra;
	private boolean letraRepetida;
	private boolean dentroLetra;
	
	
	
	public void igualar(){
		guiones = pelicula.toCharArray();	
	}	
	
	public void llenarGuiones(){
		
		for(int i = 0 ; i < pelicula.length() ; i++){
			if(pelicula.charAt(i) == ' '){        		
				guiones[i] = ' ';
			}	
			else{        		
				guiones[i] = '-';
			}   
		}        	
	}
	
	public void contarEspacios(){
		aciertos = 0;
		for(int i = 0 ; i < pelicula.length() ; i++){
			if(pelicula.charAt(i) == ' '){   		
					aciertos++;
			}	
		}        	
	}
	
	public void comprobarLetraRepetida(){
		
		
		letraRepetida = false;
		
		for(int i = 0; i < pelicula.length() ; i++){
			if(letra.charAt(0) == guiones[i]){  
				letraRepetida = true;			
			}
		}			
	}
	
	public void comprobarLetra(){
		
		dentroLetra = false;
			
		for(int i = 0; i < pelicula.length() ; i++){
				
			if(letra.charAt(0) == pelicula.charAt(i)){
				dentroLetra = true;
				aciertos++;
			    guiones[i] = pelicula.charAt(i);
			}
		} 
	}
		
	
	
	public void setPelicula(String pelicula){
		this.pelicula = pelicula;
	}
	
	public char[] getGuiones() {
		return this.guiones;
	}
		
	public int getAciertos() {
		return this.aciertos;
	}
	
	public boolean getLetraRepetida(){
		return this.letraRepetida;
	}	
	
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	public boolean getDentroLetra(){
		return this.dentroLetra;
	}


}