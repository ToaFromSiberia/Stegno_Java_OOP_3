package lesson003.ts003.game;

import java.util.ArrayList;
import java.util.List;

public class EngGame extends  AbstractGame
{

    @Override
    public List<String> generateCharList()
    {
        List<String> result = new ArrayList<>();

        for (int i = 'a'; i <= 'z' ; i++)
        {
            if (!result.contains(String.valueOf(i)))
            {
                result.add(String.valueOf((char) i));
            }
        }
        return result;
    }
}
