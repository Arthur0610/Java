// 不方便维护
// 如果要给老师和学生 添加 生日 属性
// priveate String birthday;
// getBirthday();
// setBirthday(String birthday);
// 如果要给老师和学生 删除 性别 属性

// 后期的维护 增加功能 删除功能 修改功能
// 从代码上 增加代码 删除代码 修改代码
// 目前来说 如果增加 删除 修改
// 每次都需要修改两份 老师 和 学生
// 如果门类增加 厨师 卫生人员 宿舍管理员
// 如果能把相同的属性 放在 一个地方
// 我们需要通过 继承 来解决  #1

// 子类 比 父类 强大

// 优势
// 减少了代码量
// 代码变得更加容易维护 后期维护

// Java只支持单继承 不支持多继承 但是支持多层继承
// 每个儿子 只有一个爸爸 不支持 多个爸爸
// C++ 支持多继承 支持多个爸爸

// 在子类构造函数中 super调用父类里面的无参构造方法  #2
// super(); //调用person父类里面的无参构造方法
// 放在子类的构造方法中第一条语句
//
// 继承注意事项
// 子类继承父类里面的成员（成员变量和成员方法）
// 子类不能访问父类里面的私有成员
// 子类和父类里面有同名变量 就近原则 this super
// 可以通过super调用父类里面的变量，方法和构造方法

// 通过this访问当前类里面的成员 通过super访问父类里面的成员
// this.name = name;
// super.name = name;
// 通过this super 调用构造方法的时候必须要在第一条语句 #3

// 方法重写（方法覆盖） override  #4
// 子类中的方法名，参数和返回值和父类一致
// 意义：子跟父类拥有相同的功能，但是子类有自己的特定内容和特定实现方式
// 可以定义一个不同的名字方法
// 但是为了见名知意 保持父类名字 自己重新实现方法体
// override注意事项
// 不允许重写private方法
// 重写的时候 访问权限不能更低 （最好保持权限一致）

// overload and override
// overload:
//   同一个类
//   方法名 一致 参数 不一致 返回值 不要求
// override:
//   子类 父类
//   方法名 参数 返回值 都必须一致


// final
// 放在 public private 后面 返回值前面
// final可以修饰 类 方法 变量
// final 类  表示这个类不能被继承
// final 方法 表示这个方法不能被子类重写
// final 变量（局部和成员变量） 表示一个常量

package com.arthur0610.person;

public class ExtendsDeemo1{
  public static void main(String[] args){
    // Teacher t1 = new Teacher("kk", 11, 'male', "PhD", "CS110", "Java");
    // t1.eat();
    // t1.sleep();
    // t1.teach();
    //
    // Student s1 = new Student("s1", 8, 'female', 19, 130);
    // s1.eat();
    // s1.sleep();
    // s1.learn();

    Teacher t1 = new Teacher("kk", 11, 'male', "10-15", "PhD", "CS110", "Java");
    t1.eat();
    t1.sleep();
    t1.teach();

    Student s1 = new Student("s1", 8, 'female', "10-05", 19, 130);
    s1.eat();
    s1.sleep();
    s1.learn();
  }
}

// class Teacher{
// teacher 子类 继承 person父类 #1
class Teacher extends Person{
  // 从父类从继承以下属性
  // private String name;
  // private int age;
  // private boolean gender;
  // private String birthday;
  private String title;
  private String course;
  private String className;

  //构造方法 三种
  public Teacher(){}
  // 当我们没有显式调用父类里面的构造方法的时候
  // 默认会调用父类里面的无参构造方法 对父类里面的属性进行初始化
  // 因为父类属性是private 只能在类中使用 需要重写构造方法

  // 调用第二个构造方法的时候 只对 子类 属性进行初始化
  public Teacher(String title, String course, String className){
    //  调用子类的 私有 初始化 属性
    init(title, course, className);
  }

