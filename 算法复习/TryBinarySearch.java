import java.util.*;

public class TryBinarySearch {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i] = in.nextInt();
        while(in.hasNext()){
            int target = in.nextInt();
            System.out.println(binarySearch(nums, target, -1));
        }
        in.close();
    }

    public static int binarySearch(int[] nums,int target,int head){
        int p = head + 1;
        int q = nums.length-1;
        int index = -1;
        double t = target + 0.5;
        //如果接受不存在，返回不超过target的下标最大的那个
        // if(t > nums[q]) return q; if(t < nums[p]) return head;

        //如果只想要在数组中确定存在的，返回下标最大的那个，不存在的则返回-1
        if(t > nums[q]) return -1; if(t < nums[p]) return -1;
        while(p<=q){
            int mid = (p+q)/2;
            if(nums[p] > t) {index = p-1;break;}
            if(nums[q] < t) {index = q;break;}
            if(nums[mid] > t){
                if(p < mid){
                    q = mid - 1;
                }else{
                    index = p - 1;
                    break;
                }
            } else{
                if(mid < q){
                    p = mid + 1;
                }else{
                    index = q;
                    break;
                }
            }
        }


        //如果只想要在数组中确定存在的，返回下标最大的那个，不存在的则返回-1
        if(index > head && index < nums.length && nums[index] == target) return index;
        else return -1;

        //如果接受不存在，返回不超过target的下标最大的那个
        // return index;
        // return -1;
    }
}