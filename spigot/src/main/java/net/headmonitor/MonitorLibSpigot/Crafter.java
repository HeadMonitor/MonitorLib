package net.headmonitor.MonitorLibSpigot;

import net.headmonitor.MonitorLibSpigot.builders.EntityBuilder;
import net.headmonitor.MonitorLibSpigot.builders.ItemBuilder;
import net.headmonitor.MonitorLibSpigot.builders.SkullBuilder;

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
