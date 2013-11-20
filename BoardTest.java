import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BoardTest {
	private Board board;
	
	@Before
	public void initialize(){
		board = new Board();
		
	}
	
	@Test
	public void noWinnerCauseEmpty(){
		assertEquals(false,board.hasWinner());
	}
	
	@Test
	public void gotWinner() throws InvalidPositionException{
		board.setMark(0,2,true);
		board.setMark(0,0,false);
		board.setMark(1,1,true);
		board.setMark(1,2,false);		
		board.setMark(2,0,true);
		assertEquals(true,board.hasWinner());
	}
	
	@Test
	public void noWinner() throws InvalidPositionException{
		board.setMark(0,0,true);
		board.setMark(0,1,false);
		board.setMark(0,2,true);
		board.setMark(1,0,false);
		board.setMark(1,1,true);
		board.setMark(1,2,true);
		board.setMark(2,0,false);
		board.setMark(2,1,true);
		board.setMark(2,2,false);
		assertEquals(false,board.hasWinner());
	}
	
	@Test (expected = InvalidPositionException.class)
	public void outOfArray() throws InvalidPositionException{
		board.setMark(3,3,true);
	}


}
