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
// 我们需要通过 继承 来解决

// 子类 比 父类 强大
// 优势 后期维护简单
// 减少了代码量

// 在子类构造函数中 super调用父类里面的无参构造方法
// super(); //调用person父类里面的无参构造方法
// 放在子类的构造方法中第一条语句

class ExtendsDeemo1{
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
// teacher 子类 继承 person父类
class Teacher extends Person{
  // 从父类从继承以下属性
  // private String name;
  // private int age;
  // private boolean gender;
  // private String birthday;
  private String title;
  private String course;
  private String className;

  //构造方法 两种
  public Teacher(){}
  // 因为父类属性是private 只能在类中使用 需要重写构造方法
  public Teacher(String name, int age, char gender, String birthday,
                  String title, String course, String className){
    // this.name = name;
    // this.age = age;
    // this.gender = gender;
    // this.birthday = birthday;
    // super(); //调用person父类里面的无参构造方法
    super(name, age, gender, birthday);
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
// student 子类 继承 person 父类
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
    super(name, age, gender, birthday);
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


//父类
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
