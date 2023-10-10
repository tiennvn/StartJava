/*
2. Write a function that takes an array of integers as an argument and returns a value based on the
sums of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array and let Y
= the sum of the even numbers. The function should return X - Y
The signature of the function is:
int f(int[ ] a)

Examples: 
if input array is return
{1} --> 1
{1, 2} --> -1
{1, 2, 3} --> 2
{1, 2, 3, 4} --> -2
{3, 3, 4, 4} --> -2
{3, 2, 3, 4} --> 0
{4, 1, 2, 3} --> -2
{1, 1} --> 2
{} --> 0
 */

package miu.sample;

public class Test2 {
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
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1)
                sumOdd += a[i];
            else
                sumEven += a[i];
        }

        return sumOdd - sumEven;
    }

}
