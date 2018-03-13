package ParkingLot;
import java.util.Map;
import java.util.Queue;

/*
 * 停车场管理类
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
	//登记停车厂结点
	public boolean Register(String id,ParkNode node)
	{
		if(!parkDic.containsKey(id))
		{
			parkDic.put(id, node);
			return true;
		}
		return false;
	}
	//根据地区编码申请停车场身份ID
	public String ApplyParkNode(int areaCode)
	{
		return ParkingIDHelper.GetInstance().ApplyCode(areaCode);
	}
}

//停车厂id管理
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
    //申请停车场牌子
	public String ApplyCode(int areaCode) {
		try
		{
			return areaCode + "_" + recoveryQue.poll();
		}catch (Exception e) {
			curIndex++;		
			return areaCode + "_" + curIndex;
		}
	}
	//停车场牌子回收
	public boolean unApplyCode(String parkID) {
		
		return false;
		
	}
}
