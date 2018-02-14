import java.util.*;
public class JuegoAhorcado {
	
	
	private int numero;
	private Scanner teclado;
	private String nombre;
	private String peliculas [] = {"LA VIDA ES BELLA", "EL PADRINO", "INTOCABLE", "RED SPCIAL", "LA LISTA DE SCHINDLER", "FORREST GUMP", "STAR WARS", "CADENA PERPETUA", "EL LOBO DE WALL STREET", 
	"EL SEÑOR DE LOS ANILLOS", "AVATAR", "GRAN TORINO", "SLUMDOG MILLONAIRE", "DIAMANTES DE SANGRE", "OCHO APELLIDOS VASCOS", "INVICTUS", "SHREK", "LO IMPOSIBLE", "LA VIDA DE PI", "HOTEL RUANDA", 
	"EL JARDINERO FIEL", "EL DISCURSO DEL REY", "INTERSTELLAR", "MILLION DOLAR BABY", "GLADIATOR", "BRAVEHEART", "TOY STORY", "REGRESO AL FUTURO", "INDIANA JONES", "BATMAN BEGINS", "INFILTRADOS", 
	"TERMINATOR", "EL SEXTO SENTIDO", "EL SHOW DE TRUMAN", "PIRATAS DEL CARIBE", "DOCTOR ZHIVAGO", "HARRY POTTER", "JURASSIC PARK", "SALVAR AL SOLDADO RYAN", "UNA MENTE MARAVILLOSA", "DEJA VU", 
	"CIUDAD DE DIOS", "MATRIX", "EL REY LEON", "EDUARDO MANOSTIJERAS", "EL PIANISTA"};
	
	
	public JuegoAhorcado() {		
		teclado = new Scanner(System.in);		
	}
	
	Random rnd = new Random();
	Ahorcado ah = new Ahorcado();
	Palabra p = new Palabra();
    
	
	public void ejecutar() {
		String pelicula;
		char guiones [];
		String letra;
		int aciertos;
		int fallos;
		boolean letraRepetida;
		boolean dentroLetra;
		String otraPartida = "S";
		
		
		System.out.println("Bienvenido al juego del ahorcado\n");
		System.out.println("Descubre la película\n");
		
		System.out.print("¿Como te llamas?: ");
		nombre = teclado.nextLine();
		
		while(otraPartida.charAt(0) == 'S' ){			
			
			fallos = 0;
		    ah.setFallos(fallos);
			numero = rnd.nextInt(peliculas.length);
			pelicula = peliculas[numero];
		
		
			p.setPelicula(pelicula);
			p.igualar();
			p.contarEspacios();
			aciertos = p.getAciertos();
			guiones = p.getGuiones();
			p.llenarGuiones();		
		
			                  //El Juego
			
			while(fallos < 7 && aciertos < pelicula.length()+1){	
				System.out.println();
				ah.pintarAhorcado();
			
				System.out.print("Película: ");			
				System.out.println(guiones);
				System.out.println();
			
				if(fallos < 6 && aciertos < pelicula.length()){
				
					do{
						System.out.print(nombre +", elige una letra: ");
						letra = teclado.nextLine();
						letra = letra.toUpperCase();
						System.out.println();
						p.setLetra(letra);
					
						p.comprobarLetraRepetida();
						letraRepetida = p.getLetraRepetida();
					
						if(letra.charAt(0) == ' '){
							System.out.println( "No se puede introducir espacios!\n");
						}
						else if(letraRepetida == true){
							System.out.println( "La letra seleccionada ya es visible\n");
							}					
					}while(letra.charAt(0) == ' ' || letraRepetida == true);		
				}
				else if(fallos == 6){
					System.out.println(nombre +" has perdido, te han ahorcado!!\n");
					System.out.println("Película: "+pelicula+ "\n");
					break;
        		}
				else{
				
					System.out.println("Felicidades "+nombre+", has adivinado la película!!\n");				
					break;
        		}			
				p.comprobarLetra();
				dentroLetra = p.getDentroLetra();
			
				aciertos = p.getAciertos();

				if(dentroLetra == true){					
					System.out.println( "Letra encontrada!\n");           
				}
				else{
					fallos++;
					ah.setFallos(fallos);
					System.out.println( "Letra no encontrada! Estás más cerca de que te ahorquen\n");					
				}				
			}			
			System.out.print( "Otra partida?: ");	
			do{
				otraPartida = teclado.nextLine();				
				otraPartida = otraPartida.toUpperCase();
				System.out.println();
				
				if(otraPartida.charAt(0) != 'S' && otraPartida.charAt(0) != 'N'){
					System.out.print( "Respuesta no valida (Introduzca s o n): ");           
				}
			}while(otraPartida.charAt(0) != 'S' && otraPartida.charAt(0) != 'N');
			
			for(int i = 0 ; i < 25 ; i++){
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		new JuegoAhorcado().ejecutar();		
	}
}