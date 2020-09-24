import java.util.Scanner;

public class SpiralMatrix {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number;


      //Validate input data
      do {
          System.out.println("Enter The Value For N :");
          while (!sc.hasNextInt()) {
              System.out.println("Please enter a positive number!");
              sc.next();
          }
          number = sc.nextInt();
      } while (number <= 0);


      //int n = sc.nextInt();
      int matrixSize = (number * 2)-1 ;

      int minRow = 0;
      int minCol = 0;
      int maxRow = matrixSize -1;
      int maxCol = matrixSize -1;
      int[][] spiralMatrix = new int[matrixSize][matrixSize];

      for (int value = 1; value <= number; value++) {
          //System.out.println(value);

          //RightDirectional Matrix
          for (int rightDir = minCol; rightDir <= maxCol; rightDir++) {
              spiralMatrix[minRow][rightDir] = value;
              //System.out.println("Value for matrix " + minRow + ":" + rightDir  + " is " + value);
          }

          //DownDirectional Matrix
          for (int downDir = minRow; downDir <= maxRow; downDir++) {
              spiralMatrix[downDir][maxCol] = value;
              //System.out.println("Value for matrix " + minRow + ":" + rightDir  + " is " + value);
          }

          //LeftDirectional Matrix
          for (int leftDir = minCol; leftDir <= maxCol; leftDir++) {
              spiralMatrix[maxRow][leftDir] = value;
              //System.out.println("Value for matrix " + minRow + ":" + rightDir  + " is " + value);
          }

          //UpDirectional Matrix
          for (int upDir = minRow; upDir <= maxRow; upDir++) {
              spiralMatrix[upDir][minCol] = value;
              //System.out.println("Value for matrix " + minRow + ":" + rightDir  + " is " + value);
          }

          //Increase minimum column and row by 1 and decrease maximum column and row by 1
          minCol = minCol + 1;
          minRow = minRow + 1;
          maxCol = maxCol -1;
          maxRow = maxRow -1;

      }

      // Print Spiral Matrix
      for (int i = 0; i < spiralMatrix.length; i++)
      {
          for (int j = 0; j < spiralMatrix.length; j++)
          {
              System.out.print(spiralMatrix[i][j]+ "\t");
          }

          System.out.println();

      }

  }
}
