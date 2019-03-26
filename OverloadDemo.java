class OverloadDemo

/*

函数 重载
1. 同一个类
2. 同名
3. 参数个数不同 or 参数类型不同
4. 函数重载和返回值类型无关
5. java是严谨性语言 如果函数出现调用的不确定性 编译会失败


重载 在设计上体现
只要功能一致 都用同一个名称表示 用参数列表区分其不同
*/
{
  public static void main(String[] arg) {
    System.out.println("1 + 3 + 4 = " + addition(1, 3, 4));

    System.out.println("Overload multiplicationTable Case 1:");
    multiplicationTable();
    System.out.println("Overload multiplicationTable Case 2:");
    multiplicationTable(5);
  }
  //case1: function addition
  public static int addition(int a, int b) {
    return a + b;
  }

  public static double addition(double a, double b) {
    return a + b;
  }

  public static int addition(int a, int b, int c) {
    return addition(a, b) + c;
  }

  //case2: multiplicationTable
  public static void multiplicationTable(int num) {
    for(int i = 0; i < num; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print(j + "*" + i + "=" + i*j + "\t");
      }
      System.out.println();
    }
  }

  public static void multiplicationTable() {
    multiplicationTable(9);
  }

}



first test for using github
