package net.headmonitor.MonitorLib;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;

import javax.annotation.Nullable;

@SuppressWarnings("unused")
public class MaterialUtilities
{

    /**
     * Converts the given Spawn Egg Material to EntityType.
     * @param spawnEgg The Material to convert.
     * @return Returns the appropriate EntityType.
     */
    @Nullable
    public static EntityType spawnEggToEntityType(Material spawnEgg)
    {
        return switch (spawnEgg)
        {
            case Material.ALLAY_SPAWN_EGG -> EntityType.ALLAY;
            case Material.ARMADILLO_SPAWN_EGG -> EntityType.ARMADILLO;
            case Material.AXOLOTL_SPAWN_EGG -> EntityType.AXOLOTL;
            case Material.BAT_SPAWN_EGG -> EntityType.BAT;
            case Material.BEE_SPAWN_EGG -> EntityType.BEE;
            case Material.BLAZE_SPAWN_EGG -> EntityType.BLAZE;
            case Material.BOGGED_SPAWN_EGG -> EntityType.BOGGED;
            case Material.BREEZE_SPAWN_EGG -> EntityType.BREEZE;
            case Material.CAMEL_SPAWN_EGG -> EntityType.CAMEL;
            case Material.CAT_SPAWN_EGG -> EntityType.CAT;
            case Material.CAVE_SPIDER_SPAWN_EGG -> EntityType.CAVE_SPIDER;
            case Material.CHICKEN_SPAWN_EGG -> EntityType.CHICKEN;
            case Material.COD_SPAWN_EGG -> EntityType.COD;
            case Material.COW_SPAWN_EGG -> EntityType.COW;
            case Material.CREAKING_SPAWN_EGG -> EntityType.CREAKING;
            case Material.CREEPER_SPAWN_EGG -> EntityType.CREEPER;
            case Material.DOLPHIN_SPAWN_EGG -> EntityType.DOLPHIN;
            case Material.DONKEY_SPAWN_EGG -> EntityType.DONKEY;
            case Material.DROWNED_SPAWN_EGG -> EntityType.DROWNED;
            case Material.ELDER_GUARDIAN_SPAWN_EGG -> EntityType.ELDER_GUARDIAN;
            case Material.ENDER_DRAGON_SPAWN_EGG -> EntityType.ENDER_DRAGON;
            case Material.ENDERMAN_SPAWN_EGG -> EntityType.ENDERMAN;
            case Material.ENDERMITE_SPAWN_EGG -> EntityType.ENDERMITE;
            case Material.EVOKER_SPAWN_EGG -> EntityType.EVOKER;
            case Material.FOX_SPAWN_EGG -> EntityType.FOX;
            case Material.FROG_SPAWN_EGG -> EntityType.FROG;
            case Material.GHAST_SPAWN_EGG -> EntityType.GHAST;
            case Material.GLOW_SQUID_SPAWN_EGG -> EntityType.GLOW_SQUID;
            case Material.GOAT_SPAWN_EGG -> EntityType.GOAT;
            case Material.GUARDIAN_SPAWN_EGG -> EntityType.GUARDIAN;
            case Material.HOGLIN_SPAWN_EGG -> EntityType.HOGLIN;
            case Material.HORSE_SPAWN_EGG -> EntityType.HORSE;
            case Material.HUSK_SPAWN_EGG -> EntityType.HUSK;
            case Material.IRON_GOLEM_SPAWN_EGG -> EntityType.IRON_GOLEM;
            case Material.LLAMA_SPAWN_EGG -> EntityType.LLAMA;
            case Material.MAGMA_CUBE_SPAWN_EGG -> EntityType.MAGMA_CUBE;
            case Material.MOOSHROOM_SPAWN_EGG -> EntityType.MOOSHROOM;
            case Material.MULE_SPAWN_EGG -> EntityType.MULE;
            case Material.OCELOT_SPAWN_EGG -> EntityType.OCELOT;
            case Material.PANDA_SPAWN_EGG -> EntityType.PANDA;
            case Material.PARROT_SPAWN_EGG -> EntityType.PARROT;
            case Material.PHANTOM_SPAWN_EGG -> EntityType.PHANTOM;
            case Material.PIG_SPAWN_EGG -> EntityType.PIG;
            case Material.PIGLIN_BRUTE_SPAWN_EGG -> EntityType.PIGLIN_BRUTE;
            case Material.PIGLIN_SPAWN_EGG -> EntityType.PIGLIN;
            case Material.PILLAGER_SPAWN_EGG -> EntityType.PILLAGER;
            case Material.POLAR_BEAR_SPAWN_EGG -> EntityType.POLAR_BEAR;
            case Material.PUFFERFISH_SPAWN_EGG -> EntityType.PUFFERFISH;
            case Material.RABBIT_SPAWN_EGG -> EntityType.RABBIT;
            case Material.RAVAGER_SPAWN_EGG -> EntityType.RAVAGER;
            case Material.SALMON_SPAWN_EGG -> EntityType.SALMON;
            case Material.SHEEP_SPAWN_EGG -> EntityType.SHEEP;
            case Material.SHULKER_SPAWN_EGG -> EntityType.SHULKER;
            case Material.SILVERFISH_SPAWN_EGG -> EntityType.SILVERFISH;
            case Material.SKELETON_HORSE_SPAWN_EGG -> EntityType.SKELETON_HORSE;
            case Material.SKELETON_SPAWN_EGG -> EntityType.SKELETON;
            case Material.SLIME_SPAWN_EGG -> EntityType.SLIME;
            case Material.SNIFFER_SPAWN_EGG -> EntityType.SNIFFER;
            case Material.SNOW_GOLEM_SPAWN_EGG -> EntityType.SNOW_GOLEM;
            case Material.SPIDER_SPAWN_EGG -> EntityType.SPIDER;
            case Material.SQUID_SPAWN_EGG -> EntityType.SQUID;
            case Material.STRAY_SPAWN_EGG -> EntityType.STRAY;
            case Material.STRIDER_SPAWN_EGG -> EntityType.STRIDER;
            case Material.TADPOLE_SPAWN_EGG -> EntityType.TADPOLE;
            case Material.TRADER_LLAMA_SPAWN_EGG -> EntityType.TRADER_LLAMA;
            case Material.TROPICAL_FISH_SPAWN_EGG -> EntityType.TROPICAL_FISH;
            case Material.TURTLE_SPAWN_EGG -> EntityType.TURTLE;
            case Material.VEX_SPAWN_EGG -> EntityType.VEX;
            case Material.VILLAGER_SPAWN_EGG -> EntityType.VILLAGER;
            case Material.VINDICATOR_SPAWN_EGG -> EntityType.VINDICATOR;
            case Material.WANDERING_TRADER_SPAWN_EGG -> EntityType.WANDERING_TRADER;
            case Material.WARDEN_SPAWN_EGG -> EntityType.WARDEN;
            case Material.WITCH_SPAWN_EGG -> EntityType.WITCH;
            case Material.WITHER_SKELETON_SPAWN_EGG -> EntityType.WITHER_SKELETON;
            case Material.WITHER_SPAWN_EGG -> EntityType.WITHER;
            case Material.WOLF_SPAWN_EGG -> EntityType.WOLF;
            case Material.ZOGLIN_SPAWN_EGG -> EntityType.ZOGLIN;
            case Material.ZOMBIE_HORSE_SPAWN_EGG -> EntityType.ZOMBIE_HORSE;
            case Material.ZOMBIE_SPAWN_EGG -> EntityType.ZOMBIE;
            case Material.ZOMBIE_VILLAGER_SPAWN_EGG -> EntityType.ZOMBIE_VILLAGER;
            case Material.ZOMBIFIED_PIGLIN_SPAWN_EGG -> EntityType.ZOMBIFIED_PIGLIN;
            default -> null;
        };
    }

