package net.headmonitor.MonitorLibPaper.Crafters;

import net.headmonitor.MonitorLibPaper.ComponentUtilities;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;

import java.util.List;

public class EntityCraft
{

    private EntityType entityType;
    private Component name;
    private List<PotionEffect> potionEffects;

    public static EntityCraft entity()
    {
        return new EntityCraft();
    }

    /**
     * Set the Type of the Entity.
     * @param entityType The type of the Entity.
     */
    public EntityCraft entityType(EntityType entityType)
    {
        this.entityType = entityType;
        return this;
    }

    ////////////////////////////////////////////////////////////////////////

    /**
     * Set the Name of the ItemStack from a Component Text.
     * @param name The Name Component.
     */
    public EntityCraft name(Component name)
    {
        this.name = name;
        return this;
    }

    /**
     * Set the Name of the ItemStack from a String.
     * The String will be converted to a Component with White Color and no Italics.
     * @param name The Name String.
     */
    public EntityCraft name(String name)
    {
        this.name = ComponentUtilities.deserialize(name);
        return this;
    }

    ////////////////////////////////////////////////////////////////////////

    /**
     * Set PotionEffects to the Entity from a List.
     * @param potionEffects The PotionEffect List.
     */
    public EntityCraft setPotionEffects(List<PotionEffect> potionEffects)
    {
        this.potionEffects = potionEffects;
        return this;
    }

    /**
     * Add a PotionEffect to the Entity.
     * @param potionEffect The PotionEffect to add.
     */
    public EntityCraft addPotionEffect(PotionEffect potionEffect)
    {
        this.potionEffects.add(potionEffect);
        return this;
    }

}
