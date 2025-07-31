public class FindMedianOfTwoArrayList {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int[] newNum = new int[nums1.length + nums2.length];

            int minLength = 0;
            int maxLength = 0;
            if(nums1.length > nums2.length){
                minLength = nums2.length;
                maxLength = nums1.length;
            }else{
                minLength = nums1.length;
                maxLength = nums2.length;
            };

            int newIndex = -1;
            for ( int i = 0; i< minLength; i++){
                newIndex += 1;
                if(nums1[i] > nums2[i]){
                    newNum[newIndex] = nums2[i];
                    newNum[newIndex =+ 1] = nums1[i];
                } else{
                    newNum[newIndex] = nums1[i];
                    newNum[newIndex += 1] = nums2[i];
                }
            }

            if(newIndex != newNum.length -1){
                int[] maxItem = nums1.length > nums2.length ? nums1 : nums2;
                for( int i = (minLength+maxLength) - minLength -1; i < maxItem.length ; i++ ){
                    newNum[newIndex] = maxItem[i];
                }
            }


            if(maxLength % 2 == 0){
                return (double) (newNum[newNum.length / 2 - 1] + newNum[newNum.length / 2]) /2;
            }

            return newNum[newNum.length/2];

        }

    public static void main(String[] args) {
        int[] nums1 = new int[2];
        nums1[0] = 1;
        nums1[1] = 3;
        int[] nums2 = new int[3];
        nums2[0] = 2;
        nums2[1] = 4;
        nums2[2] = 5;


        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);

    }
}
