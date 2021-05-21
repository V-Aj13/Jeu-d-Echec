public class Board {
	
    Spot[][] board;
    
    public Board()
    {
    	board = new Spot[8][8];
    }
    
    public void miseEnPlaceBoard(){
    	
    	board[0][0] = new Spot(0,0,new Tour(false));
    	board[0][1] = new Spot(0,1,new Cavalier(false));
    	board[0][2] = new Spot(0,2,new Fou(false));
    	board[0][3] = new Spot(0,3,new Reine(false));
    	board[0][4] = new Spot(0,4,new Roi(false));
    	board[0][5] = new Spot(0,5,new Fou(false));
    	board[0][6] = new Spot(0,6,new Cavalier(false));
    	board[0][7] = new Spot(0,7,new Tour(false));
		
    	board[1][0] = new Spot(1,0,new Pion(false));
    	board[1][1] = new Spot(1,1,new Pion(false));
    	board[1][2] = new Spot(1,2,new Pion(false));
    	board[1][3] = new Spot(1,3,new Pion(false));
    	board[1][4] = new Spot(1,4,new Pion(false));
    	board[1][5] = new Spot(1,5,new Pion(false));
    	board[1][6] = new Spot(1,6,new Pion(false));
    	board[1][7] = new Spot(1,7,new Pion(false));
		
    	board[7][0] = new Spot(7,0,new Tour(true));
    	board[7][1] = new Spot(7,1,new Cavalier(true));
    	board[7][2] = new Spot(7,2,new Fou(true));
    	board[7][3] = new Spot(7,3,new Reine(true));
    	board[7][4] = new Spot(7,4,new Roi(true));
    	board[7][5] = new Spot(7,5,new Fou(true));
    	board[7][6] = new Spot(7,6,new Cavalier(true));
    	board[7][7] = new Spot(7,7,new Tour(true));
		
    	board[6][0] = new Spot(6,0,new Pion(true));
    	board[6][1] = new Spot(6,1,new Pion(true));
    	board[6][2] = new Spot(6,2,new Pion(true));
    	board[6][3] = new Spot(6,3,new Pion(true));
    	board[6][4] = new Spot(6,4,new Pion(true));
    	board[6][5] = new Spot(6,5,new Pion(true));
    	board[6][6] = new Spot(6,6,new Pion(true));
    	board[6][7] = new Spot(6,7,new Pion(true));
		
        for(int i = 2; i < 6; i++)
        {
            for(int j = 0; j < 8; j++)
            {
            	board[i][j] = null;
            }
        }
    }
    
    public Spot[][] getBoard()
    {
    	return board;
    }
    
    public void setBoard(Spot [][] board)
    {
    	this.board = board ;
    }
    
    public void afficher() {
    	Spot test = null;
		for(int i = 0 ; i < 8 ; i++) {
			System.out.println(" -------------------------");
			System.out.print(i + 1);
			for(int j = 0 ; j < 8 ; j++) {
				test = board[i][j];
				if(test != null) {
					System.out.print("|"+ board[i][j].getPiece().getNoir());
				}
				else {
					System.out.print("|  ");
				}
			}
			System.out.print("|");
			System.out.print("\n");
		}
		System.out.println(" -------------------------");
		System.out.println("  A  B  C  D  E  F  G  H");
	}
    
    public static void main(String[] args) 
    {
		Board board = new Board();
		board.miseEnPlaceBoard();
		board.afficher();
    }
}