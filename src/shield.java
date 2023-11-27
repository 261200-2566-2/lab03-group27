public class shield {
    private int level;
    private int def;
    private int speed;
    shield(int level){
        this.level = level;
        stat();
    }
    void levelUp(){
        if(level < 5){
            level++;
            stat();
        }else {
            System.out.println("Your shield's level has reached its maximum.");
        }
    }
    void stat(){
        def = level*2;
        speed = level;
    }
    public int getLevel(){return level;}
    public int getDef(){return def;}
    public int getSpeed(){return speed;}
}
