/**

 Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find
 two lines, which together with x-axis forms a container, such that the container contains the
 most water.

 Note: You may not slant the container and n is at least 2.

 */

package main.java;

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int len = height.length;
    if (len < 2)
      return 0;

    int endIndex = len - 1;
    int startIndex = 0;
    int start = height[startIndex];
    int end = height[endIndex];
    int maxAreaVal = Integer.MIN_VALUE;
    int area;
    while (startIndex < endIndex){
      if (start <= end){
        area = start * (endIndex - startIndex);
        start = height[++startIndex];
      }
      else{
        area = end * (endIndex - startIndex);
        end = height[--endIndex];
      }

      maxAreaVal = Math.max(area, maxAreaVal);
    }

    return maxAreaVal;
  }

}
