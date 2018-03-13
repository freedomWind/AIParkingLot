package ParkingLot;
import java.util.Map;
import java.util.Queue;

/*
 * ͣ����������
 * */
public class ParkingLotManager {
	Map<String, ParkNode> parkDic;
	static ParkingLotManager _ins;
	public static ParkingLotManager GetInstance() {
		if(_ins == null)
			_ins = new ParkingLotManager();
		return _ins;
	}
	ParkingLotManager() {
	//	parkDic = new Map<String, ParkNode>();
		//idManager =
	}
	//�Ǽ�ͣ�������
	public boolean Register(ParkNode node)
	{
		if(!parkDic.containsKey(node.getID()))
		{
			parkDic.put(node.getID(), node);
			return true;
		}
		return false;
	}
	//���ݵ�����������ͣ�������ID
	public String ApplyParkNode(int areaCode)
	{
		return ParkingIDHelper.GetInstance().ApplyCode(areaCode);
	}
}

//ͣ����id����
class ParkingIDHelper
{
	int curIndex = 100;
	Queue<Integer> recoveryQue;
	private static ParkingIDHelper _ins;
	public static ParkingIDHelper GetInstance() {
		if(_ins == null)
			_ins = new ParkingIDHelper();
		return _ins;
	}
	ParkingIDHelper() {
		// TODO Auto-generated constructor stub
		//recoveryQue = new Queue<Integer>();
	}
    //����ͣ��������
	public String ApplyCode(int areaCode) {
		try
		{
			return areaCode + "_" + recoveryQue.poll();
		}catch (Exception e) {
			curIndex++;		
			return areaCode + "_" + curIndex;
		}
	}
	//ͣ�������ӻ���
	public boolean unApplyCode(String parkID) {
		
		return false;
		
	}
}
