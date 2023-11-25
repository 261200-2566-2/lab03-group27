public class lab03 {
    public static void main(String[] args) {
        //set char
        Character p1 = new Character(1);
        printStat(p1);
        System.out.println(" ");
        Character p2 = new Character(5);
        printStat(p2);
        System.out.println(" ");

        //test equip func
        System.out.println("test equip func");
        p1.equipSword();
        p1.equipShield();
        printStat(p1);
        System.out.println(" ");

        //test levelUp func
        System.out.println("test levelUp func");
        p2.levelUp();
        printStat(p2);
        System.out.println(" ");

        //test upgrade func
        System.out.println("test upgrade func");
        p1.upgradeSword();
        printStat(p1);
        System.out.println(" ");
        p2.upgradeShield();
        printStat(p2);
        System.out.println(" ");

        //test attack func
        System.out.println("test attack func");
        System.out.println("Player 2 attack player 1");
        p2.attack(p1);
        printStat(p1);
        System.out.println(" ");
        System.out.println("Player 1 attack player 2");
        p1.attack(p2);
        System.out.println(" ");
        System.out.println("Player 2 attack player 1 to dead");
        p2.attack(p1);
        p2.attack(p1);
        p2.attack(p1);
        printStat(p1);
        System.out.println(" ");
        p1.attack(p2);
        p1.levelUp();
        p1.upgradeSword();
    }
    static void printStat (Character p){
        if(!p.getIsAlive()){
            System.out.println("Player " + p.getPlayerNo() + " has died.");
            return;
        }
        System.out.println("Player " + p.getPlayerNo() + " Level : " + p.getLevel());
        System.out.println("Hp : " + p.getHp());
        System.out.println("Mana : " + p.getMana());
        System.out.println("Atk : " + p.getAtk());
        System.out.println("Def : " + p.getDef());
        System.out.println("Run speed : " + p.getRunSpeed());
        if(p.sword.getLevel() != 0) System.out.println("Sword level : " + p.sword.getLevel());
        if(p.shield.getLevel() != 0) System.out.println("Shield level : " + p.sword.getLevel());
    }
}

