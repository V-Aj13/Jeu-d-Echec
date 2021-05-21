public class Spot{
    private int x;
    private int y;
    private Piece piece;

    public Spot(int x, int y, Piece piece)
    {
        this.setX(x);
        this.setY(y);
        this.setPiece(piece);
    }

    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    
    public Piece getPiece()
    {
    	return this.piece;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    
    public void setPiece(Piece piece)
    {
    	this.piece = piece;
    }
}