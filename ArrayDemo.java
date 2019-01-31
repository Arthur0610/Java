class ArrayDemo
/*


*/
{
  public static void main(String[] arg) {
    //数组
    //case1:元素类型[] 数组名 = new 元素类型[元素个数或数组长度];
    //需要一个容器 但是不明确容器的具体数据
    int[] arr1 = new int[3];
    //case2:元素类型[] 数组名 = new 元素类型[] {元素，元素，....}；
    //需要一个容器 存储已知的具体数据
//  int[] arr2 = new int[] {3, 5, 1, 7};
    int[] arr2 = {3, 5, 1, 7};
    //
    System.out.println(arr1[0]);
    arr1[1] = 1;
    System.out.println(arr1[1]);

    System.out.println(arr2[0]);

    System.out.println(arr1);  //[I@7852e922
    System.out.println(arr2);  //[I@4e25154f

    //[I@4e25154f
    // [ -> 数组
    // I -> integer
    // 4e25154f -> 内存中的地址


    /*
    对数组操作最基本的动作是 存储 和 获取
    核心思想： 就是对角标的操作
    */

    System.out.println("length =" + arr2.length);

    for(int i = 0; i < arr2.length; i++) {
      System.out.println("arr[" + i + "] =" + arr2[i]);
    }


  }


}
