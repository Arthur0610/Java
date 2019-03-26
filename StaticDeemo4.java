import java.util.Arrays;

class StaticDeemo4{
  public static void main(String[] args){
    int[] arr = new int[20];
    // // 调用java自身Arrays工具类
    // // Arrays.fill(arr, 100);
    // ArrayTool tool = new ArrayTool();
    // tool.fill(arr, 34);
    ArrayTool.fill(arr, 34);
    System.out.println(arr[0] + "-" + arr[1] + "-" + arr[7]);
  }
}

class ArrayTool{
  public static void fill(int[] arr, int number){
    for(int i = 0; i < arr.length; i++){
      arr[i] = number;
    }
  }
}
