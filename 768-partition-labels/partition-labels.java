class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int n = s.length();
        int end = 0;

        int[] last = new int[26];
        for(int i = 0; i < n; i++){
            last[s.charAt(i) - 'a'] = i;
        }
        
        for (int i=0; i<n; i++){
            end = Math.max(end, last[s.charAt(i)-'a']);
            if (end == i){
                list.add(end-start+1);
                start = end+1;
                end = start;
            }
        }
        
        return list;
    }
}