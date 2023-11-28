package responsi_uts;

public class Piece {
	private int posX, posY;
	private char icon;
	
	public Piece(int posX, int posY, char icon) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.icon = icon;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public char getIcon() {
		return icon;
	}

	public void setIcon(char icon) {
		this.icon = icon;
	}

	
	
	
	
}
