public class Character {
        int level;
        double hp;
        int mana;
        double atk;
        double def;
        double runSpeed;
        int num;

        boolean isEquipShield;
        boolean isEquipSword;
        sword sword;
        shield shield;
        static int n = 0;
        public Character(int level,boolean isEquipSword, boolean isEquipShield){

            if(isEquipSword){
                this.sword = new sword(1);
            }else{
                this.sword = new sword(0);
            }
            if(isEquipShield) {
                this.shield = new shield(1);
            }else{
                this.shield = new shield(0);
            }
            n++;
            this.level = level;
            this.hp = 10+((level-1)*5);
            this.mana = 5+((level-1)*2);
            this.atk = level + sword.damage;
            this.def = level + shield.defence;
            this.runSpeed = 10+((level-1)*2) - (sword.SpeedSword + shield.SpeedShield);
            this.num = n;
        }
        public  int getLevel(){
            return level;
        }
        public double getHp() {
            return hp;
        }
        public int getMana(){
            return mana;
        }
    public double getAtk(){
        return atk;
    }
    public double getDef(){
        return def;
    }
    public double getRunSpeed(){
        return runSpeed;
    }
    public void Levelup(){
            level++;
            hp += 5;
            mana += 2;
            atk += 1;
            def += 1;
            runSpeed += 2;
        }
}
