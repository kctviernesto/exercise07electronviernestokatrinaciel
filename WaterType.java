public class WaterType extends Monster {
    public WaterType(String name, int hp, int base) {
      super(name, "water", "fire", "grass", hp, base);
      
      atk *= 0.7;
      def *= 1.3;
    }

    public void special() {
      System.out.println(name + " did a pose.");

      def += 2;
      hp -= (maxHP * 0.1);

      if (hp < 0) { // caps at 0 hp
        hp = 0;
      }

      System.out.println(name + "'s defense increased by 2, but its HP is reduced by 10% of its maximum HP, making it " + hp + "!");

    if (hp == 0) {
        System.out.println(name + " fainted.");
      }
    }
}