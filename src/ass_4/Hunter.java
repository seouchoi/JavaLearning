package ass_4;

public class Hunter {
	Monster remain=new Monster(1000);
	private int power;
	
	Hunter(int power)
	{
		this.power=power;
	}
	
	void attack()
	{
		System.out.println("Hunter가 Monster를 "+power+"의 파워로 공격했습니다.");
		System.out.println("Monster의 체력이 "+(remain.hp-power)+"남았습니다.");
	}
}
