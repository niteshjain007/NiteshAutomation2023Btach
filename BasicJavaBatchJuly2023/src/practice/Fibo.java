package practice;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0 1 ,1,2,3,5,8
		int m1=0;
		int m2=1;int m3;
		int n=4; int count=1;
		long x,y,z;
		while(count<=n)  // 1
		{
			if(n==1)
			{
				System.out.println(m1);
				break;
			}
			else if(n==2)
			{
				System.out.println(m2); break;
			}
			
			m3= m1+m2;
			
			m1=m2;
			m2=m3;
			 
			
			count++;
		}
	}

}
