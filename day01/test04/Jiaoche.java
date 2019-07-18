package test04;

public class Jiaoche extends MotoMachine {
	public Jiaoche(String no) {
		super(no);
	}

	


	public Jiaoche(String no, String pinpai, String xinghao) {
		super(no);
		this.pinpai = pinpai;
		this.xinghao = xinghao;
	}




	private String pinpai;
	private String xinghao;
	
	@Override
	public int 计算租赁价格(int days) {
		int money=0;
		if (pinpai.equals("宝马")) {
			if (xinghao.equals("320li")) {
				money = 500*days;
			}else if(xinghao.equals("530li")){
				money = 800*days;
			}
		}else if(pinpai.equals("别克")){
			if (xinghao.equals("gl8")) {
				money = 600*days;
			}else if(xinghao.equals("gl6")){
				money = 300*days;
			}
		}
		return money;
	}
	
	
	

	public String getPinpai() {
		return pinpai;
	}

	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}

	public String getXinghao() {
		return xinghao;
	}

	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}

}
