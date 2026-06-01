class Solution {
    public boolean isAnagram(String s, String t) {

	int[] counts = new int[26];
	for (int i = 0; i < s.length(); i++){
		counts[s.charAt(i) - 'a']++;

	}

	for (int k= 0; k <t.length();k++){
		counts[t.charAt(k) - 'a']--;
	}
    
	if (s.length() != t.length()) {
		return false;
    } 

	char firstChar =s.charAt(0);

	for(int val: counts) {
		if (val !=0) return false;

    }
	return true;
    
    }
}
    
