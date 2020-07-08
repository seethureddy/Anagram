import java.util.Arrays;

public class Anagram {

	/* function to check whether two strings are  
    anagram of each other */
    static boolean areAnagram(char[] str1, char[] str2) 
    { 
        // Get lenghts of both strings 
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false; 
  
        // Sort both strings 
        Arrays.sort(str1); 
        Arrays.sort(str2); 
        
        
        // Method 1
        // Compare sorted strings 
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
        
        // Method 2
        //return Arrays.equals(str1, str2);
            
    } 
  
    public static void main(String args[]) 
    { 
        char str1[] = { 't', 'e', 's', 't' }; 
        char str2[] = { 't', 't', 'e', 'w' }; 
        
        if (areAnagram(str1, str2)) {
            System.out.println("The two strings are anagram of each other");
        }
        else {
            System.out.println("The two strings are not anagram of each other"); 
        }
        
        String s1 = "test";
        String s2 = "ttew";
   
        if (Anagram(s1, s2)) 
            System.out.println("The two strings are anagram of each other"); 
        else
            System.out.println("The two strings are not anagram of each other"); 
    }

	private static boolean Anagram(String s1, String s2) {
		
		// Removing all the white spaces		
		String rs1 = s1.replaceAll("\\s", "");
		String rs2 = s2.replaceAll("\\s", "");
			
		StringBuffer sb = new StringBuffer(rs2);
		
		char ch1[] = rs1.toLowerCase().toCharArray();
		char ch2[] = rs2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String first = new String(ch1);
		String second = new String(ch2);
		   
		if(rs1.length() != rs2.length())
			return false;
		
		// Method 1
		// Using sort and compare the Arrays
		//return Arrays.equals(ch1, ch2);
		
		// Method 2	
		// Compare the 2 strings 
//		if(first.equalsIgnoreCase(second)) {
//		  return true;
//		}
//		else {
//		  return false;
//		}
		
		// Method 3
		// Using StringBuffer
		for(char c : ch1) {
			int index = sb.indexOf(String.valueOf(c));
			
			if(index == -1) {
				sb.deleteCharAt(index);
			}
			else {
				return false;
			}
		}	
		return sb.length() == 0;		   
	} 
}
