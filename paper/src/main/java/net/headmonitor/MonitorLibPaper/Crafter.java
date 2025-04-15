package net.headmonitor.MonitorLibPaper;

import net.headmonitor.MonitorLibPaper.Builders.EntityBuilder;
import net.headmonitor.MonitorLibPaper.Builders.ItemBuilder;
import net.headmonitor.MonitorLibPaper.Builders.SkullBuilder;

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
