public class leetcode {
	public static void main(String []args) {
	String [] words= {"a","aba","ababa","aa"};
	int len_array=words.length;
        int count=0;
        for(int i=0;i<len_array;i++){
            for(int j=i+1;j<len_array;j++){
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                        count++;
                    }
                }
            }
        System.out.print(count);
	}
}
