class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();

        int freq1[] = new int[1001];
        int freq2[] = new int[1001];

        for(int i = 0;i<nums1.length;i++){
            freq1[nums1[i]]++;
        }
        for(int i = 0;i<nums2.length;i++){
            freq2[nums2[i]]++;
        }

        for(int i = 0;i<1001;i++){
            if(freq1[i] >= 1 && freq2[i] >= 1){
                ans.add(i);
            }
        }
        int len = ans.size();
        int[] ls = new int[ans.size()];
        for(int i = 0;i<len;i++){
            ls[i] = ans.get(i);
        }
        return ls;
    }
}