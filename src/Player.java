public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        healty(healthPercentage);
        this.weapon = weapon;
    }
  public void healty(int healthPercentage1){
      if(healthPercentage1>100){
         healthPercentage1=100;
         this.healthPercentage=healthPercentage1;
      } else if (healthPercentage1<0) {
          healthPercentage1=0;
          this.healthPercentage=healthPercentage1;
      }
      else {
          this.healthPercentage=healthPercentage1;
      }

  }
    public int healthRemaining(){
        return this.healthPercentage;
    }
    public void loseHealth(int damage){
        int resulHealth;
        resulHealth=this.healthPercentage-damage;
        healty(resulHealth);
        if (resulHealth<0){
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion){
        int resultHealth;
        resultHealth=this.healthPercentage+healthPotion;
        healty(resultHealth);
        if(resultHealth>100){
            this.healthPercentage=100;
        }
    }

    //@java.lang.Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
