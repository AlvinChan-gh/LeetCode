class Solution { //completed in 27 min
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>(nums1.length); //List<String> list = Arrays.asList(array); 
        for(int val:nums1){
            list.add(val);
        }
        int i = 0;
        while(i < nums2.length && !list.isEmpty() && nums2[i]<nums1[nums1.length-1]  ){
            list.add(nums2[i++]);
        }
        list.sort(null);
        while(i < nums2.length){
            list.add(nums2[i++]);
        }
        if (list.size()%2 == 0){
            System.out.println((double) ( list.get(list.size()/2) + list.get( list.size()/2  - 1 ) ) / 2);
            return (double) ( list.get(list.size()/2) + list.get( list.size()/2  - 1 ) ) / 2;
        }
         System.out.println((double) list.get(list.size()/2));
        return  (double) list.get(list.size()/2);
    }
}
