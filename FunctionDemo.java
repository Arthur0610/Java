class FunctionDemo

/*

如何定义一个函数？两个明确
明确一： 这个功能的结果是什么？
明确函数的返回值类型。
明确二： 这个功能实现过程中是否需要未知内容参与运算？
明确参数列表。

返回值类型和参数类型没有直接联系
*/

{
  public static void main(String[] arg) {

    int result = addition(3, 5);

    System.out.println("Case 1: sum = " + result);

    printHello();

    drawRectangle(3, 4);

    System.out.println("Case 4: " + equals(1,2));

    int maxTwo = maxTwo(3, 4);
    System.out.println("Case 5: maxTwo = " + maxTwo);

  }
  //
  //
  // modifier: static
  // Because the value of constants cannot be changed, there might as well
  // be only one copy of the values across all objcects of the class.

  // return type: int
  // exceptional case: void
  // if the function dont have the specific return value.
  // using a indntifier (reserved word) void to express the return type.
  // return ;


  //function name: addition

  // parameter type and name: int a

  // case 1: make a function called addition
  // add two integer number and return sum;
  public static int addition(int a, int b) {
    return a + b;
  }
  // case 2: make a function called printHello
  public static void printHello() {
    System.out.println("Case 2: Hello World!");

    //return ;
    //we can ignore the return if the return type is void.
  }
  // case 3: make a function called drawRectangle
  public static void drawRectangle(int row, int col) {
    System.out.println("Case 3:");
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // case 4: make a function called equals to compare one
  // interger is equals to another one.
  public static boolean equals(int a, int b) {
    return a == b;
  }

  // case 5: make a function called maxTwo to compare
  // two integers.
  public static int maxTwo(int a, int b) {
    return a > b ? a : b;
  }

  // case 6: make a function called




}
