import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicare3v2 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0) return false;
        Map<Long, Long> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            //negative nums will cause edge cases of bucket targetting and bucket comparing, so reposition all nums, so that each num
            //is converted to be positive
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;//nums[i] must be converted to long firstly, since
                                                                //nums[i] - Integer.MIN_VALUE may already overflowed

            //choose bucket size to be t + 1, that's because:
            //bucket size == t: t = 0 would be an edge case, need to be processed separately
            //bucket size == t + 2: two nums with difference == t + 1 > t may fall into the same bucket, which will not be detected
            //bucket size == t - 1: instead of merely comparing bucket with bucket-1 and bucket+1, bucket-2 and bucket+2 also need to
            //                      be compared, cause nums with difference == t may fall into bucket-2 and bucket+2
            long bucket = remappedNum / ((long) t + 1);//convert t to long, since t can be Integer.MAX_VALUE, causing overflow
            if (map.containsKey(bucket)
                    || (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= t)
                    || (map.containsKey(bucket + 1) && map.get(bucket + 1) - remappedNum <= t))
                return true;

            //max distance is k, so bucket size is maintained to be no more than k
            if (map.entrySet().size() >= k) {
                long lastBucket = ((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1);
                map.remove(lastBucket);
            }

            //If bucketId already exists in buckets, buckets.size() will < k, but that's ok, since this is normal case that two nums
            //in the distance of [0, k] fallen into the same bucket. What matters is that all nums in buckets must be in the distance
            //of [0, k]. So each loop pop the outdated bucket is a must. Whether the bucket size == k doesn't matter.
            map.put(bucket, remappedNum);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicare3v2 containsDuplicate = new ContainsDuplicare3v2();
        int[] nums = {1,5,9,1,5,9};
        int indexDiff = 2;
        int valueDiff = 3;
        boolean result = containsDuplicate.containsNearbyAlmostDuplicate(nums,indexDiff,valueDiff);
        System.out.println(result);
    }
}
