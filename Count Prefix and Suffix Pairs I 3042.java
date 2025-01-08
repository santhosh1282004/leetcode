public class leetcode {
	public static void main(String []args) {
		String [] words= {"a","aba","ababa","aa"};
		int len_array=words.length;
        int len_str;
        int len_str1;
        int count=0;
        for(int i=0;i<len_array;i++){
            len_str= words[i].length();
            for(int j=i+1;j<len_array;j++){
                len_str1=words[j].length();                
                if(len_str<=len_str1 && words[i].equals(words[j].substring(0,len_str)) && words[i].equals(words[j].substring(len_str1-len_str,len_str1))){
                	count++;
                }
            }
        }
        System.out.print(count);
	}
}
