package V3;

public class Main {

    public static void main(String[] args) {

        Character warrior = new Warrior("Yara");
        warrior.setWeapon(new AxeBehaviour());
        warrior.walk();
        warrior.fight();

        Character wizard = new Wizard("Anik");
        wizard.setWeapon(new StaffBehaviour());
        wizard.walk();
        wizard.fight();

        Character villain = new Villain("Villanous");
        villain.setWeapon(new DaggerBehaviour());
        villain.walk();
        villain.fight();

    }
}
