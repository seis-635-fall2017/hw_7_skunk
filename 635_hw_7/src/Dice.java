// another trivial change, after moving in repo by other user
// trivial change to Dice, but in wrong source folder
public class Dice
{
	private int[] die1Rolls;
	private int[] die2Rolls;
	private int loadedDieIndex;
	
	private int lastDie1Roll;
	private int lastDie2Roll;
	
	public Dice()
	{
		
	}
	
	public Dice(int[] die1Rolls, int[] die2Rolls)
	{
		loadedDieIndex = 0;
		this.die1Rolls = die1Rolls;
		this.die2Rolls = die2Rolls;
	}

	public int getDie1Roll()
	{
		return lastDie1Roll;
	
	}
	public int getDie2Roll()
	{
		return lastDie2Roll;
	}
	
	public void roll()
	{
		lastDie1Roll = die1Rolls[loadedDieIndex];
		lastDie2Roll = die2Rolls[loadedDieIndex];
		loadedDieIndex++;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}


}
