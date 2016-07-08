package px;

public class pow {

	public static void main(String[] args) {
		if(myPow(2.00, 3) == 8){
			System.out.println("Test 1 pass");
		}
		if(myPow(1.00000, -2147483647) == (double)1){
			System.out.println("Test 2 pass");
		}

	}
	
    public static double myPow(double x, int n) {
    	//这种算法当用在myPow(1.00000, -2147483648)时会发生stackoverflow
        if (n == 0){
            return 1;
        }else if (n < 0){
            return (double)1/myPow(x,-n);
        }else{
            double next = myPow(x, n/2);
            if (n % 2 == 0){
                return next * next;
            }else{
                return next  * next  * x;
            }
        }
    }     
    
    /*public static double myPow(double x, int n) {
     //这种算法myPow(1.00000, -2147483648)时也不会崩其实我并不是很明白两者之间的区别，希望有同学或者老师能解答一下
        if (n < 0) {
        	return 1 / power(x, -n);
        }else {
        	return power(x, n);
        }
    }
    
    public double power(double x, int n) { 
    	if(n == 0){
    		return 1;
    		}
    	double next = power(x, n/2);
    	if (n % 2 == 0){
    		return next * next ;
    	}else{
    	    return next  * next  * x;
    	}
    }*/
    	       
 }
    	


