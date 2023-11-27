public class sword  {
    private int level;
    private int atk;
    private int speed;
    public sword(int level){
        this.level = level;
        stat();
    }
    void levelUp(){
        if(level < 5){
            level++;
            stat();
        }else {
            System.out.println("Your sword's level has reached its maximum.");
        }
    }
    void stat(){
        atk = level*2;
        speed = level;
    }
    public int getLevel(){return level;}
    public int getAtk(){return atk;}
    public int getSpeed(){return speed;}
}
