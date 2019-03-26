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

class StaticDeemo2{
  public static void main(String[] args){
    Person p1 = new Person("kk", 19);
    p1.country = "china";
    Person p2 = new Person("qq", 10);
    p2.country = "U.S.";

    // // System.out.println(p1.name + "-" + p1.age + "-" + p1.country);
    // // System.out.println(p2.name + "-" + p2.age + "-" + p2.country);
    // // // Xies-MacBook-Pro:Java xie$ javac StaticDeemo.java
    // // // Xies-MacBook-Pro:Java xie$ java StaticDeemo
    // // // kk-19-U.S.  <------- kk's country will be china. why U.S.
    // // // qq-10-U.S.
    // // // 仅仅只能保存一个值
    // //静态成员变量 通过类来访问
    // System.out.println(p1.name + "-" + p1.age + "-" + Person.country);
    // System.out.println(p2.name + "-" + p2.age + "-" + Person.country);

    Person.show(p1);
    Person.show(p2);
  }
}

class Person{
  // 添加一个静态的成员变量
  public static String country;
  public String name;
  public int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  // 静态方法不能访问费静态变量
  // public static void show(){
  //   System.out.println(name + "-" + age);
  // }
  // StaticDeemo2.java:44: error: non-static variable name cannot be referenced from a static context
  //   System.out.println(name + "-" + age);
  //                      ^
  // StaticDeemo2.java:44: error: non-static variable age cannot be referenced from a static context
  //   System.out.println(name + "-" + age);
  //                                   ^
  // 2 errors

  // 可以把person 对象 当作一个参数 传递过来
  // 不是直接访问 通过对象访问
  public static void show(Person p){
    System.out.println(p.name + "-" + p.age);
  }
}
