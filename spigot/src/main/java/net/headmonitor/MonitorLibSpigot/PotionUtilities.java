package net.headmonitor.MonitorLibSpigot;

import net.kyori.adventure.text.Component;
import org.bukkit.Color;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nullable;

@SuppressWarnings("unused")
public class PotionUtilities
{

    /**
     * Converts the given Potion Effect to its readable form as well as the correct Language.
     * @param effect The Potion Effect to convert.
     * @return Returns a String of the given Material.
     */
    public static Component potionEffectToReadable(PotionEffectType effect)
    {
        return Component.translatable("effect.minecraft." + effect.getKeyOrThrow().getKey());
    }

    /**
     * Returns the default color of a Potion based on the PotionEffectType provided.
     * @param potionEffectType The Effect Type of the Potion.
     * @return Returns the default Potion Color.
     */
    public static Color potionDefaultColors(PotionEffectType potionEffectType)
    {
        return switch (potionEffectType.getKeyOrThrow().getKey())
        {
            case "fire_resistance" -> Color.fromRGB(255, 153, 0);
            case "water_breathing" -> Color.fromRGB(152, 218, 192);
            case "jump_boost" -> Color.fromRGB(253, 247, 132);
            case "saturation", "instant_health" -> Color.fromRGB(248, 36, 35);
            case "health_boost" -> Color.fromRGB(248, 125, 35);
            case "night_vision" -> Color.fromRGB(194, 255, 102);
            case "weakness" -> Color.fromRGB(72, 77, 72);
            case "wind_charged" -> Color.fromRGB(189, 201, 255);
            case "wither" -> Color.fromRGB(115, 97, 86);
            case "mining_fatigue" -> Color.fromRGB(74, 66, 23);
            case "slowed_falling" -> Color.fromRGB(243, 207, 185);
            case "raid_omen" -> Color.fromRGB(222, 64, 88);
            case "luck" -> Color.fromRGB(89, 193, 6);
            case "strength" -> Color.fromRGB(255, 199, 0);
            case "infested" -> Color.fromRGB(140, 156, 148);
            case "hero_of_the_village" -> Color.fromRGB(68, 255, 68);
            case "bad_luck" -> Color.fromRGB(192, 164, 77);
            case "invisibility" -> Color.fromRGB(246, 246, 246);
            case "absorption" -> Color.fromRGB(37, 82, 165);
            case "poison" -> Color.fromRGB(138, 185, 71);
            case "slowness" -> Color.fromRGB(139, 175, 224);
            case "haste" -> Color.fromRGB(217, 192, 67);
            case "weaving" -> Color.fromRGB(120, 105, 123);
            case "glowing" -> Color.fromRGB(148, 160, 97);
            case "bad_omen" -> Color.fromRGB(11, 97, 56);
            case "dolphins_grace" -> Color.fromRGB(136, 163, 190);
            case "levitation" -> Color.fromRGB(206, 255, 255);
            case "conduit_power" -> Color.fromRGB(29, 194, 209);
            case "blindness" -> Color.fromRGB(31, 31, 35);
            case "instant_damage" -> Color.fromRGB(169, 101, 106);
            case "nausea" -> Color.fromRGB(85, 29, 74);
            case "regeneration" -> Color.fromRGB(205, 92, 171);
            case "hunger" -> Color.fromRGB(88, 118, 83);
            case "speed" -> Color.fromRGB(51, 235, 255);
            case "trial_omen" -> Color.fromRGB(22, 106, 166);
            case "darkness" -> Color.fromRGB(41, 39, 33);
            case "oozing" -> Color.fromRGB(153, 255, 163);
            case "resistance" -> Color.fromRGB(145, 70, 240);
            default -> Color.WHITE;
        };
    }

    /**
     * Returns the PotionEffectType based on the String provided.
     * @param potionEffect The Effect Type String.
     * @return Returns the PotionEffectType.
     */
    @Nullable
    public static PotionEffectType potionNameToPotionEffect(String potionEffect)
    {
        return switch (potionEffect)
        {
            case "fire_resistance" -> PotionEffectType.FIRE_RESISTANCE;
            case "water_breathing" -> PotionEffectType.WATER_BREATHING;
            case "jump_boost" -> PotionEffectType.JUMP_BOOST;
            case "saturation" -> PotionEffectType.SATURATION;
            case "health_boost" -> PotionEffectType.HEALTH_BOOST;
            case "night_vision" -> PotionEffectType.NIGHT_VISION;
            case "weakness" -> PotionEffectType.WEAKNESS;
            case "wind_charged" -> PotionEffectType.WIND_CHARGED;
            case "wither" -> PotionEffectType.WITHER;
            case "mining_fatigue" -> PotionEffectType.MINING_FATIGUE;
            case "slowed_falling" -> PotionEffectType.SLOW_FALLING;
            case "raid_omen" -> PotionEffectType.RAID_OMEN;
            case "luck" -> PotionEffectType.LUCK;
            case "strength" -> PotionEffectType.STRENGTH;
            case "infested" -> PotionEffectType.INFESTED;
            case "hero_of_the_village" -> PotionEffectType.HERO_OF_THE_VILLAGE;
            case "bad_luck" -> PotionEffectType.UNLUCK;
            case "invisibility" -> PotionEffectType.INVISIBILITY;
            case "absorption" -> PotionEffectType.ABSORPTION;
            case "poison" -> PotionEffectType.POISON;
            case "slowness" -> PotionEffectType.SLOWNESS;
            case "haste" -> PotionEffectType.HASTE;
            case "weaving" -> PotionEffectType.WEAVING;
            case "glowing" -> PotionEffectType.GLOWING;
            case "bad_omen" -> PotionEffectType.BAD_OMEN;
            case "dolphins_grace" -> PotionEffectType.DOLPHINS_GRACE;
            case "levitation" -> PotionEffectType.LEVITATION;
            case "conduit_power" -> PotionEffectType.CONDUIT_POWER;
            case "blindness" -> PotionEffectType.BLINDNESS;
            case "instant_damage" -> PotionEffectType.INSTANT_DAMAGE;
            case "instant_health" -> PotionEffectType.INSTANT_HEALTH;
            case "nausea" -> PotionEffectType.NAUSEA;
            case "regeneration" -> PotionEffectType.REGENERATION;
            case "hunger" -> PotionEffectType.HUNGER;
            case "speed" -> PotionEffectType.SPEED;
            case "trial_omen" -> PotionEffectType.TRIAL_OMEN;
            case "darkness" -> PotionEffectType.DARKNESS;
            case "oozing" -> PotionEffectType.OOZING;
            case "resistance" -> PotionEffectType.RESISTANCE;
            default -> null;
        };
    }

}
