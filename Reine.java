public class Reine extends Piece {
	
	private String type_piece;
	
	public Reine(boolean noir) {
		super(noir);
		if (noir == false) {
			this.type_piece = "U+265B";
		}
		else {
			this.type_piece = "U+2655";
		}
	}
	
	public void setType_piece(String type_piece) {
		this.type_piece = type_piece;
	}
	
	public String getType_piece() {
		return this.type_piece;
	}
}
