package fantasy.domain;

public class Player {
    private int id;
    private String name;
    private Position position;
    private double price;
    private String realTeam;

    public Player(int id, String name, Position position, double price, String realTeam) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.price = price;
        this.realTeam = realTeam;
    }

    public Position getPosition() {
        return position;
    }

    public double getPrice() {
        return price;
    }
}
