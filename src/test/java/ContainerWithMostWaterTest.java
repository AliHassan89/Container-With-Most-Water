package test.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import main.java.ContainerWithMostWater;
import org.junit.Test;

public class ContainerWithMostWaterTest {

  ContainerWithMostWater container = new ContainerWithMostWater();

  @Test
  public void maxArea_shouldCheckEmptyArray(){
    //given
    int[] height = {};

    //when
    int area = container.maxArea(height);

    //then
    assertThat(area, equalTo(0));
  }

  @Test
  public void maxArea_shouldCheckAscendingHeights(){
    //given
    int[] height = {2,4,5,7,9,14};

    //when
    int area = container.maxArea(height);

    //then
    assertThat(area, equalTo(16));
  }

  @Test
  public void maxArea_shouldCheckDesendingHeights() {
    //given
    int[] height = {9,6,4,3,1};

    //when
    int area = container.maxArea(height);

    //then
    assertThat(area, equalTo(9));
  }

  @Test
  public void maxArea_shouldCheckRandomHeights(){
    //given
    int[] height = {4,1,6,9,3,10,2,4,5,8,3};

    //when
    int area = container.maxArea(height);

    //then
    assertThat(area, equalTo(48));
  }
}
