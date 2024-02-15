package lesson003.ts003.game;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger
{
    private File logfile;
    public Logger()
    {
        logfile = new File("game.log");
    }
    public void writeLog(String message)
    {
        try
        {
            PrintWriter writer = new PrintWriter(new FileWriter(logfile, true));
            writer.println((message));
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка записи.");
        }
    }
}
