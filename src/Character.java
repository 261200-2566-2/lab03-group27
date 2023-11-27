public class Character {
    private int level;
    private int hp;
    private int mana;
    private int atk;
    private int def;
    private int runSpeed;
    private final int playerNo;
    private boolean isAlive;
    sword sword;
    shield shield;
    static int n = 0;
    public Character(int level){
        this.sword = new sword(0);
        this.shield = new shield(0);
        this.level = level;
        mainStat(this);
        stat(level);
        n++;
        this.playerNo = n;
        this.isAlive = true;
    }
    public void equipSword(){
        if(!isAlive){
            System.out.println("Your character has died.");
            return;
        }
        if(sword.getLevel() == 0){
            sword.levelUp();
            stat(level);
        }else {
            System.out.println("You are already equipped with a sword.");
        }
    }
    public void equipShield(){
        if(!isAlive){
            System.out.println("Your character has died.");
            return;
        }
        if(shield.getLevel() == 0){
            shield.levelUp();
            stat(level);
        }else {
            System.out.println("You are already equipped with a shield.");
        }
    }
    private void mainStat(Character p){
        p.hp = 10+((level-1)*5);
        p.mana = 5+((level-1)*2);
    }
    private void stat(int level){
        this.atk = level + sword.getAtk();
        this.def = level + shield.getDef();
        this.runSpeed = 12+((level-1)*2) - (sword.getSpeed() + shield.getSpeed());
    }
    public void levelUp(){
        if(!isAlive){
            System.out.println("Your character has died.");
            return;
        }
        if(level < 10){
            level++;
            mainStat(this);
            stat(level);
        }else {
            System.out.println("Your character's level has reached its maximum.");
        }
    }
    public void upgradeSword(){
        if(!isAlive){
            System.out.println("Your character has died.");
            return;
        }
        if(sword.getLevel() == 0){
            System.out.println("You have not equipped the sword yet.");
            return;
        }
        sword.levelUp();
        stat(level);
    }
    public void upgradeShield(){
        if(!isAlive){
            System.out.println("Your character has died.");
            return;
        }
        if(shield.getLevel() == 0){
            System.out.println("You have not equipped the shield yet.");
            return;
        }
        shield.levelUp();
        stat(level);
    }
    public void attack(Character p){
        if(!isAlive){
            System.out.println("Your character has died.");
            return;
        }
        if(!p.isAlive){
            System.out.println("You cannot attack dead characters.");
            return;
        }
        int damage = this.atk - p.def;
        if(damage <= 0) {
            System.out.println("Your atk is too low to attack.");
            return;
        }
        p.hp -= damage;
        if(p.hp < 0) {
            p.hp = 0;
            p.isAlive = false;
        }
    }
    public  int getLevel(){
        return level;
    }
    public int getHp() {
        return hp;
    }
    public int getMana(){
        return mana;
    }
    public int getAtk(){
        return atk;
    }
    public int getDef(){
        return def;
    }
    public int getRunSpeed(){
        return runSpeed;
    }
    public boolean getIsAlive(){
        return isAlive;
    }
    public int getPlayerNo() { return playerNo; }
}
