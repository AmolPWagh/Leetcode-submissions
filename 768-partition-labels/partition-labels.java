class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int n = s.length();
        int end = 0;

        int[] last = new int[26];
        Arrays.fill(last, -1);
        for (int i=n-1; i>=0; i--){
            if (last[s.charAt(i) - 'a'] == -1){
                last[s.charAt(i) - 'a'] = i;
            }
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