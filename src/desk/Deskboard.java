package desk;

import card.AttackCard;
import card.Attacking;
import card.SourceCard;
import card.Sourcing;
import player.Player;

/**
 *
 * @author Felix
 */
public class Deskboard {

    public static void main(String[] args) {
        Player p1 = new Player("Felix", 100);
        Player p2 = new Player("Zajicek", 5);

        System.out.println("ZACATEK");
        System.out.println(p1);
        System.out.println(p2);

        Sourcing energyCard = new SourceCard(40);
        Attacking attackCard = new AttackCard(50);

        System.out.println("KARTY");
        System.out.println(energyCard);
        System.out.println(attackCard);

        System.out.println("PROCESY");
        energyCard.source(p1);
        System.out.println(p1);

        attackCard.attack(p2);
        System.out.println(p2);
    }
}
