package cn.tjucrc.st;

import static org.junit.Assert.*;

import org.junit.Before;


import org.junit.Test;

public class TestPrintPrimes {
	PrintPrimes pri;
	@Before
	public void setUp() throws Exception{
		pri = new PrintPrimes();
	}
	@Test
	public void TestPringtPrimes(){
		
		//pri.printPrimes(1);//作业（c）
		pri.printPrimes(5);//junit 主路径测试
		
	}

}
