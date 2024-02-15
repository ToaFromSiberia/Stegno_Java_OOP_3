package lesson003.ts003.game;

public enum GameStatus
{
    INIT, START, END("Вы проиграли"), WIN("Вы выиграли");

    private String description;

    GameStatus(String description) {
        this.description = description;
    }

    GameStatus()
    {
    }

    public String getDescription() {
        return description;
    }
}
