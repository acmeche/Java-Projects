package com.company;

import java.util.*;

public class Solution {

    /////////// NUM TEAMS PROBLEM 1395 ////////////////

    /*
    PROBLEM: There are n soldiers standing in a line. Each soldier is assigned a unique rating value.

    You have to form a team of 3 soldiers amongst them under the following rules:

    Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
    A team is valid if:  (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).

    Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).*/

    public int numTeams(int[] rating) {
        int count = 0;
        int size = rating.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if ((rating[i] < rating[j] && rating[j] < rating[k]) || (rating[i] > rating[j] && rating[j] > rating[k])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /////////////// NON DECREASING ARRAY PROBLEM 665 ///////////////////////
    /*
    PROBLEM: Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

    We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).*/

    public boolean checkPossibility(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count >= 2) {
                    return false;
                }
                if (i == 0) {
                    nums[i] = nums[i + 1] - 1;
                }
                if (i >= 1 && nums[i - 1] > nums[i + 1]) {
                    nums[i - 1] = nums[i] - nums[i + 1] - 1;
                    nums[i + 1] = nums[i] + 1;
                }

            }
        }
        return true;
    }

    //////////// TWO SUM PROBLEM 1 /////////////////////
    /*
    PROBLEM: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.*/

    public int[] twoSum(int[] nums, int target) {
        // create new array that stores the 2 indices
        int[] indexAnswer = new int[2];
        // set boolean so that the outer loop can be broken
        boolean done = Boolean.FALSE;
        // use a nested loop so every value can be compared to each other value in order
        for (int i = 0; i < nums.length; i++) {
            // checks if done is true, done is changed to true after you reach a value that equals the target
            if (done) {
                break;
            }
            for (int j = 0; j < nums.length; j++) {
                // skips over the identical index positions so that it doesn't add to itself
                if (i == j) {
                    continue;
                }
                // if you hit the target value, store the indices in the array and change done to true to exit the outer loop
                if (nums[i] + nums[j] == target) {
                    indexAnswer[0] = i;
                    indexAnswer[1] = j;
                    done = true;
                }
            }
        }
        return indexAnswer;
    }

    //////////// STUDENT RECORD PROBLEM 551 /////////////////////

    /*
    PROBLEM: You are given a string representing an attendance record for a student. The record only contains the following three characters:

    'A' : Absent.
    'L' : Late.
    'P' : Present.

    A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

    You need to return whether the student could be rewarded according to his attendance record.*/

    public boolean checkRecord(String s) {
        // convert the string to a char array so it's easier to analyze individual chars
        boolean reward = true;
        char[] x = s.toCharArray();
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            // check in the char array for A and increment count, if count > 1 then set to false and return
            if (x[i] == 'A') {
                count++;
            }
            if (count > 1) {
                reward = false;
                return reward;
            }

            // check in the string for "LLL"
            else if (s.contains("LLL")) {
                reward = false;
                return reward;
            }
        }
        return reward;
    }

    //////////// POW PROBLEM 50 /////////////////////

    /*
    PROBLEM: Implement pow(x, n), which calculates x raised to the power n (i.e. xn).*/

    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    //////////// MERGE SORTED LINKED LISTS PROBLEM 21 /////////////////////

    /*
    Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.*/

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    //////////// PALINDROME VALIDATION PROBLEM 9 //////////////////////

    /*
        Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

        Follow up: Could you solve it without converting the integer to a string?
     */
    public boolean isPalindrome(int x) {
        boolean match = false;
        int last, reverse = 0;
        int number = x;
        while (number > 0) {
            last = number % 10;
            reverse = (reverse * 10) + last;
            number /= 10;
        }

        if (x == reverse) {
            match = true;
            return match;
        }

        return match;
    }

    //////////////////////// REMOVE VOWELS PROBLEM 1119 ///////////////////////////////////////
    /*
        Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
     */

    public String removeVowels(String s) {
        String t = s;
        t = t.replace("a", "");
        t = t.replace("e", "");
        t = t.replace("i", "");
        t = t.replace("o", "");
        t = t.replace("u", "");
        return t;
    }

    //////////////////////// REVERSE VOWELS PROBLEM 345 ///////////////////////////////////////
    /*
        Write a function that takes a string as input and reverse only the vowels of a string.
     */

    public String reverseVowels(String s) {
        char[] arr = new char[s.length()];
        ArrayList<Character> input = new ArrayList<Character>();        // array list to check for vowels from function input
        ArrayList<Character> vowels = new ArrayList<Character>();       // vowel list that will need to be reversed
        ArrayList<Character> swap = new ArrayList<Character>();         // array list to store reversed vowels
        ArrayList<Integer> replace = new ArrayList<Integer>();          // position where characters need to be replaced in array list

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            input.add(s.charAt(i));

            if (s.charAt(i) == 'a') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            } else if (s.charAt(i) == 'e') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            } else if (s.charAt(i) == 'i') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            } else if (s.charAt(i) == 'o') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            } else if (s.charAt(i) == 'u') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            } else if (s.charAt(i) == 'A') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            } else if (s.charAt(i) == 'E') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            } else if (s.charAt(i) == 'I') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            } else if (s.charAt(i) == 'O') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            } else if (s.charAt(i) == 'U') {
                vowels.add(s.charAt(i));
                replace.add(i);
                count++;
            }
        }


        for (int i = vowels.size() - 1; i >= 0; i--)        // fills up "swap" array list to swap letters with
        {
            swap.add(vowels.get(i));
        }

        for (int i = 0; i < swap.size(); i++)                // swap reversed letters in array list
        {
            input.set(replace.get(i), swap.get(i));
        }

        for (int i = 0; i < input.size(); i++) {
            arr[i] = input.get(i);
        }

        String str = new String(arr);

        return str;
    }

    //////////////////////// CONTAINS DUPLICATES PROBLEM 217 ///////////////////////////////////////
    /*
        Given an array of integers, find if the array contains any duplicates.

        Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
     */

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //////////////////////// IMPROVED TWO SUM ///////////////////////////////////////
    /*
        Improved version of Two Sum function
     */

    public int[] twoSumImproved(int[] nums, int target) {

        int[] indices = new int[2];
        indices[0] = 0;
        indices[1] = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }

            }
        }
        return indices;
    }

    //////////////////////// IS ANAGRAM FUNCTION ///////////////////////////////////////
    /*
        Takes 2 input strings, converts to char arrays, sorts and compares them. Returns true if the inputs are anagrams of each other
     */
    public boolean isAnagram(String s, String t) {
        // convert to char arrays and then sort
        char[] input1 = s.toCharArray();
        char[] input2 = t.toCharArray();

        Arrays.sort(input1);
        Arrays.sort(input2);

        // compares both arrays, if the sorted arrays are identical then it is an anagram by nature
        if (Arrays.equals(input1, input2)) {
            return true;
        }

        return false;
    }

    //////////////////////// CUSTOM STRSTR FUNCTION ///////////////////////////////////////
    /*
        Incomplete, function works but runtime is too long
     */
    /*public int strStr(String haystack, String needle) {

        if(needle.isEmpty())
        {
            return 0;
        }

        else if(needle.length() > haystack.length())
        {
            return -1;
        }

        char[] hay = haystack.toCharArray();
        char[] iNeedle = needle.toCharArray();
        int count = 0;

        for(int i = 0; i < haystack.length(); i++)
        {
            if(hay[i] == iNeedle[0])
            {
                for(int j = i; j < needle.length() + i; j++)
                {
                    if(hay[j] == iNeedle[count])
                    {
                        count++;
                    }

                    if(count == needle.length())
                    {
                        return i;
                    }
                }
                count = 0;
            }
        }
        return -1;
    }*/

    //////////////////////// countPrimes FUNCTION ///////////////////////////////////////
    /*
        Incomplete, function works but runtime is too long
     */
    public int countPrimes(int n) {

        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        int notPrimeCount = 0;
        boolean notPrime = false;

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    notPrime = true;
                }
            }
            if (notPrime) {
                notPrime = false;
                notPrimeCount++;
            }
        }
        return n - notPrimeCount - 2;
    }

    //////////////////////// MOVE ZEROES PROBLEM 283 ///////////////////////////////////////
    /*
        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Note that you must do this in-place without making a copy of the array.
     */

    public void moveZeroes(int[] nums) { // bubble sort except it's with 0's at the end

        int temp = 0;

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] == 0) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        // print functionality for the test, not needed in practice
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //////////////////////// PLUS ONE PROBLEM 66 ///////////////////////////////////////
    /*
        Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

        The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
        You may assume the integer does not contain any leading zero, except the number 0 itself
     */

    public int[] plusOne(int[] digits) { // checks for trailing 9's by starting from the end, traces the array
        // from the end and stops when it reaches a non-9 number
        // also if the value is all 9's, makes a larger array and adds 1 with trailing 0's
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9 && i == 0) {
                int[] digits2 = new int[digits.length + 1];
                digits2[0] = 1;
                for (int j = 1; j < digits2.length - 1; j++) {
                    digits2[j] = 0;
                }
                return digits2;
            } else if (digits[i] == 9 && digits[i - 1] == 9) {
                digits[i] = 0;
            } else if (digits[i] == 9 && digits[i - 1] != 9) {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
                break;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }

    //////////////////////// JEWELS AND STONES PROBLEM 771 ///////////////////////////////////////
    /*
        You're given strings jewels representing the types of stones that are jewels, and stones
        representing the stones you have. Each character in stones is a type of stone you have.
        You want to know how many of the stones you have are also jewels.

        Letters are case sensitive, so "a" is considered a different type of stone from "A".
     */

    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    //////////////////////// LOGGER RATE LIMITED PROBLEM 771 ///////////////////////////////////////
    /*
        Design a logger system that receives a stream of messages along with their timestamps. Each unique
        message should only be printed at most every 10 seconds (i.e. a message printed at timestamp t will
        prevent other identical messages from being printed until timestamp t + 10).

        All messages will come in chronological order. Several messages may arrive at the same timestamp.
     */

    // use hash map with the String as the key and the timestamp as the value
    static class Logger {

        /**
         * Initialize your data structure here.
         */
        public Logger() {

        }

        HashMap logger = new HashMap();

        /**
         * Returns true if the message should be printed in the given timestamp, otherwise returns false.
         * If this method returns false, the message will not be printed.
         * The timestamp is in seconds granularity.
         */
        public boolean shouldPrintMessage(int timestamp, String message) {

            if (!logger.containsKey(message)) {
                logger.put(message, timestamp);
                System.out.println(message);
                return true;
            }

            if (timestamp < (int) logger.get(message) + 10) {
                return false;
            } else if (timestamp >= (int) logger.get(message) + 10) {
                System.out.println(message);
                logger.put(message, timestamp);
                return true;
            }

            return false;
        }
    }

    //////////////////////// DUPLICATE ZEROES PROBLEM 1089 ///////////////////////////////////////
    /*
        Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

        Note that elements beyond the length of the original array are not written.

        Do the above modifications to the input array in place, do not return anything from your function.
     */
    public void duplicateZeros(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && i >= 0) {
                if (count == 1) {
                    continue;
                }
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i += 1;
            }
        }
        for(int i = 0; i < arr.length; i++) // print statement for test method, not needed for function
        {
            System.out.print(arr[i] + " ");
        }
    }

    //////////////////////// RUNNING SUM OF 1D ARRAY PROBLEM 1089 ///////////////////////////////////////
    /*
        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

        Return the running sum of nums.
     */

    public int[] runningSum(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++)
        {
            nums[i+1] = nums[i] + nums[i+1];
        }
        return nums;
    }

    //////////////////////// SMALLER THAN CURRENT NUMBER PROBLEM 1365 ///////////////////////////////////////
    /*
        Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is,
        for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

        Return the answer in an array.
     */

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];

        // intitialize count to 0 just in case

        for(int i = 0; i < count.length; i++)
        {
            count[i] = 0;
        }

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] > nums[j])
                {
                    count[i]++;
                }
            }
        }

        for (int i: count) // print function for test, not necessary
        {
            System.out.print(i + " ");
        }
        return count;
    }

    //////////////////////// NUMBER OF GOOD PAIRS PROBLEM 1512 ///////////////////////////////////////
    /*
        Given an array of integers nums.

        A pair (i,j) is called good if nums[i] == nums[j] and i < j.

        Return the number of good pairs.
     */

    public int numIdenticalPairs(int[] nums) { // using HashMap

        int count = 0;

        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            a.put(i, nums[i]);
        }

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(a.get(i) == nums[j] && i < j)
                {
                    count++;
                }
            }
        }

        return count;
    }

    //////////////////////// DEFANGING AN IP ADDRESS PROBLEM 1108 ///////////////////////////////////////
    /*
        Given a valid (IPv4) IP address, return a defanged version of that IP address.

        A defanged IP address replaces every period "." with "[.]".
     */

    public String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }

    //////////////////////// SUM OF UNIQUE ELEMENTS PROBLEM 1748 ///////////////////////////////////////
    /*
        You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

        Return the sum of all the unique elements of nums.
     */

    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        int sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            a.put(nums[i], 0);
        }

        for(int i = 0; i < nums.length; i++)
        {
            a.put(nums[i], a.get(nums[i]) + 1);
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(a.get(nums[i]) > 1)
            {
                continue;
            }
            sum += nums[i];
        }

        return sum;
    }

    //////////////////////// FIND THE DUPLICATE NUMBER PROBLEM 287 ///////////////////////////////////////
    /*
        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

        There is only one repeated number in nums, return this repeated number.
     */

    public int findDuplicate(int[] nums) {

        int answer = 0;

        HashMap<Integer, Integer> a = new HashMap<>();

        // intitialize hash map to 0
        for(int i = 0; i < nums.length; i++)
        {
            a.put(nums[i], 0);
        }

        // populate hash map with keys and values, add + 1 each time it finds the key
        for(int i = 0; i < nums.length; i++)
        {
            a.put(nums[i], a.get(nums[i]) + 1);
        }

        // find the number that > 1, because it will be the only duplicate
        for(int i = 0; i < nums.length; i++)
        {
            if(a.get(nums[i]) > 1)
            {
                answer = nums[i];
                break;
            }
        }

        return answer;
    }

    //////////////////////// FIND THE SINGLE NUMBER PROBLEM 136 ///////////////////////////////////////
    /*
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     */

    public int singleNumber(int[] nums) { // This problem was almost identical to 287, changed conditions from 287 to solve
        int answer = 0;

        HashMap<Integer, Integer> a = new HashMap<>();

        // intitialize hash map to 0
        for (int i = 0; i < nums.length; i++) {
            a.put(nums[i], 0);
        }

        // populate hash map with keys and values, add + 1 each time it finds the key
        for (int i = 0; i < nums.length; i++) {
            a.put(nums[i], a.get(nums[i]) + 1);
        }

        // find the number that == 1, because it will be the only non duplicate
        for (int i = 0; i < nums.length; i++) {
            if (a.get(nums[i]) == 1) {
                answer = nums[i];
                break;
            }
        }

        return answer;
    }

    //////////////////////// FIND THE SINGLE NUMBER PROBLEM 136 ///////////////////////////////////////
    /*
        Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.

        We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.

        These lists A and B may contain duplicates. If there are multiple answers, output any of them.
     */

    public int[] anagramMappings(int[] A, int[] B) {

        int[] index = new int[A.length];

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < B.length; j++)
            {
                if(A[i] == B[j])
                {
                    index[i] = j;
                    continue;
                }
            }
        }
        System.out.print("The anagram map is: ");
        for (int i: index) // print function is for test, not necessary in practice
        {
            System.out.print(i + " ");
        }
        return index;
    }

}
