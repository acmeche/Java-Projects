package com.company;

public class Main {

    public static void main(String[] args) {
        Solution a = new Solution();

        //////////////////////////// NUM TEAMS FUNCTION TEST //////////////////////

        System.out.println("NUM TEAMS FUNCTION TEST:");
        int[] b = new int[] {4, 2, 3};
        int answer = a.numTeams(b);
        System.out.println(answer);

        /////////////////////////// CHECK POSSIBILITY FUNCTION TEST //////////////

        System.out.println("CHECK POSSIBILITY FUNCTION TEST:");
        boolean possible = a.checkPossibility(b);
        System.out.println(possible);

        ////////////////////////// TWO SUM FUNCTION TEST ////////////////////////////////

        System.out.println("TWO SUM FUNCTION TEST:");
        int[] c = new int[2];
        c = a.twoSum(b, 5);
        System.out.println(c[0] + " " + c[1]);

        ////////////////////////// CHECK RECORD FUNCTION TEST ////////////////////////////////

        System.out.println("CHECK RECORD FUNCTION TEST:");
        boolean check = false;
        check = a.checkRecord("PPALLP");
        System.out.println(check);

        ////////////////////////// POW FUNCTION TEST ////////////////////////////////

        System.out.println("POW FUNCTION TEST:");
        System.out.println(a.myPow(2, 10));

        /////////////////////////// MERGE LIST NODES FUNCTION TEST //////////////////////////

        System.out.println("LINKED LIST MERGE LIST NODES FUNCTION TEST:");
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);

        ListNode l3 = a.mergeTwoLists(l1, l2);

        ///////////////////////// PALINDROME VERIFICATION TEST ////////////////////////////

        System.out.println("PALINDROME VERIFICATION TEST:");
        System.out.println(a.isPalindrome(123454321));
        System.out.println(a.isPalindrome(12345678));

        //////////////////////// REMOVE VOWELS TEST /////////////////////////

        System.out.println("REMOVE VOWELS TEST:");
        System.out.println(a.removeVowels("ILoveJavaTheMost"));

        //////////////////////// REVERSE VOWELS TEST /////////////////////////

        System.out.println("REVERSE VOWELS TEST:");
        System.out.println(a.reverseVowels("Hello World"));

        //////////////////////// CONTAINS DUPLICATES TEST /////////////////////////

        System.out.println("CONTAINS DUPLICATES TEST:");
        System.out.println(a.containsDuplicate(b));

        //////////////////////// MINSTACK TEST /////////////////////////

        System.out.println("MINSTACK CLASS TEST:");
        MinStack d = new MinStack();
        d.push(-5);
        d.push(4);
        d.push(-100);
        d.push(8);
        d.push(0);

        d.pop();
        System.out.println("The value at the top of the stack after 1 removal is: " + d.top());
        System.out.println("The minimum value in the stack is: " + d.getMin());

        //////////////////////// ISANAGRAM TEST /////////////////////////

        System.out.println("ISANAGRAM FUNCTION TEST:");
        String x = "captain america";
        String y = "acirema niatpac";
        System.out.println(a.isAnagram(x, y));

    }
}
