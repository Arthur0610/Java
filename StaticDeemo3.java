// staic关键字（静态修饰符）
// 修饰成员变量和成员方法
// 可以通过对象和类来调用（调用的都是同一个）
// 修饰成员变量表示静态变量 静态变量是对所有对象公有的
// 在内存中只占有一份内存
// 修饰成员方法表示静态方法 静态方法只能访问静态变量


// static 特点
// 随着类的加载而加载
// 优先于对象存在
// 所有对象共享（可以通过对象或者类来访问）

// mian方法就是一个静态方法 可以通过类名来直接调用
// StaticDeemo3.main  直接调用

// 使用 static地方： 工具类的创建
//  数组工具类 ArrayTool
//  字符串工具类 StringTool


class StaticDeemo3{
  public static void main(String[] args){
    // // Circle c1 = new Circle(2);
    // // System.out.println(c1.getPerimeter());
    //
    // System.out.println(Circle.pi);
    // System.out.println(GameManager.level);
    // System.out.println(GameManager.lifeNumber);
    // System.out.println(GameManager.score);

    for(String s : args){
      System.out.println(s);
    }
    // Xies-MacBook-Pro:Java xie$ javac StaticDeemo3.java
    // Xies-MacBook-Pro:Java xie$ java StaticDeemo3 23 34
    // 23
    // 34

    // for(int i = 0; i < args.length; i++){
    //   System.out.println(args[i]);
    // }


  }
}

class Circle{
  public float radius;
  public static float pi = 3.141592f;

  public float getPerimeter(){
    return 2*pi*radius;
  }

  public Circle(float radius){
    this.radius = radius;
  }
}

class GameManager{
  public static int level = 1;
  public static int lifeNumber = 3;
  public static int score = 1;
}
