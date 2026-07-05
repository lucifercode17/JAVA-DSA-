package binary_two_darray;

import java.util.Arrays;

public class searchinmatrix {
  public static void main(String[] args) {
    int[][] matrix = {
      {10,20,30,40},
      {15,25,35,45},
      {28,29,37,49}
    };
    int target =29;
    int[] answer = findgtarget(matrix, target);
    System.out.println(Arrays.toString(answer));
  }
  public static int[] findgtarget(int[][] matrix ,int target){
    int r = 0;
    int c = matrix.length -1;

    while (r < matrix.length && c >=0) {
      if(matrix[r][c] == target){
        return new int[] {r,c};

      }
      else if (matrix[r][c] < target) {
        r++;
        
      }else{
        c--;
      }
    }
    return new int[]{-1,-1};

  }

}
