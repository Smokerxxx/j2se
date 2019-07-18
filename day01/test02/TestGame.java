package test02;
/**
 * 以面向对象的思维开发一个猜拳的游戏
 * 
 * 1.两个对象  ,玩家和电脑
 * 
 * 2.游戏逻辑类  , GameLogic  (1:剪刀  2:石头 3:布)
 * @author Administrator
 *
 */
public class TestGame {

	public static void main(String[] args) {
		GameLogic gameLogic = new GameLogic();
		gameLogic.startGame();
	}

}