    /**
     * Converts the given EntityType to Spawn Egg Material.
     * @param entityType The EntityType to convert.
     * @return Returns the appropriate Spawn Egg Material.
     */
    @Nullable
    public static Material entityTypeToSpawnEgg(EntityType entityType)
    {
        return switch (entityType)
        {
            case ALLAY -> Material.ALLAY_SPAWN_EGG;
            case ARMADILLO -> Material.ARMADILLO_SPAWN_EGG;
            case AXOLOTL -> Material.AXOLOTL_SPAWN_EGG;
            case BAT -> Material.BAT_SPAWN_EGG;
            case BEE -> Material.BEE_SPAWN_EGG;
            case BLAZE -> Material.BLAZE_SPAWN_EGG;
            case BOGGED -> Material.BOGGED_SPAWN_EGG;
            case BREEZE -> Material.BREEZE_SPAWN_EGG;
            case CAMEL -> Material.CAMEL_SPAWN_EGG;
            case CAT -> Material.CAT_SPAWN_EGG;
            case CAVE_SPIDER -> Material.CAVE_SPIDER_SPAWN_EGG;
            case CHICKEN -> Material.CHICKEN_SPAWN_EGG;
            case COD -> Material.COD_SPAWN_EGG;
            case COW -> Material.COW_SPAWN_EGG;
            case CREAKING -> Material.CREAKING_SPAWN_EGG;
            case CREEPER -> Material.CREEPER_SPAWN_EGG;
            case DOLPHIN -> Material.DOLPHIN_SPAWN_EGG;
            case DONKEY -> Material.DONKEY_SPAWN_EGG;
            case DROWNED -> Material.DROWNED_SPAWN_EGG;
            case ELDER_GUARDIAN -> Material.ELDER_GUARDIAN_SPAWN_EGG;
            case ENDER_DRAGON -> Material.ENDER_DRAGON_SPAWN_EGG;
            case ENDERMAN -> Material.ENDERMAN_SPAWN_EGG;
            case ENDERMITE -> Material.ENDERMITE_SPAWN_EGG;
            case EVOKER -> Material.EVOKER_SPAWN_EGG;
            case FOX -> Material.FOX_SPAWN_EGG;
            case FROG -> Material.FROG_SPAWN_EGG;
            case GHAST -> Material.GHAST_SPAWN_EGG;
            case GLOW_SQUID -> Material.GLOW_SQUID_SPAWN_EGG;
            case GOAT -> Material.GOAT_SPAWN_EGG;
            case GUARDIAN -> Material.GUARDIAN_SPAWN_EGG;
            case HOGLIN -> Material.HOGLIN_SPAWN_EGG;
            case HORSE -> Material.HORSE_SPAWN_EGG;
            case HUSK -> Material.HUSK_SPAWN_EGG;
            case IRON_GOLEM -> Material.IRON_GOLEM_SPAWN_EGG;
            case LLAMA -> Material.LLAMA_SPAWN_EGG;
            case MAGMA_CUBE -> Material.MAGMA_CUBE_SPAWN_EGG;
            case MOOSHROOM -> Material.MOOSHROOM_SPAWN_EGG;
            case MULE -> Material.MULE_SPAWN_EGG;
            case OCELOT -> Material.OCELOT_SPAWN_EGG;
            case PANDA -> Material.PANDA_SPAWN_EGG;
            case PARROT -> Material.PARROT_SPAWN_EGG;
            case PHANTOM -> Material.PHANTOM_SPAWN_EGG;
            case PIG -> Material.PIG_SPAWN_EGG;
            case PIGLIN -> Material.PIGLIN_SPAWN_EGG;
            case PIGLIN_BRUTE -> Material.PIGLIN_BRUTE_SPAWN_EGG;
            case PILLAGER -> Material.PILLAGER_SPAWN_EGG;
            case POLAR_BEAR -> Material.POLAR_BEAR_SPAWN_EGG;
            case PUFFERFISH -> Material.PUFFERFISH_SPAWN_EGG;
            case RABBIT -> Material.RABBIT_SPAWN_EGG;
            case RAVAGER -> Material.RAVAGER_SPAWN_EGG;
            case SALMON -> Material.SALMON_SPAWN_EGG;
            case SHEEP -> Material.SHEEP_SPAWN_EGG;
            case SHULKER -> Material.SHULKER_SPAWN_EGG;
            case SILVERFISH -> Material.SILVERFISH_SPAWN_EGG;
            case SKELETON -> Material.SKELETON_SPAWN_EGG;
            case SKELETON_HORSE -> Material.SKELETON_HORSE_SPAWN_EGG;
            case SLIME -> Material.SLIME_SPAWN_EGG;
            case SNIFFER -> Material.SNIFFER_SPAWN_EGG;
            case SNOW_GOLEM -> Material.SNOW_GOLEM_SPAWN_EGG;
            case SPIDER -> Material.SPIDER_SPAWN_EGG;
            case SQUID -> Material.SQUID_SPAWN_EGG;
            case STRAY -> Material.STRAY_SPAWN_EGG;
            case STRIDER -> Material.STRIDER_SPAWN_EGG;
            case TADPOLE -> Material.TADPOLE_SPAWN_EGG;
            case TRADER_LLAMA -> Material.TRADER_LLAMA_SPAWN_EGG;
            case TROPICAL_FISH -> Material.TROPICAL_FISH_SPAWN_EGG;
            case TURTLE -> Material.TURTLE_SPAWN_EGG;
            case VEX -> Material.VEX_SPAWN_EGG;
            case VILLAGER -> Material.VILLAGER_SPAWN_EGG;
            case VINDICATOR -> Material.VINDICATOR_SPAWN_EGG;
            case WANDERING_TRADER -> Material.WANDERING_TRADER_SPAWN_EGG;
            case WARDEN -> Material.WARDEN_SPAWN_EGG;
            case WITCH -> Material.WITCH_SPAWN_EGG;
            case WITHER -> Material.WITHER_SPAWN_EGG;
            case WITHER_SKELETON -> Material.WITHER_SKELETON_SPAWN_EGG;
            case WOLF -> Material.WOLF_SPAWN_EGG;
            case ZOGLIN -> Material.ZOGLIN_SPAWN_EGG;
            case ZOMBIE -> Material.ZOMBIE_SPAWN_EGG;
            case ZOMBIE_HORSE -> Material.ZOMBIE_HORSE_SPAWN_EGG;
            case ZOMBIE_VILLAGER -> Material.ZOMBIE_VILLAGER_SPAWN_EGG;
            case ZOMBIFIED_PIGLIN -> Material.ZOMBIFIED_PIGLIN_SPAWN_EGG;
            default -> null;
        };
    }

