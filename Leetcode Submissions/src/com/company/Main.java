package com.company;

public class Main {

    public static void main(String[] args) {
        Solution a = new Solution();

        //////////////////////////// NUM TEAMS FUNCTION TEST //////////////////////

        int[] b = new int[] {4, 2, 3};
        int answer = a.numTeams(b);
        System.out.println(answer);

        /////////////////////////// CHECK POSSIBILITY FUNCTION TEST //////////////

        boolean possible = a.checkPossibility(b);
        System.out.println(possible);

        ////////////////////////// TWO SUM FUNCTION TEST ////////////////////////////////

        int[] c = new int[2];
        c = a.twoSum(b, 5);
        System.out.println(c[0] + " " + c[1]);

        ////////////////////////// CHECK RECORD FUNCTION TEST ////////////////////////////////

        boolean check = false;
        check = a.checkRecord("PPALLP");
        System.out.println(check);

        ////////////////////////// POW FUNCTION TEST ////////////////////////////////

        System.out.println(a.myPow(2, 10));

        /////////////////////////// MERGE LIST NODES FUNCTION TEST //////////////////////////

        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);

        ListNode l3 = a.mergeTwoLists(l1, l2);



    }
}
