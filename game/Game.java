package lesson003.ts003.game;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
