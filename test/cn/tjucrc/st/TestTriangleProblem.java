package cn.tjucrc.st;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTriangleProblem {
	@Test
	public void testLab(){
		TriangleProblem Tri;
		Tri = new TriangleProblem();
		assertEquals(0,Tri.lab(76));	//����  ������Ϊ149  �������ӦΪ0		
		}
}
