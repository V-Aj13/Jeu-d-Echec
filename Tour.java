public class Tour extends Piece {
	
	private String type_piece;
	
	public Tour(boolean noir) {
		super(noir);
		if (noir == false) {
			this.type_piece = "U+265C";
		}
		else {
			this.type_piece = "U+2656";
		}
	}
	
	public void setType_piece(String type_piece) {
		this.type_piece = type_piece;
	}
	
	public String getType_piece() {
		return this.type_piece;
	}
}