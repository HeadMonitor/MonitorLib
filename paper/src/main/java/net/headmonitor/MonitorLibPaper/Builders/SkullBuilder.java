package net.headmonitor.MonitorLibPaper.Builders;

import org.bukkit.OfflinePlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Map;

@SuppressWarnings("unused")
public class SkullBuilder extends ItemBuilder
{

    private OfflinePlayer owner;

    public SkullBuilder owner(OfflinePlayer owner)
    {
        this.owner = owner;
        return this;
    }

    @Override
    public ItemStack create()
    {
        ItemStack itemStack = new ItemStack(material);
        SkullMeta itemMeta = (SkullMeta) itemStack.getItemMeta();

        itemMeta.displayName(name);
        itemMeta.lore(lore);

        // Owner
        itemMeta.setOwningPlayer(owner);

        // Enchantments
        for (Map.Entry<Enchantment, Integer> enchantment : enchantments.entrySet())
            itemStack.addUnsafeEnchantment(enchantment.getKey(), enchantment.getValue());

        // Item Flags
        for (ItemFlag flag : itemFlags)
            itemMeta.addItemFlags(flag);

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

}
