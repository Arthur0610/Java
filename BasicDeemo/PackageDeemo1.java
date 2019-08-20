// Java类包 package
// 当我们开发项目很大的时候 我们会写很多类 这样的话 就不方便管理
// 而且容易重名
// 我们可以通过包对类进行分类管理 也可以避免重名问题
// 一种类型的Java类放在一个包中
// 或者一个模块的Java类放在一个包中
// 不同的包 里面可以包括 同名的类
//
// 怎么定义包
// package xx.xx.xx;
// 需要放在class 前面
//
// Java类包 命名规则
// com.username.xx;
// -->com.arthur0610.login;
// -->com.arthur0610.register;
// -->com.arthur0610.course;
// -->com.arthur0610.course.create;
//
// 可以按照功能 模块来划分包
// import java.util.Scanner;
import com.arthur0610.person.ExtendsDeemo1;
// package com.arthur0610.person


public class PackageDeemo1{
  public static void main(String[] agrs){
    // Scanner s = new Scanner();
    // // java.util.Scanner s = new java.util.Scanner(System.in);
    // // 某个类 只使用一次
    // String str = s.next();
    // System.out.println(str);
    ExtendsDeemo1.main(null);
  }
}
//
// 当你给类 添加了包之后 就不能用之前的方式来运行了
//
// $javac packageDeemo1.java
// $java packageDeemo1
// -->>>找不到或无法加载主类
// -->>>java.lang.NoClass.....
//
// 带包 的 类 的编译和运行
// $javac -d . filename(packageDeemo1).java
// $java com.arthur0610.person filename

// 权限修饰符
// 类 成员变量 成员方法
//              public    protected   defailt   priveate
// 同一个类      √          √           √         √
// 同一个包      √          √           √         X
// 子父类        √          √           X         X
// 不同包        √          X           X         X
