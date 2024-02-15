package lesson003.ts003.game;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends  AbstractGame
{

    @Override
    public List<String> generateCharList()
    {
        List<String> result = new ArrayList<>();

        for (int i = 'а'; i <= 'я' ; i++)
        {
            if (!result.contains(String.valueOf(i)))
            {
                result.add(String.valueOf((char) i));
            }
        }
        result.add("ё");
        return result;
    }
}
