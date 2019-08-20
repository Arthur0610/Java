

class Player{
  String name;
  int tankLevel;
  int damage;
  int tankHp;

  public void move(){
    System.out.println("move");
  }

  public void attack(){
    System.out.println("attack");
  }

  public void takeDamage(int dmg){
    tankHp -= dmg;
  }

  public boolen isDead() {
    if(tankHp <= 0) return true;
    else return false;
  }
}

class Enemy{
  int type;
  int hp;
  int damage;

  public void takeDamage(int dmg){
    hp -= dmg;
  }

  public boolen isDead() {
    if(hp <= 0) return true;
    else return false;
  }
}


public class TankDeemo{

//==============重构============
//分成三个种类
//游戏系统相关
//主角相关
//敌人相关
  public static void main(String[] args) {
    int lifeNum = 3;
    int score = 0;
    int level = 1;

    Player p1 = new Player();//我们利用类 声明变量 叫做对象
    p1.move();

    Enemy enemy1 = new Enemy();
    enemy1.type = 1; enemy1.hp = 10; enemy1.damage = 10;

    enemy1.takeDamage(p1.damage);
  }
//通过函数让代码结构更加简洁
//更加有结构性 方便后期管理 维护
//引入面向对象


}
