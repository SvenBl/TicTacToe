
public class Board {
	private String[][] feld;
	
	public Board(){
		feld = new String[3][3];
		for(int y= 0; y< 3;y++){
			for(int x= 0; x< 3;x++){
				feld[x][y]= "leer";
			}
		}
		
	}
	
	public void setMark(int x, int y, boolean spieler1) throws InvalidPositionException{
		if(x<3 && y<3){
			if(spieler1==true){
				feld[x][y]="X";
			}
			else{
				feld[x][y]="O";
			}
		}
		else{
			throw new InvalidPositionException(x + " oder " + y + " liegt ausserhalf des Spielfeldes!");
		}		
	}
	
	public String getMark(int x, int y){
		return feld[x][y];
	}
	
	public boolean hasWinner(){
		if(
		(feld[0][0].equals("X") && feld[0][1].equals("X") && feld[0][2].equals("X"))	||	//obere reihe
		(feld[1][0].equals("X") && feld[1][1].equals("X") && feld[1][2].equals("X"))	||	//mittlere reihe
		(feld[2][0].equals("X") && feld[2][1].equals("X") && feld[2][2].equals("X"))	|| 	//untere reihe
		
		(feld[0][0].equals("X") && feld[1][0].equals("X") && feld[2][0].equals("X"))	||	//linke reihe
		(feld[0][1].equals("X") && feld[1][1].equals("X") && feld[2][1].equals("X"))	||	//mittlere reihe
		(feld[0][2].equals("X") && feld[1][2].equals("X") && feld[2][2].equals("X"))	||	//rechte reihe
		
		(feld[0][0].equals("X") && feld[1][1].equals("X") && feld[2][2].equals("X"))	||	//diagonale 1
		(feld[2][0].equals("X") && feld[1][1].equals("X") && feld[0][2].equals("X"))	||	//diagonale 2		

		(feld[0][0].equals("O") && feld[0][1].equals("O") && feld[0][2].equals("O"))	||	//obere reihe
		(feld[1][0].equals("O") && feld[1][1].equals("O") && feld[1][2].equals("O"))	||	//mittlere reihe
		(feld[2][0].equals("O") && feld[2][1].equals("O") && feld[2][2].equals("O"))	|| 	//untere reihe
		
		(feld[0][0].equals("O") && feld[1][0].equals("O") && feld[2][0].equals("O"))	||	//linke reihe
		(feld[0][1].equals("O") && feld[1][1].equals("O") && feld[2][1].equals("O"))	||	//mittlere reihe
		(feld[0][2].equals("O") && feld[1][2].equals("O") && feld[2][2].equals("O"))	||	//rechte reihe
		
		(feld[0][0].equals("O") && feld[1][1].equals("O") && feld[2][2].equals("O"))	||	//diagonale 1
		(feld[2][0].equals("O") && feld[1][1].equals("O") && feld[0][2].equals("O"))		//diagonale 2		
		){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		/*try {
			board.setMark(0,0,true);
			board.setMark(0,1,true);
			board.setMark(0,2,true);
		} catch (InvalidPositionException e) {
			e.printStackTrace();
		}*/
		System.out.println(board.hasWinner());

		
	}

}
