public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //if lists are empty, return null
        if (list1 == null && list2 == null){
            return null;
        }
        //if one of the lists is empty - return another one
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }

        //merge the least valuable listNode with the other one, you'll get the sorted array as the output
        if (list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }

    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        int[] val1 = {1,2,4};
        int[] val2 = {1,2,3};
        ListNode l1 =  new ListNode(val1);
        ListNode l2 = new ListNode(val2);

        System.out.println(mergeTwoSortedLists.mergeTwoLists(l1,l2));
    }
}
