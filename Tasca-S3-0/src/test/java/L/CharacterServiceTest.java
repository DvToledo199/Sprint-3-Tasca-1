package L;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterServiceTest {

    @Test
    void shouldDamageTargetWhenTargetIsDamageable() {

        CharacterService service = new CharacterService();

        Attackable attacker = () -> System.out.println("Attack");

        Damageable target = new Damageable() {
            boolean damaged = false;

            @Override
            public void takeDamage(int damage) {
                damaged = true;
            }
        };

        service.attackCharacter(attacker, (Character) target);

        assertDoesNotThrow(() -> service.attackCharacter(attacker, (Character) target));
    }

    @Test
    void shouldNotFailWhenTargetIsNotDamageable() {

        CharacterService service = new CharacterService();

        Attackable attacker = () -> System.out.println("Attack");

        Character ghost = new Ghost();

        assertDoesNotThrow(() -> service.attackCharacter(attacker, ghost));
    }
}