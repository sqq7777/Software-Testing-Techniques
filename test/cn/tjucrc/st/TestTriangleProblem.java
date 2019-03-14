package cn.tjucrc.st;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTriangleProblem {
	@Test
	public void testLab(){
		TriangleProblem Tri;
		Tri = new TriangleProblem();
		assertEquals(0,Tri.lab(76));	//测试  如果金额为149  期望结果应为0		
		}
}
