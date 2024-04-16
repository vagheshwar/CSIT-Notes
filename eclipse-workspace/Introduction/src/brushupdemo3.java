
public class brushupdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {1,2,4,5,6,7,8,10,12,14,15,18,20,122,200};
		
		for ( int i=0;i<data.length;i++)
		{
			if( data[i] %2 ==0 )
			{
				System.out.println(data[i]);
				//break;	
			}
			else
			{
				System.out.println(data[i] + " = is not multiple by 2");
			}
		}

	}

}
