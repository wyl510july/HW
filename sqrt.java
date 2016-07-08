package px;

public class sqrt {

	public static void main(String[] args) {
		if(mySqrt(1) == 1){
			System.out.println("Test 1 pass");
		}
		if(mySqrt(2147395599) == 46339){
			System.out.println("Test 2 pass");
			
		}
		

	}
    public static int mySqrt(int x) {
        if (x == 1){
            return 1;
        }
        long start = 0;
        long end = x;
        long mid = start + (end-start)/2;
        
        while (start != mid){
            if (mid * mid == x){
            return (int)mid;
            }else if(mid * mid > x){
                end = mid;
            }else{
                start = mid;
            }
            mid = start + (end-start)/2;
        }
        return (int)mid;
    }

}
