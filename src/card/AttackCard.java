package card;

import player.Player;

/**
 *
 * @author Felix
 */
public class AttackCard extends Card implements Attacking {

    private int attack;

    public AttackCard() {
        attack = 0;
    }

    public AttackCard(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void attack(Player p) {
        p.descreaseLife(attack);
    }

    @Override
    public String toString() {
        return "AttackCard{" + "attack=" + attack + '}';
    }
}
