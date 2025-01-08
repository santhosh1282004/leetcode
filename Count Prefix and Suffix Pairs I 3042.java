public class leetcode {
	public static void main(String []args) {
		String [] words= {"a","aba","ababa","aa"};
	int len_array=words.length;
        int count=0;
        for(int i=0;i<len_array;i++){
            String word1= words[i];
            for(int j=i+1;j<len_array;j++){
               String word2=words[j];
                if(word2.startsWith(words[i]) && word2.endsWith(words[i])){
                        count++;
                    }
                }
            }

        System.out.print(count);
	}
}
