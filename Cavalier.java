public class Cavalier extends Piece {
	
	private String type_piece;
	
	public Cavalier(boolean noir) {
		super(noir);
		if (noir == false) {
			this.type_piece = "U+265E";
		}
		else {
			this.type_piece = "U+2658";
		}
	}
	
	public void setType_piece(String type_piece) {
		this.type_piece = type_piece;
	}
	
	public String getType_piece() {
		return this.type_piece;
	}
}