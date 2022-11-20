public class FireType extends Monster {
    public FireType(String name, int hp, int base) {
      super(name, "fire", "grass", "water", hp, base);
      
      atk *= 1.3;
      def *= 0.7;
    }

    public void special() {
      System.out.println(name + " did a pose.");

      atk += 2;
      hp -= (maxHP * 0.1);

      if (hp < 0) { // caps at 0 hp
        hp = 0;
      }

      System.out.println(name + "'s attack increased by 2, but its HP is reduced by 10% of its max HP, making it " + hp + "!");

      if (hp == 0) {
        System.out.println(name + " fainted.");
      }
    }
}