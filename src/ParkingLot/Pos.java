package ParkingLot;

//��
public class Pos
{
	float x;
	float y;
	public Pos(float x,float y)
	{
		this.x = x;
		this.y = y;
	}
	//����2��֮��ľ���
	public static double Distance(Pos a,Pos b) {
		return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
	}
}