package achievements;

/**
 * 高分榜中的一条高分信息 实现了comparator方法
 *
 * @author Andy
 */

public class BillboardItem implements Comparable<Object>
{
	// 分数
	public int score;
	// 时间

	public String time;

	public String name;

	// 构造体，获取高分信息
	public BillboardItem(String input)
	{
		if (input != null)
		{
			// 文件中用&分隔了时间和分数
			// 时间在前分数在后
			String[] temp = input.split("&");

			this.time = temp[0];
			this.score = Integer.valueOf(temp[1]);
			this.name = temp[2];
		}
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public String getTime()
	{
		return time;
	}

	public void setTime(String time)
	{
		this.time = time;
	}

	public String getBillboardItem()
	{
		return this.time + "&" + this.score + "&" + this.name;
	}

	// //override toString
	@Override
	public String toString()
	{
		return "Name:" + this.name + "    Score:" + this.score + "    Time:" + this.time;
	}

	// 降序排列
	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		if (this.score > ((BillboardItem) o).score)
			return -1;
		else if (this.score == ((BillboardItem) o).score)
			return 0;
		else
			return 1;

	}

}
