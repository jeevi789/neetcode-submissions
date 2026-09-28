class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println(false);
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println(false);
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) < 0) {
                System.out.println(false);
                return false;
            }
        }

        System.out.println(true);
        return true;
    }
}


    

