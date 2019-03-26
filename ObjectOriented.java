//基本的思想基础
//对一些问题的思考方式，思考习惯
//面向对象 //Object-Oriented
//面向过程 //Procedure-Oriented

//对于面向过程思想，强调的是过程 （动作）
//以动作为主 ==> C language

//对于面向对象思想，强调的是对象 （实体）
//以实体为主 ==> C++, Java, C#
//特点：
//1.面向对象是一种常见的思想，符合人们的思考习惯。
//2.面向对象的出现，将复杂的问题简单化。
//3.面向对象的出现，让曾经在过程中的执行者，变成了对象中的指挥者。
//4.
//封装 继承 动态

public class ObjectOriented{
    public static void main(String[] args){
      System.out.println("Procedure-Oriented//open the refrigerator door");
      System.out.println("Procedure-Oriented//put the elephant in");
      System.out.println("Procedure-Oriented//close the refrigerator door");

      System.out.println("the following code is for Object-Oriented:");
      Refrigerator r1 = new Refrigerator();
      r1.open();
      r1.put( new Elephant() );
      r1.close();
    }
}


class Refrigerator{
  String brand;
  String model;
  int capacity;
  Elephant ele;

  public void open(){
    System.out.println("open the refrigerator door");
    System.out.println("the inside light goes on");
  }
  public void close(){
    System.out.println("the inside light goes off");
    System.out.println("close the refrigerator door");
  }
  public void put(Elephant elephant){
    ele = elephant;
    System.out.println("put the " + ele.name + " in");
  }
}

class Elephant{
  String name = "feifei";
  int age;
  int weight;

  //我们可以定义更多的 变量 和 方法
}
