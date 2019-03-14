package cn.tjucrc.st;

public class TriangleProblem {
	public static int result;
	public int lab(int x){	//只考虑测试数据为整数  没有写存在小数情况	
		if (x/50 > 1)
			 result = 0;//需要多于1张50元 不符合条件
		else if (x/50 <= 1){
			x = x % 50;
			if (x/20 >1)
				result = 0;//需要多于1张20元 不符合条件
			else if (x/20 <= 1){
				x = x % 20;
				if (x/5 >2)
					result = 0;//需要多余2张5元 不符合条件
				else if (x/5 <= 2){
					x = x % 5;
					if (x > 3)
						result = 0;//需要多余3张1元 不符合条件
					else
						result = 1;
				}
			}
				
		}
		return result;	
	}

}
