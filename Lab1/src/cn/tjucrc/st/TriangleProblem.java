package cn.tjucrc.st;

public class TriangleProblem {
	public static int result;
	public int lab(int x){	//ֻ���ǲ�������Ϊ����  û��д����С�����	
		if (x/50 > 1)
			 result = 0;//��Ҫ����1��50Ԫ ����������
		else if (x/50 <= 1){
			x = x % 50;
			if (x/20 >1)
				result = 0;//��Ҫ����1��20Ԫ ����������
			else if (x/20 <= 1){
				x = x % 20;
				if (x/5 >2)
					result = 0;//��Ҫ����2��5Ԫ ����������
				else if (x/5 <= 2){
					x = x % 5;
					if (x > 3)
						result = 0;//��Ҫ����3��1Ԫ ����������
					else
						result = 1;
				}
			}
				
		}
		return result;	
	}

}
