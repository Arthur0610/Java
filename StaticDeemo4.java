import java.util.Arrays;

public class StaticDeemo4{
  public static void main(String[] args){
    int[] arr = new int[20];
    // // 调用java自身Arrays工具类
    // // Arrays.fill(arr, 100);
    // ArrayTool tool = new ArrayTool();
    // tool.fill(arr, 34);
    ArrayTool.fill(arr, 34);
    System.out.println(arr[0] + "-" + arr[1] + "-" + arr[7]);
    System.out.println(StringTool.indexOf("ojbk", 'k'));
  }
}

public class ArrayTool{
  //这个工具类私有化
  private ArrayTool(){}
  public static void fill(int[] arr, int number){
    for(int i = 0; i < arr.length; i++){
      arr[i] = number;
    }
  }
  public static int find(int[] arr,int number){
    int index = -1;
    for(int i = 0; i < arr.length; i++){
      if(number == arr[i]){
        index = i; break;
      }
    }
    return index;
  }
}

public class StringTool{
  private StringTool(){}
    public static int indexOf(String str, char c){
      int index = -1;
      for(int i = 0; i < arr.length(); i++){
        if(c == str.charAt(i)){
          index = i; break;
        }
      }
      return index;
    }
}

// 帮助文档的生成
// $javadoc -d api filename.java
// 一个类一个文件

// 静态代码块 == > 做初始化
// static{
//
// }
