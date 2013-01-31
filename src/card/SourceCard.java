package card;

import player.Player;

/**
 *
 * @author Felix
 */
public class SourceCard extends Card implements Sourcing{

    private int energy;

    public SourceCard() {
        energy = 0;
    }

    public SourceCard(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public void source(Player p) {
        p.increaseEnergy(energy);
    }

    @Override
    public String toString() {
        return "SourceCard{" + "energy=" + energy + '}';
    }
}
