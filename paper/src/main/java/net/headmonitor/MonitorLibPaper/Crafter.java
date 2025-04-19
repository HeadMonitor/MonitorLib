package net.headmonitor.MonitorLibPaper;

import net.headmonitor.MonitorLibPaper.builders.EntityBuilder;
import net.headmonitor.MonitorLibPaper.builders.ItemBuilder;
import net.headmonitor.MonitorLibPaper.builders.SkullBuilder;

@SuppressWarnings("unused")
public class Crafter
{

    public static ItemBuilder item()
    {
        return new ItemBuilder();
    }

    public static SkullBuilder skull()
    {
        return new SkullBuilder();
    }

    public static EntityBuilder entity()
    {
        return new EntityBuilder();
    }

}
