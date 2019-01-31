package code;

// 
//
//

public class Chuck {
	
	static Startmenu startmenu;
	static GameFrame gameframe;
	
	public static void main(String[] args) {
		startmenu = new Startmenu();
		startmenu.setVisible(true);
		
	}
	
	public static void startGame(int intType){
		startmenu.setVisible(false);
		gameframe = new GameFrame(intType);
		gameframe.setVisible(true);
	}

}
