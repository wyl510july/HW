package px;

public class hIndex {

	public static void main(String[] args) {
		int[] test = {};
		if(hIndex(test) == 0){
			System.out.println("Test 1 pass");
		}
		
		int[] test2 = {1,2,3,4,5,6,7,8,9};
		if(hIndex(test2) == 5){
			System.out.println("Test 2 pass");
			
		}
	}
	
    public static int hIndex(int[] citations) {
        for (int i = citations.length; i > 0; i--){
            if (citations[citations.length - i] >= i){
                return i;
            }
        }
        return 0;
    }

}