    /**
     * Converts the given Material to TrimPattern if available.
     * @param material The Material to convert.
     * @return Returns the appropriate TrimPattern.
     */
    @Nullable
    public static TrimPattern trimTemplateToTrimPattern(Material material)
    {
        return switch (material)
        {
            case Material.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.BOLT;
            case Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.COAST;
            case Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.DUNE;
            case Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.EYE;
            case Material.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.FLOW;
            case Material.HOST_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.HOST;
            case Material.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.RAISER;
            case Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.RIB;
            case Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.SENTRY;
            case Material.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.SHAPER;
            case Material.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.SILENCE;
            case Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.SNOUT;
            case Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.TIDE;
            case Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.VEX;
            case Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.WARD;
            case Material.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.WAYFINDER;
            case Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE -> TrimPattern.WILD;
            default -> null;
        };
    }

    /**
     * Converts the given Material to TrimMaterial if available.
     * @param material The Material to convert.
     * @return Returns the appropriate TrimMaterial.
     */
    @Nullable
    public static TrimMaterial materialToTrimMaterial(Material material)
    {
        return switch (material)
        {
            case Material.IRON_INGOT -> TrimMaterial.IRON;
            case Material.COPPER_INGOT -> TrimMaterial.COPPER;
            case Material.GOLD_INGOT -> TrimMaterial.GOLD;
            case Material.LAPIS_LAZULI -> TrimMaterial.LAPIS;
            case Material.EMERALD -> TrimMaterial.EMERALD;
            case Material.DIAMOND -> TrimMaterial.DIAMOND;
            case Material.NETHERITE_INGOT -> TrimMaterial.NETHERITE;
            case Material.REDSTONE -> TrimMaterial.REDSTONE;
            case Material.AMETHYST_SHARD -> TrimMaterial.AMETHYST;
            case Material.QUARTZ -> TrimMaterial.QUARTZ;
            case Material.RESIN_BRICK -> TrimMaterial.RESIN;
            default -> null;
        };
    }

}
