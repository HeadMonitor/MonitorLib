package net.headmonitor.MonitorLibSpigot;

import net.headmonitor.MonitorLibSpigot.Builders.EntityBuilder;
import net.headmonitor.MonitorLibSpigot.Builders.ItemBuilder;
import net.headmonitor.MonitorLibSpigot.Builders.SkullBuilder;

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
