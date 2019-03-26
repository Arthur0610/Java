class ClassDeemo2{
  public static void main(String[] args){
    Phone p1 = new Phone();
    System.out.println(p1.getBrand() + "-" + p1.getPrice()
                      + "-" + p1.getColor());
    Phone p2 = new Phone("Sony", 900, "Blue");
    System.out.println(p2.getBrand() + "-" + p2.getPrice()
                      + "-" + p2.getColor());
    p2.call("Simon");
  }
}

class Phone{
  private String brand;
  private int price;
  private String color;

  //get方法和set方法
  public String getBrand(){
    return brand;
  }
  public void setBrand(String brand){
    this.brand = brand;
  }
  public int getPrice(){
    return price;
  }
  public void setPrice(int price){
    this.price = price;
  }
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }
  //构造方法
  //重载 设定两个重名的构造方法
  public Phone(){}
  public Phone(String brand, int price, String color){
    this.brand = brand;
    this.price = price;
    this.color = color;
  }

  public void call(String name){
    System.out.println("Calling to " + name);
  }


}
