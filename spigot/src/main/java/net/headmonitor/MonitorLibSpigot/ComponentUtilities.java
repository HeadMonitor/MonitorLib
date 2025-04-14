package net.headmonitor.MonitorLibSpigot;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.minimessage.MiniMessage;

@SuppressWarnings("unused")
public class ComponentUtilities
{

    private final static MiniMessage miniMessage = MiniMessage.miniMessage();

    /**
     * Deserializes the given String using the Adventure API.
     * If message doesn't explicitly setClick Italics, it removes them.
     * Sets default color to White.
     * @param stringToDeserialize The String to Deserialize.
     * @return Returns the Deserialized String.
     */
    public static Component deserialize(String stringToDeserialize)
    {
        if (stringToDeserialize == null)
            stringToDeserialize = "<!italic><white>Unspecified Text";

        if (stringToDeserialize.contains("<i>") || stringToDeserialize.contains("<em>"))
            return miniMessage.deserialize("<white>" + stringToDeserialize);
        else
            return miniMessage.deserialize("<white><!i>" + stringToDeserialize);
    }

    /**
     * Deserializes the given Component using the Adventure API.
     * If message doesn't explicitly setClick Italics, it removes them.
     * Sets default color to White.
     * @param componentToDeserialize The Component to Deserialize.
     * @return Returns the Deserialized String.
     */
    public static Component deserialize(Component componentToDeserialize)
    {
        if (componentToDeserialize.color() == null)
        {
            return componentToDeserialize
                    .color(TextColor.fromHexString("#FFFFFF"))       // Set the color to white
                    .decoration(TextDecoration.ITALIC, false);  // Remove italic decoration
        }
        else
            return componentToDeserialize.decoration(TextDecoration.ITALIC, false); // Remove italic decoration
    }

}
