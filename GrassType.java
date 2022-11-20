public class GrassType extends Monster {
    public GrassType(String name, int hp, int base) {
      super(name, "grass", "water", "fire", hp, base);
    }
  
    public void rest() {
      hp += (maxHP * 0.5);

      if (hp > maxHP) { // caps at the max HP
        hp = maxHP;
      }
      
      System.out.println(name + " rested.\n" + name + " healed by half its max HP, making it " + hp + "!");
    }

    public void special() {
      System.out.println(name + " did a pose.");
      
      hp += (maxHP * 0.2);

      if (hp > maxHP) { // caps at the max HP
        hp = maxHP;
      }

      System.out.println(name + "'s HP is raised by 20% of its max HP, making it " + hp + "!");
    }
}