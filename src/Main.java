// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //set char
        Character p1 = new Character(1,false,false);
        printChar(p1);
        Character p2 = new Character(5,false,false);
        printChar(p2);
        equipSword(p2);
        System.out.println(p1.isEquipSword);
//        p2.sword.swordLevelUp();
        printChar(p2);
        }
        //print char
        public static  void printChar(Character p){
            System.out.println("P"+ p.num + " Level : " + p.getLevel());
            System.out.println("P" + p.num + " Hp : " + p.getHp());
            System.out.println("P" + p.num + " Mana : " + p.getMana());
            System.out.println("P" + p.num + " Atk : " + p.getAtk());
            System.out.println("P" + p.num + " Def : " + p.getDef());
            System.out.println("P" + p.num + " runSpeed : " + p.getRunSpeed());
        }
        public static  void attack(Character p1, Character p2){
            if(p1.atk > p2.def){
               p2.hp = p2.hp - (p1.atk - p2.def);
                if(p2.hp <= 0){
                    System.out.println("P"+p2.num+" Died");
                    return ;
                }
               System.out.println("P"+ p2.num + " Hp : " + p2.getHp());
            }else{
                System.out.println("No damaged");
            }
        }
        public static void equipSword(Character p1){
            p1.isEquipSword = true;
        }
        public static void equipShield(Character p1){
            p1.isEquipShield = true;
        }
        public static void unequipSword(Character p1){
            p1.isEquipSword = false;
        }
         public static void unequipShield(Character p1){
        p1.isEquipShield = false;
        }
}

