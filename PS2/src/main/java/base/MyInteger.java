package base;

public class MyInteger {

		private int iValue;
		
		public MyInteger(int iValue) {
			this.iValue = iValue;
		}


        public int getiValue(){
			return iValue;		
		}
        public void setiValue(int iValue){
        	this.iValue = iValue;
        }
        
        public boolean isEven() {
    		if (iValue % 2 == 0) 
    			return true;
    		else 
    		return false;
    	    }

       
    	public boolean isOdd() {
    		if (iValue % 2 != 0)
    			return true;
    		 else 
    			return false;
    		}
    	

    	public boolean isPrime() {
    		int divisor = 2;
    		for (divisor = 2; divisor <= iValue / 2; divisor++) {
    			if (iValue % divisor == 0) {
    				return false;}
    		}
			return true;}
    	
    	public static boolean isEven(int i) {
    		
    		return (i % 2 == 0) ;
    	
    }

    	public static boolean isOdd(int i) {
    		
    		return (i % 2 != 0);
    		
    }

    	public static boolean isPrime(int i) {
    		int divisor = 2;
    		for (divisor = 2; divisor <= i / 2; divisor++) {
    			if (i % divisor == 0) {
    				
    				return false;
    			} 
    		}
    		return true;
    	}
    	public static boolean isEven(MyInteger i) {
    		
    		return i.isEven();
    	}

    	public static boolean isOdd(MyInteger i) {
    		return i.isOdd();
    	}

    	public static boolean isPrime(MyInteger i) {
    		return i.isPrime();
    	}

    	public boolean equals(int i){
    		
    		return (iValue==i);
    	}
    	public boolean equals(MyInteger i){
    		return i.equals(iValue);
    	}
}

        
		