  // 调用第三个构造方法的时候 对父类和子类 属性都进行初始化
  public Teacher(String name, int age, char gender, String birthday,
                  String title, String course, String className){
    // this.name = name;
    // this.age = age;
    // this.gender = gender;
    // this.birthday = birthday;
    // super(); //调用person父类里面的无参构造方法 #2
    super(name, age, gender, birthday);
    // // 调用同类里面的构造方法 完成重复代码 in 第二个构造方法
    // // // this.title = title;
    // // // this.course = course;
    // // // this.className = className;
    // this(title, course, className);  #3
    // this super必须放在 构造方法的第一条 然而现在 super 和 this 同时使用
    // 我们需要构造一个方法 去初始化 子类的 属性
    init(title, course, className);
  }

  // 构造一个私有的方法的来 对子类的 属性 进行初始化
  private void init(String title, String course, String className){
    this.title = title;
    this.course = course;
    this.className = className;
  }



  // 行为方法
  // public void eat(){
  //   System.out.println(name + "is eating");
  // }
  // public void sleep(){
  //   System.out.println(name + "is sleeping");
  // }


  public void teach(){
    // name 是 父类私有属性 需要调用 getName来访问
    // System.out.println(name + "is teaching");
    System.out.println(getName + "is teaching");
  }

  // 子类可以选择对父类里面的方法进行重写  #4
  public void eat(){
    System.out.println("show the teacher id");
    System.out.println(getName() + "is teaching");
  }

  //get 和 set方法
  // public String getName(){
  //   return name;
  // }
  // public void setName(String name){
  //   this.name = name;
  // }
  // public int getAge(){
  //   return age;
  // }
  // public void setAge(int age){
  //   this.age = age;
  // }
  // public boolean getGender(){
  //   return gender;
  // }
  // public void setGender(boolean gender){
  //   this.gender = gender;
  // }
  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public String getCourse(){
    return course;
  }
  public void setCourse(String course){
    this.course = course;
  }
  public String getClassName(){
    return className;
  }
  public void setClassName(String className){
    this.className = className
  }

}

// class Student{
// student 子类 继承 person 父类 #1
class Student extends Person{
  // 从父类从继承以下属性
  // private String name;
  // private int age;
  // private boolean gender;
  // private String birthday;
  private int classNumber;
  private int ranking;

  //构造方法 两种
  public Student(){}
  public Student(String name, int age, char gender, String birthday,
                  int classNumber, int ranking){
    // this.name = name;
    // this.age =age;
    // this.gender = gender;
    // this.birthday = birthday;
    super(name, age, gender, birthday);  //#2
    this.classNumber = classNumber;
    this.ranking = ranking;
  }

  //行为方法
  // public void eat(){
  //   System.out.println(name + "is eating");
  // }
  // public void sleep(){
  //   System.out.println(name + "is sleeping");
  // }
  public void learn(){
    // name 是 父类私有属性 需要调用 getName来访问
    // System.out.println(name + "is learning");
    System.out.println(getName + "is learning");
  }

  //get 和 set方法
  // public String getName(){
  //   return name;
  // }
  // public void setName(String name){
  //   this.name = name;
  // }
  // public int getAge(){
  //   return age;
  // }
  // public void setAge(int age){
  //   this.age = age;
  // }
  // public boolean getGender(){
  //   return gender;
  // }
  // public void setGender(boolean gender){
  //   this.gender = gender;
  // }
  public int getClassNumber(){
    return classNumber;
  }
  public void setClassNumber(int classNumber){
    this.classNumber = classNumber;
  }
  public int getRanking(){
    return ranking;
  }
  public void setRanking(int ranking){
    this.ranking = ranking;
  }

}


//父类  //#1
class Person{
  private String name;
  private int age;
  private char gender;
  private String birthday;

  // 父类person 提供两种构造方法
  public Person(){}
  public Person(String name, int age, char gender, String birthday){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.birthday = birthday;
  }

  //行为方法
  public void eat(){
    System.out.println(name + "is eating");
  }
  public void sleep(){
    System.out.println(name + "is sleeping");
  }


  //get 和 set 方法
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }
  public char getGender(){
    return gender;
  }
  public void setGender(char gender){
    this.gender = gender;
  }
  public String getBirthday(){
    return birthday;
  }
  public void setBirthday(String birthday){
    this.birthday = birthday;
  }

}
