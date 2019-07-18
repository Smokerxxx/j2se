package test02;

public class GameLogic {
	Wanjia  wanjia1;
	Computer computer1;
	
	int 和局数;
	int 总局数;
	
	//游戏的初始化
	public void init(){
		wanjia1 = new Wanjia("张三",0);
		computer1 = new Computer("张飞",0);
		总局数 = 5;
	}
	
	public void startGame(){
		init();
		
		System.out.println(wanjia1.name+" VS "+computer1.name);
		for (int j = 1; j <= 总局数; j++) {
			System.out.println("共进行"+总局数+"局,当前是第"+j+"局");
			int 玩家出拳 = wanjia1.出拳();
			int 电脑出拳 = computer1.出拳();
			
			if (玩家出拳==电脑出拳) {
				System.out.println("和局");
				和局数+=1;
			}else if((玩家出拳==1&&电脑出拳==3)
					||(玩家出拳==2&&电脑出拳==1)
					||(玩家出拳==3&&电脑出拳==2)){
				System.out.println("玩家胜利");
				wanjia1.score+=1;
			} else {
				System.out.println("电脑胜利");
				computer1.score+=1;
			}
		}
		
		showScore();
	}
	
	
	private void showScore(){
		System.out.println("______________统计_____________");
		System.out.println(wanjia1.name+" VS "+computer1.name);
		System.out.println(wanjia1.name+"胜利"+wanjia1.score+"局");
		System.out.println(computer1.name+"胜利"+computer1.score+"局");
		System.out.println("和局"+和局数+"局");
	}
	
	
}
