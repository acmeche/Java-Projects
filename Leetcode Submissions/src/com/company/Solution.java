package com.company;

public class Solution {

    /////////// NUM TEAMS PROBLEM 1395 ////////////////

    /*
    PROBLEM: There are n soldiers standing in a line. Each soldier is assigned a unique rating value.

    You have to form a team of 3 soldiers amongst them under the following rules:

    Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
    A team is valid if:  (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).

    Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).*/

    public int numTeams(int[] rating)
    {
        int count = 0;
        int size = rating.length;

        for(int i = 0; i < size; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                for(int k = j + 1; k < size; k++)
                {
                    if((rating[i] < rating[j] && rating[j] < rating[k]) || (rating[i] > rating[j] && rating[j] > rating[k]))
                    {
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

        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] > nums[i + 1])
            {
                count++;
                if(count >= 2)
                {
                    return false;
                }
                if(i == 0)
                {
                    nums[i] = nums[i+1] - 1;
                }
               if(i >= 1 && nums[i - 1] > nums[i + 1])
                {
                    nums[i-1] = nums[i] - nums[i+1] -1;
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
        for(int i = 0; i < x.length; i++)
        {
            // check in the char array for A and increment count, if count > 1 then set to false and return
            if(x[i] == 'A')
            {
                count++;
            }
            if(count > 1)
            {
                reward = false;
                return reward;
            }

            // check in the string for "LLL"
            else if(s.contains("LLL"))
            {
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
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
