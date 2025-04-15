package net.headmonitor.MonitorLibPaper.Builders;

import net.headmonitor.MonitorLibPaper.Utilities.ComponentUtilities;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.potion.PotionEffect;

import java.util.List;

@SuppressWarnings("unused")
public class EntityBuilder
{

    private EntityType entityType = EntityType.ZOMBIE;
    private Component name;
    private List<PotionEffect> potionEffects;
    private boolean isBaby = false;

    /**
     * Set the Type of the Entity.
     * @param entityType The type of the Entity.
     */
    public EntityBuilder entityType(EntityType entityType)
    {
        this.entityType = entityType;
        return this;
    }

    ////////////////////////////////////////////////////////////////////////

    /**
     * Set the Name of the ItemStack from a Component Text.
     * @param name The Name Component.
     */
    public EntityBuilder name(Component name)
    {
        this.name = name;
        return this;
    }

    /**
     * Set the Name of the ItemStack from a String.
     * The String will be converted to a Component with White Color and no Italics.
     * @param name The Name String.
     */
    public EntityBuilder name(String name)
    {
        this.name = ComponentUtilities.deserialize(name);
        return this;
    }

    ////////////////////////////////////////////////////////////////////////

    /**
     * Set PotionEffects to the Entity from a List.
     * @param potionEffects The PotionEffect List.
     */
    public EntityBuilder setPotionEffects(List<PotionEffect> potionEffects)
    {
        this.potionEffects = potionEffects;
        return this;
    }

    /**
     * Add a PotionEffect to the Entity.
     * @param potionEffect The PotionEffect to add.
     */
    public EntityBuilder addPotionEffect(PotionEffect potionEffect)
    {
        this.potionEffects.add(potionEffect);
        return this;
    }

    /////////////////////////////////////////////////////////////////////

    public EntityBuilder setBaby(boolean isBaby)
    {
        this.isBaby = isBaby;
        return this;
    }

    //////////////////////////////////////////////////////////////////

    public Entity spawn(World world, Location location)
    {
        Entity entity = world.spawnEntity(location, entityType);

        // Name
        if (name != null)
        {
            entity.customName(name);
            entity.setCustomNameVisible(true);
        }

        // Potion Effects
        if (entity instanceof Mob mob)
            for (PotionEffect effect : potionEffects)
                mob.addPotionEffect(effect);

        // Set Baby If True
        if (isBaby)
            if (entity instanceof Ageable ageable)
                ageable.setBaby();

        return entity;
    }

}
