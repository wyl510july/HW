package px;

import java.util.ArrayList;
import java.util.List;

public class restoreIPAddress {
	
	public static void main(String[] args) {
		//testing
	    System.out.println(restoreIpAddresses("010010"));
	    System.out.println(restoreIpAddresses("123456789"));
	    }
	
	public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        if(s == null || s.length() < 4 || s.length() > 12){
            return result;
            }
        for (int i = 1; i < 4; i++){
        	for (int j = i; j < i+4; j++){
        		if(j > s.length()-2){
                    break;
                    }
        		for(int k = j; k < j+4; k++){
        			if(k> s.length()-1){
                        break;
                        }
        			if(isValid(s.substring(0,i)) && isValid(s.substring(i,j)) && isValid(s.substring(j,k))&& isValid(s.substring(k,s.length()))){
        				result.add(s.substring(0,i) + "." + s.substring(i,j) + "." + s.substring(j,k) + "." + s.substring(k,s.length()));
        				}
        			}
        		}
        	}
        return result;
        }
	
	//helper method
	private static boolean isValid(String subS){
		return !(subS.length() < 1 || subS.length() > 3 || Integer.parseInt(subS) < 0 || Integer.parseInt(subS) > 255 || (subS.length() != 1 && subS.charAt(0) == '0'));
    }
}
