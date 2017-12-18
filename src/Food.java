public class Food {

    private Snake Snake = new Snake();
    private int foodX; // Stores X pos of our food
    private int foodY; // Stores Y pos of our food

    // Used to determine random position of food
    private final int RANDOMPOSITION = 40;

    public void createFood() {

        // Set our food's x & y position to a random position

        int location = (int) (Math.random() * RANDOMPOSITION);
        foodX = ((location * Board.getDotSize()));

        location = (int) (Math.random() * RANDOMPOSITION);
        foodY = ((location * Board.getDotSize()));

        if ((foodX == Snake.getSnakeX(0)) && (foodY == Snake.getSnakeY(0))) {
            createFood();
        }
    }

    public int getFoodX() {

        return foodX;
    }

    public int getFoodY() {
        return foodY;
    }
}