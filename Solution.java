class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < text.length(); i++){
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }

        int min = text.length() / 7;
        for(char c : "balon".toCharArray()){
            if(map.get(c) == null){
                return(0);
            }
            
            if(c == 'l' || c == 'o'){
                map.put(c, map.get(c) / 2);
            }

            min = Math.min(min, map.get(c));
        }

        return(min);
    }
}
