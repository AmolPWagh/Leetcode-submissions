class Solution {
    public boolean backspaceCompare(String s, String t) {
         StringBuilder sbs = new StringBuilder();
        StringBuilder sbt = new StringBuilder();
        int i=0;
        while(i < s.length()){
            if (s.charAt(i)=='#'){
                if (!sbs.isEmpty()) {
                    sbs.deleteCharAt(sbs.length() - 1);
                }
                i++;
            }
            else{
                sbs.append(s.charAt(i));
                i++;
            }
        }
        i=0;
        while(i < t.length()){
            if (t.charAt(i)=='#'){
                if (!sbt.isEmpty()) {
                    sbt.deleteCharAt(sbt.length() - 1);
                }
                i++;
            }
            else{
                sbt.append(t.charAt(i));
                i++;
            }
        }
        return sbs.toString().equals(sbt.toString());
    }
}