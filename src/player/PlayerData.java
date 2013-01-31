package player;

/**
 *
 * @author Felix
 */
public class PlayerData {

    private int life;
    private int energy;

    public PlayerData() {
        life = 0;
        energy = 0;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "PlayerData{" + "life=" + life + ", energy=" + energy + '}';
    }
}
