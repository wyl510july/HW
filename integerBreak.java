package px;

public class integerBreak {
	public static void main(String[] args) {
		System.out.println(integerBreak(5));

	}
    public static int integerBreak(int n) {
    	int[] f = new int[57];
        f[0] = 1;f[1] = 2;f[2] =4;
        for(int i = 5; i <= 58; i++){
            int value = returnValue(f,i);
            f[i-2] = (value+1) * (f[i-3]/value) ;
        }
        return f[n-2];
    }
    
    private static int returnValue(int[] f, int i){
        int j = 2;
        while ((f[i-3]/j) >= 1){
            if(f[i-3]%j == 0){
                return j;
            }
            j += 1;
        }
        return 0;
    }	
}
