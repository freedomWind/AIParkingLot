package ParkingLotConsole;

import ParkingLot.ParkNode;
import ParkingLot.ParkingLotManager;
import ParkingLot.Pos;

/*
 * ģ������
 * */
public class ParkingConsole {
	public static void main()
	{}
	//��ʼ��ͣ�����ڵ�
	void initParkingLot(int count)
	{
		for(int i = 0;i<count;i++)
		{
			String id = ParkingLotManager.GetInstance().ApplyParkNode(8085);
			ParkNode node = new ParkNode(id);
		    ParkingLotManager.GetInstance().Register(node);
		}
	}
	//ͨ�������ĵ�Ѱ�������ͣ����
	ParkNode findNearbyParkingLot(Pos p)
	{
		return null;
	}
	//ģ��ͣ��
	//��������ǰ����λ�õ㣬����id
	void parkingCar(Pos p,String carID)
	{
		
		
	}
	//ģ�����
	//ͣ������id
	void unParkingCar(String parkinglotID,String carID)
	{}
}
