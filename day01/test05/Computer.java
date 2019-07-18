package test05;

public class Computer {
	
	//面向接口的设计 ,定义接口  , 符合该接口的所有子类 ,都可以注入到该属性上
	private CPU cpu;
	private HardDisk  harddisk;
	
	public Computer(CPU cpu1, HardDisk disk1) {
		this.cpu = cpu1;
		this.harddisk = disk1;
	}

	public void  showInfo(){
		System.out.println("计算机配置如下");
		System.out.println(cpu.getPinPai()+cpu.getXingHao());
		System.out.println(harddisk.getPinPai()+harddisk.getRongLiang());
		
	}
	
}
