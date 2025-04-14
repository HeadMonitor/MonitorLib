package net.headmonitor.MonitorLibSpigot;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

@SuppressWarnings("unused")
public class ReadabilityUtilities
{

    /**
     * Converts the given Material to its readable form as well as the correct Language.
     * @param material The Material to convert.
     * @return Returns a String of the given Material.
     */
    public static Component materialToReadable(Material material)
    {
        return Component.translatable(material.translationKey());
    }

    /**
     * Converts the given EntityType to its readable form as well as the correct Language.
     * @param entityType The EntityType to convert.
     * @return Returns a String of the given EntityType.
     */
    public static Component entityToReadable(EntityType entityType)
    {
        return Component.translatable("entity.minecraft." + entityType.name().toLowerCase());
    }

}
