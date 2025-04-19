package net.headmonitor.MonitorLibPaper.utilities;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class EnchantmentUtilities
{

    /**
     * Converts a String to it's corresponding Enchantment.
     * @param enchantment The String to convert.
     * @return Returns the appropriate Enchantment.
     */
    @Nullable
    public static Enchantment enchantmentNameToEnchantment(String enchantment)
    {
        return switch (enchantment)
        {
            case "Aqua Affinity" -> Enchantment.AQUA_AFFINITY;
            case "Breach" -> Enchantment.BREACH;
            case "Bane of Arthropods" -> Enchantment.BANE_OF_ARTHROPODS;
            case "Binding Curse", "Curse of Binding" -> Enchantment.BINDING_CURSE;
            case "Blast Protection" -> Enchantment.BLAST_PROTECTION;
            case "Channeling" -> Enchantment.CHANNELING;
            case "Density" -> Enchantment.DENSITY;
            case "Depth Strider" -> Enchantment.DEPTH_STRIDER;
            case "Efficiency" -> Enchantment.EFFICIENCY;
            case "Feather Falling" -> Enchantment.FEATHER_FALLING;
            case "Fire Aspect" -> Enchantment.FIRE_ASPECT;
            case "Fire Protection" -> Enchantment.FIRE_PROTECTION;
            case "Flame" -> Enchantment.FLAME;
            case "Fortune" -> Enchantment.FORTUNE;
            case "Frost Walker" -> Enchantment.FROST_WALKER;
            case "Impaling" -> Enchantment.IMPALING;
            case "Infinity" -> Enchantment.INFINITY;
            case "Knockback" -> Enchantment.KNOCKBACK;
            case "Looting" -> Enchantment.LOOTING;
            case "Loyalty" -> Enchantment.LOYALTY;
            case "Luck of the Sea" -> Enchantment.LUCK_OF_THE_SEA;
            case "Lure" -> Enchantment.LURE;
            case "Mending" -> Enchantment.MENDING;
            case "Multishot" -> Enchantment.MULTISHOT;
            case "Piercing" -> Enchantment.PIERCING;
            case "Power" -> Enchantment.POWER;
            case "Projectile Protection" -> Enchantment.PROJECTILE_PROTECTION;
            case "Protection" -> Enchantment.PROTECTION;
            case "Punch" -> Enchantment.PUNCH;
            case "Quick Charge" -> Enchantment.QUICK_CHARGE;
            case "Respiration" -> Enchantment.RESPIRATION;
            case "Riptide" -> Enchantment.RIPTIDE;
            case "Sharpness" -> Enchantment.SHARPNESS;
            case "Silk Touch" -> Enchantment.SILK_TOUCH;
            case "Smite" -> Enchantment.SMITE;
            case "Soul Speed" -> Enchantment.SOUL_SPEED;
            case "Sweeping Edge" -> Enchantment.SWEEPING_EDGE;
            case "Swift Sneak" -> Enchantment.SWIFT_SNEAK;
            case "Thorns" -> Enchantment.THORNS;
            case "Unbreaking" -> Enchantment.UNBREAKING;
            case "Vanishing Curse", "Curse of Vanishing" -> Enchantment.VANISHING_CURSE;
            case "Wind Burst" -> Enchantment.WIND_BURST;
            default -> null;
        };
    }

    /**
     * Returns a List of Enchantments that can be applied on a specific Material.
     * @param material The Material to List Enchantments.
     * @return Returns the List of Enchantments.
     */
    @Nullable
    public static List<Enchantment> materialEnchantments(Material material)
    {
        List<Enchantment> enchantments = new ArrayList<>();

        switch (material)
        {
            // Armor
            case Material.TURTLE_HELMET, Material.LEATHER_HELMET, Material.CHAINMAIL_HELMET, Material.IRON_HELMET, Material.DIAMOND_HELMET, Material.GOLDEN_HELMET, Material.NETHERITE_HELMET,
                 Material.ELYTRA, Material.LEATHER_CHESTPLATE, Material.CHAINMAIL_CHESTPLATE, Material.IRON_CHESTPLATE, Material.DIAMOND_CHESTPLATE, Material.GOLDEN_CHESTPLATE, Material.NETHERITE_CHESTPLATE,
                 Material.LEATHER_LEGGINGS, Material.CHAINMAIL_LEGGINGS, Material.IRON_LEGGINGS, Material.DIAMOND_LEGGINGS, Material.GOLDEN_LEGGINGS, Material.NETHERITE_LEGGINGS,
                 Material.LEATHER_BOOTS, Material.CHAINMAIL_BOOTS, Material.IRON_BOOTS, Material.DIAMOND_BOOTS, Material.GOLDEN_BOOTS, Material.NETHERITE_BOOTS,
                 Material.LEATHER_HORSE_ARMOR, Material.IRON_HORSE_ARMOR, Material.DIAMOND_HORSE_ARMOR, Material.GOLDEN_HORSE_ARMOR, Material.WOLF_ARMOR ->
            {
                enchantments.add(Enchantment.AQUA_AFFINITY);
                enchantments.add(Enchantment.BLAST_PROTECTION);
                enchantments.add(Enchantment.BINDING_CURSE);
                enchantments.add(Enchantment.VANISHING_CURSE);
                enchantments.add(Enchantment.DEPTH_STRIDER);
                enchantments.add(Enchantment.FEATHER_FALLING);
                enchantments.add(Enchantment.FIRE_PROTECTION);
                enchantments.add(Enchantment.FROST_WALKER);
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.PROJECTILE_PROTECTION);
                enchantments.add(Enchantment.PROTECTION);
                enchantments.add(Enchantment.RESPIRATION);
                enchantments.add(Enchantment.THORNS);
                enchantments.add(Enchantment.UNBREAKING);
                return enchantments;
            }

            // Weapons
            case Material.WOODEN_SWORD, Material.IRON_SWORD, Material.DIAMOND_SWORD, Material.GOLDEN_SWORD, Material.NETHERITE_SWORD ->
            {
                enchantments.add(Enchantment.BANE_OF_ARTHROPODS);
                enchantments.add(Enchantment.VANISHING_CURSE);
                enchantments.add(Enchantment.FIRE_ASPECT);
                enchantments.add(Enchantment.KNOCKBACK);
                enchantments.add(Enchantment.LOOTING);
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.SHARPNESS);
                enchantments.add(Enchantment.SMITE);
                enchantments.add(Enchantment.SWEEPING_EDGE);
                enchantments.add(Enchantment.UNBREAKING);
                return enchantments;
            }

            // Tools
            case Material.WOODEN_PICKAXE, Material.IRON_PICKAXE, Material.DIAMOND_PICKAXE, Material.GOLDEN_PICKAXE, Material.NETHERITE_PICKAXE,
                 Material.WOODEN_SHOVEL, Material.IRON_SHOVEL, Material.DIAMOND_SHOVEL, Material.GOLDEN_SHOVEL, Material.NETHERITE_SHOVEL,
                 Material.WOODEN_HOE, Material.IRON_HOE, Material.DIAMOND_HOE, Material.GOLDEN_HOE, Material.NETHERITE_HOE ->
            {
                enchantments.add(Enchantment.VANISHING_CURSE);
                enchantments.add(Enchantment.EFFICIENCY);
                enchantments.add(Enchantment.SILK_TOUCH);
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.UNBREAKING);
                return enchantments;
            }

            // Axe
            case Material.WOODEN_AXE, Material.IRON_AXE, Material.DIAMOND_AXE, Material.GOLDEN_AXE, Material.NETHERITE_AXE ->
            {
                enchantments.add(Enchantment.BANE_OF_ARTHROPODS);
                enchantments.add(Enchantment.FIRE_ASPECT);
                enchantments.add(Enchantment.KNOCKBACK);
                enchantments.add(Enchantment.LOOTING);
                enchantments.add(Enchantment.SHARPNESS);
                enchantments.add(Enchantment.SMITE);
                enchantments.add(Enchantment.SWEEPING_EDGE);
                enchantments.add(Enchantment.VANISHING_CURSE);
                enchantments.add(Enchantment.EFFICIENCY);
                enchantments.add(Enchantment.SILK_TOUCH);
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.UNBREAKING);
                return enchantments;
            }

            // Bow
            case Material.BOW ->
            {
                enchantments.add(Enchantment.VANISHING_CURSE);
                enchantments.add(Enchantment.FLAME);
                enchantments.add(Enchantment.INFINITY);
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.POWER);
                enchantments.add(Enchantment.PUNCH);
                enchantments.add(Enchantment.UNBREAKING);
                return enchantments;
            }

            // Crossbow
            case Material.CROSSBOW ->
            {
                enchantments.add(Enchantment.VANISHING_CURSE);
                enchantments.add(Enchantment.FLAME);
                enchantments.add(Enchantment.INFINITY);
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.MULTISHOT);
                enchantments.add(Enchantment.PIERCING);
                enchantments.add(Enchantment.POWER);
                enchantments.add(Enchantment.PUNCH);
                enchantments.add(Enchantment.QUICK_CHARGE);
                enchantments.add(Enchantment.UNBREAKING);
                return enchantments;
            }

            // Trident
            case Material.TRIDENT ->
            {
                enchantments.add(Enchantment.CHANNELING);
                enchantments.add(Enchantment.IMPALING);
                enchantments.add(Enchantment.LOYALTY);
                enchantments.add(Enchantment.RIPTIDE);
                enchantments.add(Enchantment.VANISHING_CURSE);
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.UNBREAKING);
                return enchantments;
            }

            // Mace
            case Material.MACE ->
            {
                enchantments.add(Enchantment.BANE_OF_ARTHROPODS);
                enchantments.add(Enchantment.BREACH);
                enchantments.add(Enchantment.VANISHING_CURSE);
                enchantments.add(Enchantment.DENSITY);
                enchantments.add(Enchantment.FIRE_ASPECT);
                enchantments.add(Enchantment.KNOCKBACK);
                enchantments.add(Enchantment.LOOTING);
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.SHARPNESS);
                enchantments.add(Enchantment.SMITE);
                enchantments.add(Enchantment.SWEEPING_EDGE);
                enchantments.add(Enchantment.UNBREAKING);
                enchantments.add(Enchantment.WIND_BURST);
                return enchantments;
            }

            // Fishing Rod
            case Material.FISHING_ROD ->
            {
                enchantments.add(Enchantment.VANISHING_CURSE);
                enchantments.add(Enchantment.LUCK_OF_THE_SEA);
                enchantments.add(Enchantment.LURE);
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.UNBREAKING);
                return enchantments;
            }

            // Other
            case Material.SHEARS, Material.FLINT_AND_STEEL, Material.SHIELD ->
            {
                enchantments.add(Enchantment.MENDING);
                enchantments.add(Enchantment.UNBREAKING);
                return enchantments;
            }

            default ->
            {
                return null;
            }
        }
    }

    /**
     * Converts Roman Numerals from 1 to 10 to their corresponding Integer.
     * @param romanNumeral The String of Roman Numerals.
     * @return Returns the converted Integer.
     */
    public static int romanNumeralsToInt(String romanNumeral)
    {
        return switch (romanNumeral)
        {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> -1;
        };
    }

}
