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
        System.out.println("技能 : 百步穿楊");
        System.out.println("裝備 : 很普通的弓箭");

        Berserker.name = "Berserker";
        Berserker.HP = 20;
        Berserker.MP = 5;
        Berserker.attack = 15;
        System.out.println("Name is "+Berserker.getName());
        System.out.println("攻擊" + Berserker.attack);
        System.out.println("技能 : 泰坦之暈");
        System.out.println("裝備 : 沒有殺傷力的斧頭");

        Magician.name = "Magician";
        Magician.HP = 10;
        Magician.MP = 30;
        Magician.attack = 40;
        System.out.println("Name is"+ Magician.getName());
        System.out.println("發動"+Magician.attack);
        System.out.println("技能 : 去去武器走");
        System.out.println("裝備 : 沒0的法杖");

    }
}
