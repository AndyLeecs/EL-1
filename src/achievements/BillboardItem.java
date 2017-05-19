package achievements;

import java.util.Comparator;

/**  
* 高分榜中的一条高分信息
* 实现了comparator方法
*  
* @author Andy
* @version  
*/

public class BillboardItem implements Comparable<Object>
{
	//分数
	public int score;
	//时间
<<<<<<< HEAD
	public int time;
	//大名
	public String name;

//	public int getScore()
//	{
//		return score;
//	}
//
//	public void setScore(int score)
//	{
//		this.score = score;
//	}
//
//	public int getTime()
//	{
//		return time;
//	}
//
//	public void setTime(int time)
//	{
//		this.time = time;
//	}
=======
	public String time;

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
>>>>>>> 9cc66c875785da7ac38d3c944a1d3f88c577c696

	
	//构造体，获取高分信息
	public BillboardItem(String input){
		if(input != null){
			//文件中用&分隔了玩家大名和时间和分数
			//时间在前分数在后
			String[] temp = input.split("&");
<<<<<<< HEAD
			this.name=temp[0];
			this.time = Integer.valueOf(temp[1]);
			this.score = Integer.valueOf(temp[2]);
=======
			this.time = temp[0];
			this.score = Integer.valueOf(temp[1]);
			
>>>>>>> 9cc66c875785da7ac38d3c944a1d3f88c577c696
			}
	}
	
	public String getBillboardItem(){
		return this.time + "&" + this.score;
	}



	//override toString
	@Override
	public String toString(){
		return "Name:"+this.name+"    Score:"+this.score+"    Time:"+this.time;
	}

	//降序排列
	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		if(this.score >((BillboardItem)o).score)
			return -1;
		else if(this.score == ((BillboardItem)o).score)
			return 0;
		else
			return 1;
		
	}



	
}


