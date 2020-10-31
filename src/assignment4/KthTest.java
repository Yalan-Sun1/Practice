package assignment4;

import static assignment4.Kth.kthLargestElement;

public class KthTest {
    public static void main(String[] args) {
        int array[] = new int[] { 3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.print("K'th largest element is " + kthLargestElement(array,k));
    }
}
