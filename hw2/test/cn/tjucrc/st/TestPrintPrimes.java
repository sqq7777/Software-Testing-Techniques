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
		
		//pri.printPrimes(1);//��ҵ��c��
		pri.printPrimes(5);//junit ��·������
		
	}

}
