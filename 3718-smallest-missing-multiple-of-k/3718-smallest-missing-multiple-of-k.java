class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet <Integer> set = new HashSet<>();
    
        for (int num : nums) {
            set.add(num);
        }


        int m_multiple = k;
        while (set.contains(m_multiple)) {
            m_multiple = m_multiple + k;
        }
        

        return m_multiple;
    }
}