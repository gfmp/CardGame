package player;

/**
 *
 * @author Felix
 */
public class Player {

    private String name;
    private PlayerData data;

    public Player() {
        data = new PlayerData();
    }

    public Player(String name) {
        this();
        this.name = name;
        increaseLife(0);
    }

    public Player(String name, int life) {
        this();
        this.name = name;
        increaseLife(life);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseLife(int life) {
        data.setLife(data.getLife() + life);
    }

    public void descreaseLife(int life) {
        data.setLife(data.getLife() - life);
    }

    public void increaseEnergy(int energy) {
        data.setEnergy(data.getEnergy() + energy);
    }

    public void descreaseEnergy(int energy) {
        data.setEnergy(data.getEnergy() - energy);
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", data=" + data + '}';
    }
}
