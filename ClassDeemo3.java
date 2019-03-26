class ClassDeemo3{
  public static void main(String[] args){
    Rectangle r1 = new Rectangle();
    System.out.println("Perimter:" + r1.getPerimeter());
    System.out.println("Area:" + r1.getArea());
    Rectangle r2 = new Rectangle(2);
    System.out.println("Perimter:" + r2.getPerimeter());
    System.out.println("Area:" + r2.getArea());
    Rectangle r3 = new Rectangle(3, 3);
    System.out.println("Perimter:" + r3.getPerimeter());
    System.out.println("Area:" + r3.getArea());
  }
}

class Rectangle{
  private int length;
  private int width;

  public int getLength(){
    return length;
  }
  public int getWidth(){
    return width;
  }
  public void setLength(int length){
    this.length = length;
  }
  public void setWidth(int width){
    this.width = width;
  }

  public int getPerimeter(){
    return 2 * (length + width);
  }
  public int getArea(){
    return length * width;
  }

  //重载 三个构造方法
  public Rectangle(){
    width = 1;
    length = 1;
  }
  public Rectangle(int meter){
    width = length = meter;
  }
  public Rectangle(int length, int width){
    this.length = length;
    this.width = width;
  }
}
