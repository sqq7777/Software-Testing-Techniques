
import org.junit.*;
//import mujavaHome.BackPack;

public class TestBackPack {
private BackPack a;
	
	@Before
	public void setUp() throws Exception {
		a = new BackPack();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void BackPack(){
		int m = 10;
        int n = 3;
        
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = {
				{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
				{0,	0,	0,	4,	4,	4,	4,	4,	4,	4,	4},	
				{0,	0,	0,	4,	5,	5,	5,	9,	9,	9,	9},	
				{0,	0,	0,	4,	5,	6,	6,	9,	10,	11,	11}};

		Assert.assertArrayEquals(c, a.BackPack_Solution(m,n,w,p));
	}

}
