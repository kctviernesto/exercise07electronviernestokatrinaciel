import java.util.ArrayList;

public abstract class Monster implements Interactive { // filename and class changed to Monster (originally SimpleMonster); class is now abstract and implements Interactive
    protected final String name, type, strongAgainst, weakAgainst; // changed to protected (originally private)
    protected int maxHP, hp, atk, def, xp, lvl; // changed to protected (originally private)
    private static ArrayList<Monster> monsterList = new ArrayList<>();

    protected Monster(String n, String t, String s, String w, int m, int base) { // changed to protected (originally public)
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }

    public abstract void special(); // method is now abstract; body is made empty

    public void restoreHealth(){
        hp = maxHP;
    }

    public void interact() {
      System.out.println("This monster is a " + name + ". It is a " + type + " type.\n");
    }
}