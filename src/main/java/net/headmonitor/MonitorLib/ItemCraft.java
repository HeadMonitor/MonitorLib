package net.headmonitor.ItemCraft;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public final class ItemCraft
{

    private Material material;
    private Component name;
    private List<Component> lore;

    public static ItemCraft item()
    {
        return new ItemCraft();
    }

    public ItemCraft material(Material material)
    {
        this.material = material;
        return this;
    }

    public ItemCraft name(Component name)
    {
        this.name = name;
        return this;
    }

    public ItemCraft lore(List<Component> lore)
    {
        this.lore = lore;
        return this;
    }

    public void create()
    {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(name);
        itemMeta.lore(lore);

        itemStack.setItemMeta(itemMeta);
    }

}
