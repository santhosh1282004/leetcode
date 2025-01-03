class Solution {
    public int lengthOfLastWord(String a) {
        return a.split(" ")[a.split(" ").length-1].length();
    }
}
