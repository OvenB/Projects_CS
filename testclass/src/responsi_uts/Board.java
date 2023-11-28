package responsi_uts;

import java.util.ArrayList;

public class Board {

	private int size;
	private char [][] boardMap;
	private Player p;
	private ArrayList<Gold> goldList;
	
	public int nGold,currGold;
	
 	public Board(int size) {
 		this.size = size;
 		boardMap = new char[size][size];
 		
 		generateBoard();
 	}
	
 	public void generateBoard() {
 		for (int i=0; i<size; i++) {
 			for (int j=0;j<size; j++) {
 				if(i==0 || i==size-1 || j==0 || j==size-1) {
 					this.boardMap[i][j] = '=';
 				}
 				else
 					this.boardMap[i][j] = ' ';
 					
 			}
 		}
 		p = new Player(1,1,'P');
 		boardMap[p.getPosY()][p.getPosX()] = p.getIcon();
 
 		nGold = size/2;
 		currGold = 0;
 		int x =-1 ,y = -1;
 		goldList = new ArrayList<>();
 		boolean isSame = false;
 		while(currGold < nGold) {
 			do {
 				isSame = false;
 				x = (int) (1 + Math.random() * (size-1 - 1));
 				y =(int) (1 + Math.random() * (size-1 - 1));
 				
 				for (Gold g : goldList) {
 					if(g.getPosY() == y && g.getPosX() == x) {
 						isSame = true;
 						break;
 					}
 				}
 			}while(isSame == true || (x==1 && y==1));
 			
 			Gold g = new Gold (x, y, 'G');
 			goldList.add(g);
 			boardMap [g.getPosY()][g.getPosX()] = g.getIcon();
 			currGold++;
 		}
 	}
 	
 	public void displayBoard() {
 		for( int i =0; i<size ; i++) {
 			for (int j=0;j<size; j++) {
 				System.out.print(boardMap[i][j]);
 			}
 			System.out.println();
 		}
 		
 	}
 	
 	public void move (char input) {
 		boardMap [p.getPosY()] [p.getPosX()] = ' ';
 		
 		switch(input) {
 		case 'w' :
 			if(boardMap[p.getPosY()-1] [p.getPosX()] != '=')
 				p.setPosY(p.getPosY()-1);
 			break;
 		case 'a' :
 			if(boardMap[p.getPosY()] [p.getPosX()-1] != '=')
 				p.setPosX(p.getPosX()-1);
 			break;
 		case 's' :
 			if(boardMap[p.getPosY()+1] [p.getPosX()] != '=')
 				p.setPosY(p.getPosY()+1);
 			break;
 		case 'd' :
 			if(boardMap[p.getPosY()] [p.getPosX()+1] != '=')
 				p.setPosX(p.getPosX() + 1);
 			break;
 		}
 		
 		if(boardMap[p.getPosY()][p.getPosX()]== 'G') {
 			currGold -= 1;
 			
 		}
 		
 		
 		boardMap[p.getPosY()][p.getPosX()] = p.getIcon();
 	}
 			
 	
 	
 	
}
