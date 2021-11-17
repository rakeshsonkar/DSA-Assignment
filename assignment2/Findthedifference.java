package assignment2;

public class Findthedifference {
	  public static char findTheDifference(String s, String t) {
	       
			boolean flag = false;
	        char[] i = s.toCharArray();
	        char[] j = t.toCharArray();
	        char c ='\0';
	        sort(i);
	        sort(j);
	        for(int x=0; x<i.length; x++){
	            if((i[x]^j[x])!=0){
	            	c=j[x];
	                flag = true;
	            }
	        }
	        if(!flag) c=j[j.length-1];
	        return c;
	    }
	       public static char[] sort(char[] charArray) {
			for(int i=0; i<charArray.length-1; i++) {
				boolean flag = false;
				for(int j=0; j<charArray.length-i-1; j++) {
					if(charArray[j]>charArray[j+1]) {
						char temp = charArray[j];
						charArray[j]=charArray[j+1];
						charArray[j+1]=temp;
						flag = true;
					}
				}
				if(!flag) break;
			}
			
			return charArray;
		} 
	        
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd","abcde"));
	}

}
