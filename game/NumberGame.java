package lesson003.ts003.game;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends  AbstractGame
{
    @Override
    public List<String> generateCharList()
    {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 9 ; i++)
        {
            if (!result.contains(i))
            {
                result.add(String.valueOf((char) i));
            }
        }

        return result;
    }
}
