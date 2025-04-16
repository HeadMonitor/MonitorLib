package net.headmonitor.MonitorLibPaper.Builders;

import net.headmonitor.MonitorLibPaper.Utilities.ComponentUtilities;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

@SuppressWarnings("unused")
public class ItemBuilder
{

    protected Material material;
    protected Component name;
    protected List<Component> lore;
    protected Map<Enchantment, Integer> enchantments = new HashMap<>();
    protected final List<ItemFlag> itemFlags = new ArrayList<>();

    /**
     * Set the Material of the ItemStack.
     * @param material The Material to set.
     */
    public ItemBuilder material(Material material)
    {
        this.material = material;
        return this;
    }

    ///////////////////////////////////////////////////////////////////////////

    /**
     * Set the Name of the ItemStack from a Component Text.
     * @param name The Name Component.
     */
    public ItemBuilder name(Component name)
    {
        this.name = name;
        return this;
    }

    /**
     * Set the Name of the ItemStack from a String.
     * The String will be converted to a Component with White Color and no Italics.
     * @param name The Name String.
     */
    public ItemBuilder name(String name)
    {
        this.name = ComponentUtilities.deserialize(name);
        return this;
    }

    ///////////////////////////////////////////////////////////////////////////

    /**
     * Set the Lore of the ItemStack from a Component Text List.
     * @param lore The Lore Component List.
     * */
    public ItemBuilder lore(List<Component> lore)
    {
        this.lore = lore;
        return this;
    }

    /**
     * Set the Lore of the ItemStack from a String Collection.
     * @param lore The Lore String Collection.
     * */
    public ItemBuilder lore(Collection<String> lore)
    {
        for (String line : lore)
            this.lore.add(ComponentUtilities.deserialize(line));

        return this;
    }

    ///////////////////////////////////////////////////////////////////////////

    /**
     * Set Enchantments to the ItemStack from a Map.
     * @param enchantments The Enchantments Map.
     */
    public ItemBuilder setEnchantments(Map<Enchantment, Integer> enchantments)
    {
        this.enchantments = enchantments;
        return this;
    }

    /**
     * Add an Enchantment to the ItemStack.
     * @param enchantment The Enchantment to add.
     * @param level The Enchantment Level to add.
     */
    public ItemBuilder addEnchantment(Enchantment enchantment, int level)
    {
        this.enchantments.put(enchantment, level);
        return this;
    }

    /**
     * Add an Enchantment to the ItemStack. Level will be set to 1.
     * @param enchantment The Enchantment to add.
     */
    public ItemBuilder addEnchantment(Enchantment enchantment)
    {
        this.enchantments.put(enchantment, 1);
        return this;
    }

    ///////////////////////////////////////////////////////////////////////////

    public ItemBuilder addItemFlags(ItemFlag... itemFlag)
    {
        this.itemFlags.addAll(Arrays.asList(itemFlag));
        return this;
    }

    public ItemBuilder addItemFlag(ItemFlag itemFlag)
    {
        this.itemFlags.add(itemFlag);
        return this;
    }

    ///////////////////////////////////////////////////////////////////////////

    public ItemStack create()
    {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(name);
        itemMeta.lore(lore);

        // Enchantments
        if (enchantments != null)
        {
            for (Map.Entry<Enchantment, Integer> enchantment : enchantments.entrySet())
                itemStack.addUnsafeEnchantment(enchantment.getKey(), enchantment.getValue());
        }

        // Item Flags
        if (!itemFlags.isEmpty())
        {
            for (ItemFlag flag : itemFlags)
                itemMeta.addItemFlags(flag);
        }

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

}
