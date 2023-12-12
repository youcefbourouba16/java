////////////
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
// of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
///
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.
////////
////////
/////////
/////////

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int max = 0;
        int right = height.length-1;
        int left = 0;
        while (left < right) {
            int temp = Math.min(height[left], height[right]) * (right - left);
            if (temp>max) max = temp;

            if (height[left] > height[right]) {
                right--;

            } else left++;

        }
        return max;




    }
}
