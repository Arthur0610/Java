// 公有私有public and private
// 构造方法


class ClassDeemo1{
  public static void main(String[] args){
    System.out.println("for public, private and initialization");
    // Student s = new Student();
    // s.name = "kk";
    // // s.age = 18;
    // s.setAge(-15);
    // s.id = "98765432";
    // s.gender = '男';
    // s.rank = 23;
    Student s = new Student("kk", 15, "987655", '男', 23);
    //通过set 方法来 实现值的赋予
    s.setRank(1);
    s.showOutside();
  }
}

class Student{
  private String name;
  //int age;
  private int age;
  private String id;
  private char gender;
  private int rank;

  // 构造方法
  // public Student(String n, int a, String i, char g, int r){
  //   name = n;
  //   age = a;
  //   id = i;
  //   gender = g;
  //   r = rank;
  // }
  // //构造方法 + this
  public Student(String name, int age, String id, char gender, int rank){
    this.name = name;
    this.age = age;
    this.id = id;
    this.gender = gender;
    this.rank = rank;
  }

  //提供get 方法获取 值
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getId(){
    return id;
  }
  public char getGender(){
    return gender;
  }
  public int getRank(){
    return rank;
  }

  //提供set 方法设置 值
  //提供set 方法需要谨慎 端口
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    if(age <= 0) {
      System.out.println("WARMING:AGE NUMBER CANNOT BE LOWER THAN 0");
      return; //表示方法返回 不再执行后续代码
    }
    this.age = age;
  }
  public void setId(String id){
    this.id = id;
  }
  public void setRank(int rank){
    this.rank = rank;
  }



  private void showInside(){
    System.out.println("name:" + name);
    System.out.println("age:" + age);
    System.out.println("id:" + id);
    System.out.println("gender:" + gender);
    System.out.println("rank:" + rank);
  }

  public void showOutside(){
    showInside();
  }
}

class Teacher{
  String name;
  String id;
  int age;
  char gender;
  String dpet;
  String course;

  public void show(){
    System.out.println("name" + name);
  }

}
