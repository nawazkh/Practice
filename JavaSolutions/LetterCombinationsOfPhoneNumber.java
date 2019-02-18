class Solution {
    private String[] dialPad = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<String>();
        return helper(digits);
    }
    public List<String> helper(String digits){
        List<String> all_combinations = new ArrayList<String>();
        if(digits.length() == 0){
            all_combinations.add("");
            return all_combinations;
        }
        List<String> other_combinations = helper( digits.substring(1,digits.length()));
        String prefix = dialPad[digits.charAt(0) - '2'];
        for(int i = 0; i < prefix.length(); i++){
            for(String letters: other_combinations){
                String word = String.valueOf(prefix.charAt(i)) + letters;
                all_combinations.add(word);
            }
        }
        return all_combinations;
    }
}