public class Role {
    public static void main(String[] args) {
        Person Archer = new Person();
        Person Berserker = new Person();
        Person Magician = new Person();

        Archer.name = "Archer";
        Archer.HP = 15;
        Archer.MP = 10;
        Archer.attack = 10;
        System.out.println("Name is "+ Archer.getName());
        System.out.println("傷害 " + Archer.attack);

        Berserker.name = "Berserker";
        Berserker.HP = 20;
        Berserker.MP = 5;
        Berserker.attack = 15;

        Magician.name = "Magician";
        Magician.HP = 10;
        Magician.MP = 30;
        Magician.attack = 40;

    }
}
