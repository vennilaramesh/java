package javacore;

public class LabellingOfLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		outer:
		for(i=1;i<=3;i++)
			inner:
			for(j=1;j<=3;j++)
			{
				if(i==2)
				{
					continue;
					
				}
		System.out.println(i+" "+j);
			}
	
		}

	}


