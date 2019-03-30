class InnerClassDeemo1{
  public static void main(String[] args){

  }
}


// 外部类
class Outer{
  private int age;
  public Outer(int age){
    this.age = age;
  }
  // 把一个类 定义在 类中 就是内部类
  private class Inner{}
}
