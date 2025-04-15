package net.headmonitor.MonitorLibSpigot.Builders;

import net.headmonitor.MonitorLibSpigot.Utilities.ComponentUtilities;
import net.kyori.adventure.text.Component;
import org.bukkit.OfflinePlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

        // Name
        itemMeta.setDisplayName(ComponentUtilities.legacySerialize(name));

        // Lore
        List<String> legacyLore = new ArrayList<>();
        for (Component component : lore)
            legacyLore.add(ComponentUtilities.legacySerialize(component));
        itemMeta.setLore(legacyLore);
        ;

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
