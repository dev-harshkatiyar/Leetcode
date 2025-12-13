class Solution {
    public int numDifferentIntegers(String word) {
        String s = word.replaceAll("[^0-9]", " ").trim();
        if (s.isEmpty()) return 0;
        String[] res = s.split("\\s+");
        HashSet<String> set = new HashSet<>();
        for (String st : res) {
            st = st.replaceFirst("^0+", "");
            if (st.equals("")) st = "0";
            set.add(st);
        }
        return set.size();
    }
}
