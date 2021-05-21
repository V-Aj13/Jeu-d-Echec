public abstract class Piece {
	
	private boolean noir;
	public String type_piece;
	
	public Piece (boolean noir)
	{
		this.setNoir(noir);
	}
	
	public void setNoir(boolean noir) {
		this.noir = noir;
	}
	 
	public boolean getNoir()
	{
		return this.noir;
	}

}	
