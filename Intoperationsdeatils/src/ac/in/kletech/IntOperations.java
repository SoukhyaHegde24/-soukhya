package ac.in.kletech;

public interface IntOperations {
	boolean isPositive();
	boolean isNegative();
	boolean isEven();
	boolean isOdd();
	int getSumofDigits();
}

	class myNum implements IntOperations{
		private int data;
		
		public myNum(int data){
			this.data=data;
			
		}
		
		@Override
		
		public boolean isPositive(){
			
			return data>=0?true:false;
		}
		
		public boolean isNegative(){
			
			return data<=0?true:false;
		}
		
		public boolean isEven(){
			
			return data%2==0?true:false;
		}
		
		public boolean isOdd(){
			return data%2==0?true:false;
			
		}
		
		public int getSumofDigits(){
			
			int s=0,t=data;
			while(t!=0)
			{
				s=s+t%10;
				t=t/10;
			}
			
			return s;
		}
	}
			
	
		
	


