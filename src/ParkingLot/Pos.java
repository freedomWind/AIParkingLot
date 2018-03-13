package ParkingLot;

//点
public class Pos
{
	float x;
	float y;
	public Pos(float x,float y)
	{
		this.x = x;
		this.y = y;
	}
	//计算2点之间的距离
	public static double Distance(Pos a,Pos b) {
		return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
	}
}