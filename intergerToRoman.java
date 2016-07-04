package px;

public class intergerToRoman {

	public static void main(String[] args) {
		//the followings are tests
		if(intToRoman(1).equals("I")){
			System.out.println("Test 1 pass");
		}
		if(intToRoman(4).equals("IV")){
			System.out.println("Test 2 pass");
		}
		if(intToRoman(11).equals("XI")){
			System.out.println("Test 3 pass");
		}
		if(intToRoman(56).equals("LVI")){
			System.out.println("Test 4 pass");
		}
		if(intToRoman(88).equals("LXXXVIII")){
			System.out.println("Test 5 pass");
		}
		if(intToRoman(951).equals("CMLI")){
			System.out.println("Test 6 pass");	
		}
		if(intToRoman(3454).equals("MMMCDLIV")){
			System.out.println("Test 7 pass");
		}
		if(intToRoman(3999).equals("MMMCMXCIX")){
			System.out.println("Test 8 pass");
		}
		

	}

    public static String intToRoman(int num) {
    	//divide the num into 4 parts and find its corresponding Roman numerals
        String one[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String ten[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundred[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousand[] = {"","M","MM","MMM"};
        return thousand[num / 1000] + hundred[(num - 1000*(num/1000)) / 100] + ten[(num - 100*(num/100))/10]+ one[num % 10];
    }
}
