class Main {
  public static void main(String[] args) {
    System.out.println("\n\nWELCOME !!\n\n");
    
    Location l1 = new Location("Lavaridge Town", "Lava Cookie");
    Trainer t1 = new Trainer("Katch");
    NPC n1 = new NPC("Flannery", "Puny Trainer, how good to see you've made it here!");
    FireType f1 = new FireType("Torchic", 100, 50);

    System.out.println("Trainer " + t1.getName() + " inspected Monster " + f1.getName() + ".");
    t1.inspect(f1);

    System.out.println("Trainer " + t1.getName() + " inspected NPC " + n1.getName() + ".");
    t1.inspect(n1);

    System.out.println("Trainer " + t1.getName() + " inspected Location " + l1.getName() + ".");
    t1.inspect(l1);
  }
}