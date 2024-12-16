package V3;

public abstract class Character {
    private String characterName;
    private IWeaponBehaviour weaponBehaviour;

    public Character(String characterName) {
        this.characterName = characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setWeapon(IWeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }

    public void walk() {
        System.out.println(characterName + " walks.");
    }

    public void fight(){
        if (weaponBehaviour != null) {
            weaponBehaviour.useWeapon();
        } else {
            System.out.println(characterName + " has no weapon.");
        }
    }
}
