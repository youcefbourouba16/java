import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Median_of_Two_Sorted_Arrays {
    /*
    Given two sorted arrays nums1 and nums2 of size m and n respectively,
     return the median of the two sorted arrays.

     The overall run time complexity should be O(log (m+n)).
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length + nums2.length;
        int[] numb = new int[m];
        double d;
        int i = 0;
        for (int c: nums1) {
            numb[i] = c;
            i++;
        }
        for (int c: nums2) {
            numb[i] = c;
            i++;
        }
        int min = numb[0];


        Arrays.sort(numb);
        if (i%2==0) return  (double) (numb[i / 2] + numb[(i / 2) + 1]) /2;
        else return  (double) (numb[(i / 2)] /2);
    }
    static int[] order(int[] numb){
        for (int k = 0; k < numb.length; k++) {
            for (int l = 0; l < numb.length; l++) {
                if (numb[k] < numb[l]) {
                    int temp = numb[l];
                    numb[l] = numb[k];
                    numb[k]=temp;


                }
            }
        }
        return  numb;


    }

    public static void main(String[] args) {
        int[] numb = new int[5];
        int[] numb1 = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("bla");
            numb[i] = scan.nextInt();

        }
        numb1 = order(numb);
        for (int i = 0; i < 5; i++) {
            System.out.println(numb1[i]+" ");


        }


    }
}
