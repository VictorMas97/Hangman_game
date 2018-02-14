
public class Ahorcado {
	
	private int fallos;
	
	public void pintarAhorcado(){
		
		
		switch(fallos){
			
		case 0:			
			System.out.println("+------+");
			System.out.println("|      |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("+---------------");
			break;
			
		case 1:
			System.out.println("+------+");
			System.out.println("|      |");
			System.out.println("|      #");
			System.out.println("|     (_)");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("+---------------");			
			break;
			
		case 2:
			System.out.println("+------+");
			System.out.println("|      |");
			System.out.println("|      #");
			System.out.println("|     (_)");
			System.out.println("|     [ ]");
			System.out.println("|     [_]");
			System.out.println("|");
			System.out.println("|");
			System.out.println("+---------------");			
			break;
			
		case 3:
			System.out.println("+------+");
			System.out.println("|      |");
			System.out.println("|      #");
			System.out.println("|     (_)");
			System.out.println("|  x--[ ]");
			System.out.println("|     [_]");
			System.out.println("|");
			System.out.println("|");
			System.out.println("+---------------");			
			break;
			
		case 4:
			System.out.println("+------+");
			System.out.println("|      |");
			System.out.println("|      #");
			System.out.println("|     (_)");
			System.out.println("|  x--[ ]--x");
			System.out.println("|     [_]");
			System.out.println("|");
			System.out.println("|");
			System.out.println("+---------------");			
			break;
			
		case 5:
			System.out.println("+------+");
			System.out.println("|      |");
			System.out.println("|      #");
			System.out.println("|     (_)");
			System.out.println("|  x--[ ]--x");
			System.out.println("|     [_]");
			System.out.println("|    _|");
			System.out.println("|");
			System.out.println("+---------------");		
			break;
			
		case 6:
			System.out.println("+------+");
			System.out.println("|      |");
			System.out.println("|      #");
			System.out.println("|     (_)");
			System.out.println("|  x--[ ]--x");
			System.out.println("|     [_]");
			System.out.println("|    _| |_");
			System.out.println("|");
			System.out.println("+---------------");			
			break;		
		}
	}
	
	public void setFallos(int fallos) {
		this.fallos = fallos;
	}
	
	
}
