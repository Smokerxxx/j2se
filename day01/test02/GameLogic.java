package test02;

public class GameLogic {
	Wanjia  wanjia1;
	Computer computer1;
	
	int �;���;
	int �ܾ���;
	
	//��Ϸ�ĳ�ʼ��
	public void init(){
		wanjia1 = new Wanjia("����",0);
		computer1 = new Computer("�ŷ�",0);
		�ܾ��� = 5;
	}
	
	public void startGame(){
		init();
		
		System.out.println(wanjia1.name+" VS "+computer1.name);
		for (int j = 1; j <= �ܾ���; j++) {
			System.out.println("������"+�ܾ���+"��,��ǰ�ǵ�"+j+"��");
			int ��ҳ�ȭ = wanjia1.��ȭ();
			int ���Գ�ȭ = computer1.��ȭ();
			
			if (��ҳ�ȭ==���Գ�ȭ) {
				System.out.println("�;�");
				�;���+=1;
			}else if((��ҳ�ȭ==1&&���Գ�ȭ==3)
					||(��ҳ�ȭ==2&&���Գ�ȭ==1)
					||(��ҳ�ȭ==3&&���Գ�ȭ==2)){
				System.out.println("���ʤ��");
				wanjia1.score+=1;
			} else {
				System.out.println("����ʤ��");
				computer1.score+=1;
			}
		}
		
		showScore();
	}
	
	
	private void showScore(){
		System.out.println("______________ͳ��_____________");
		System.out.println(wanjia1.name+" VS "+computer1.name);
		System.out.println(wanjia1.name+"ʤ��"+wanjia1.score+"��");
		System.out.println(computer1.name+"ʤ��"+computer1.score+"��");
		System.out.println("�;�"+�;���+"��");
	}
	
	
}
