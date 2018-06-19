# Container-With-Most-Water
Find  two lines, which together with x-axis forms a container, such that the container contains the  most water.


Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find
 two lines, which together with x-axis forms a container, such that the container contains the
 most water.

 Note: You may not slant the container and n is at least 2.

# Solution:
1. An integer array is received as function parameter which contains heights of lines.

2. The idea is to start by storing line on 0'th index in a variable and line on i-1 index in another variable. 

3. Calculate the area between the two lines and save them in a temporary variable. We can calculate the area by checking which line is smaller of the two, in case if start is smaller then end then we can write something like </br>
area = start * (endIndex - startIndex)</br>
otherwise if end is smaller than start then</br>
area = end * (endIndex - startIndex);</br>

4. Next we will lock the line whose height is greater and move the other one. e.g if height of start line is greater then we will lock it and decrement from the end.

5. Check if maxArea which was initialized to Integer.MIN_VALUE is less than tempMaxArea then update max area.
