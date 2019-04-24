
import org.junit.*;
//import mujavaHome.BubbleSort;

public class TestBubbleSort {
private BubbleSort a;
	
	@Before
	public void setUp() throws Exception {
		a = new BubbleSort();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}
	@Test
	public void BubbleSort(){
		int expect[] = {1,2,2,5,6};
		int par[] = {2,5,6,2,1};
		Assert.assertArrayEquals(expect, a.BubbleSort(par));
	}

}
