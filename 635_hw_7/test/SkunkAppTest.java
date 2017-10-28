import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SkunkAppTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@Ignore
	public void test()
	{
		fail("my first test failure!");
	}

	@Test
	public void new_dice_can_be_created()
	{
		Dice d = new Dice();
		assertTrue("new Dice instance not null", d != null);
	}

	@Test
	public void new_dice_will_roll_double_skunk_first()
	{
		Dice d = new Dice(new int[]
		{ 1 }, new int[]
		{ 1 });
		d.roll();
		assertEquals("first die is not 1", 1, d.getDie1Roll());
		assertEquals("second die is not 1", 1, d.getDie2Roll());
	}

	@Test
	public void new_dice_rolls_boxcars_then_double_skunk()
	{
		Dice d = new Dice(new int[]
		{ 6, 1 }, new int[]
		{ 6, 1 });
		d.roll();
		assertEquals("first die is not 6", 6, d.getDie1Roll());
		assertEquals("second die is not 6", 6, d.getDie2Roll());
		d.roll();
		assertEquals("first die is not 1", 1, d.getDie1Roll());
		assertEquals("second die is not 1", 1, d.getDie2Roll());

	}

}
