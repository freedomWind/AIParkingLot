package ParkingLotConsole;

import ParkingLot.ParkNode;
import ParkingLot.ParkingLotManager;
import ParkingLot.Pos;

/*
 * 模拟运行
 * */
public class ParkingConsole {
	public static void main()
	{}
	//初始化停车厂节点
	void initParkingLot(int count)
	{
		for(int i = 0;i<count;i++)
		{
			String id = ParkingLotManager.GetInstance().ApplyParkNode(8085);
			ParkNode node = new ParkNode(id);
		    ParkingLotManager.GetInstance().Register(node);
		}
	}
	//通过给定的点寻找最近的停车厂
	ParkNode findNearbyParkingLot(Pos p)
	{
		return null;
	}
	//模拟停车
	//参数：当前车的位置点，车牌id
	void parkingCar(Pos p,String carID)
	{
		
		
	}
	//模拟出库
	//停车场的id
	void unParkingCar(String parkinglotID,String carID)
	{}
}
