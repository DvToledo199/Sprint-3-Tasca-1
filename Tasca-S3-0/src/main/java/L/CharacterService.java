package L;

public class CharacterService {

    public void attackCharacter(Attackable attacker, Character target) {


        attacker.attack();


        if (target instanceof Damageable) {

            ((Damageable) target).takeDamage(10);

        } else {

            System.out.println("The target cannot be damaged.");

        }

    }
}
