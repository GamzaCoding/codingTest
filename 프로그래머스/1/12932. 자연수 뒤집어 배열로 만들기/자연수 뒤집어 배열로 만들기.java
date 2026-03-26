class Solution {
    public int[] solution(long n) {
        char[] numArr = String.valueOf(n).toCharArray();
        char[] reverse = new StringBuilder(new String(numArr))
            .reverse()
            .toString()
            .toCharArray();
        
        int[] result = new int[reverse.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Character.getNumericValue(reverse[i]);
        }
        return result;
    }
}