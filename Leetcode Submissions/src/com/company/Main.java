package com.company;

public class Main {

    public static void main(String[] args) {
        Solution a = new Solution();
        Solution.Logger p = new Solution.Logger();

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
        System.out.println("Are captain america and acirema niatpac anagrams?");
        String x = "captain america";
        String y = "acirema niatpac";
        System.out.println(a.isAnagram(x, y));
        /*
        //////////////////// STRSTR TEST /////////////
        System.out.println("STRSTR INDEX FUNCTION TEST:");
        System.out.println("Find erica in america");
        System.out.println(a.strStr("america", "erica"));

        /////////////////// COUNTPRIMES TEST ////////////
        System.out.println(a.countPrimes(500000));
        */

        /////////////////// MOVE ZEROES TEST ////////////
        int[] e = new int[] {4, 7, 0, 9, 0, 0, 7, 0};
        System.out.println("MOVE ZEROES FUNCTION TEST:");
        System.out.println("Array before:");
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("Array after:");
        a.moveZeroes(e);
        System.out.println();

        /////////////////// PLUS ONE TEST ////////////
        System.out.println("PLUS ONE FUNCTION TEST:");
        System.out.println("Array before adding 1:");
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        a.plusOne(e);
        System.out.println("Array after adding 1:");
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        System.out.println();

        /////////////////// JEWELS AND STONES TEST ////////////
        System.out.println("JEWELS AND STONES FUNCTION TEST:");
        System.out.println("Jewel: A, Stones: AbbbBBCCCaaA");
        System.out.println("There are " + a.numJewelsInStones("A","AbbbBBCCCaaA" ) + " jewels in the stones.");

        /////////////////// LOGGER RATE LIMITED TEST ////////////
        p.shouldPrintMessage(1, "This is a logged message that can only print every 10 ticks");
        p.shouldPrintMessage(5, "This is a logged message that can only print every 10 ticks");
        p.shouldPrintMessage(8, "This is a logged message that can only print every 10 ticks");
        p.shouldPrintMessage(12, "This is a logged message that can only print every 10 ticks");
        System.out.println("Message printed twice, once at 1 tick and again at 12, Success");

        /////////////////// DUPLICATE ZEROES TEST ////////////
        System.out.println("DUPLICATE ZEROES FUNCTION TEST:");
        System.out.println("Array before duplicate zeroes: ");
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("Array after duplicate zeroes: ");
        a.duplicateZeros(e);

        /////////////////// RUNNING SUM OF 1D ARRAY TEST ////////////
        System.out.println("RUNNING SUM OF 1D ARRAY FUNCTION TEST:");
        System.out.println("Array before running sum: ");
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        a.runningSum(e);
        System.out.println();
        System.out.println("Array after running sum: ");
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        System.out.println();

        /////////////////// HOW MANY NUMBERS SMALLER THAN CURRENT TEST ////////////
        System.out.println("HOW MANY NUMBERS SMALLER THAN CURRENT FUNCTION TEST:");
        System.out.println("Array before running smaller than current: ");
        int count = 0;
        for(int i = e.length; i > 0; i--)
        {
            e[count] = i;
            count++;
        }
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("Array after running smaller than current: ");
        a.smallerNumbersThanCurrent(e);
        System.out.println();

        /////////////////// GOOD PAIRS TEST ////////////
        System.out.println("GOOD PAIRS FUNCTION TEST:");
        System.out.println("Array values: ");
        e[3] = 1;
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("The number of good pairs is: " + a.numIdenticalPairs(e));

        /////////////////// DEFANGED IP ADDRESS TEST ////////////
        System.out.println("DEFANGED IP ADDRESS FUNCTION TEST:");
        System.out.println("Input IP address: 1.1.1.1");
        System.out.println("Output after defanged: " + a.defangIPaddr("1.1.1.1"));

        /////////////////// SUM OF UNIQUE ELEMENTS TEST ////////////
        System.out.println("SUM OF UNIQUE ELEMENTS FUNCTION TEST:");
        System.out.println("Values of input array: ");
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("Sum of unique elements is: " + a.sumOfUnique(e));

        /////////////////// FIND DUPLICATES TEST ////////////
        System.out.println("FIND DUPLICATES FUNCTION TEST:");
        System.out.println("Values of input array for duplicate function: ");
        for (int h: e)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("The duplicate value is: " + a.findDuplicate(e));

        /////////////////// FIND SINGLE NUMBER TEST ////////////
        System.out.println("FIND SINGLE NUMBER FUNCTION TEST:");
        System.out.println("Values of input array for single number function: ");
        int[] k = new int[] {1, 1, 2, 2, 3, 4, 4, 5, 5};
        for (int h: k)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("The single value is: " + a.singleNumber(k));

        /////////////////// ANAGRAM MAPPING TEST ////////////
        System.out.println("ANAGRAM MAPPING FUNCTION TEST:");
        System.out.println("Values of input array for single number function: ");
        int[] l = new int[] {5, 4, 3, 2, 1};
        int[] m = new int[] {1, 3, 2, 5, 4};
        a.anagramMappings(l, m);
    }
}
