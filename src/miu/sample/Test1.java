/*
1. Write a function that accepts an array of non-negative integers and returns the second largest
integer in the array. Return -1 if there is no second largest.
The signature of the function is 
int f(int[ ] a)
Examples:
if the input array is return
{1, 2, 3, 4} --> 3
{{4, 1, 2, 3}} --> 3
{1, 1, 2, 2} --> 1
{1, 1} --> -1
{1} --> -1
{}  --> -1
 */

package miu.sample;

public class Test1 {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 5, 3, 9, 1, 4, 7, 9, 8, 3, 4 };
        var result = f(input);
        System.out.println("result: " + result);

        System.out.println(f(new int[] { 1, 2, 3, 4 }));
        System.out.println(f(new int[] { 4, 1, 2, 3 }));
        System.out.println(f(new int[] { 1, 1, 2, 2 }));
        System.out.println(f(new int[] { 1, 1 }));
        System.out.println(f(new int[] { 1 }));
        System.out.println(f(new int[] {}));
    }

    public static int f(int[] a) {
        int len = a.length;
        if (len < 2)
            return -1;
        int max1st = a[0];
        int max2nd = a[1];
        if (max1st < max2nd) {
            max1st = a[0];
            max2nd = a[1];
        }
        for (int i = 2; i < len; i++) {
            if (a[i] > max1st) {
                max2nd = max1st;
                max1st = a[i];
            } else if (a[i] != max1st && a[i] > max2nd) {
                max2nd = a[i];
            }
        }

        return max2nd;
    }

}
