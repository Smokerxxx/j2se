package test05;

public class Computer {
	
	//����ӿڵ���� ,����ӿ�  , ���ϸýӿڵ��������� ,������ע�뵽��������
	private CPU cpu;
	private HardDisk  harddisk;
	
	public Computer(CPU cpu1, HardDisk disk1) {
		this.cpu = cpu1;
		this.harddisk = disk1;
	}

	public void  showInfo(){
		System.out.println("�������������");
		System.out.println(cpu.getPinPai()+cpu.getXingHao());
		System.out.println(harddisk.getPinPai()+harddisk.getRongLiang());
		
	}
	
}
