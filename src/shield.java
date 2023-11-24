public class shield {
    int level;
    double defence;
    double SpeedShield;
    shield(int level){
        if(level >= 1){
        this.level = level;
        this.defence = 3;
        SpeedShield = 1;}else{
            this.level = level;
            this.defence = 0;
            SpeedShield = 0;
        }
    }
    void shieldLevelUp(){
        level++;
        defence += 2;
        SpeedShield += 1;
    }

}
