
public class RPC {

    private static final DiscordRichPresence discordRichPresence = new DiscordRichPresence();
    private static final DiscordRPC discordRPC = DiscordRPC.INSTANCE;

    public static void startRPC() {
        DiscordEventHandlers eventHandlers = new DiscordEventHandlers();
        eventHandlers.disconnected = ((var1, var2) -> System.out
                .println("Discord RPC disconnected, var1: " + var1 + ", var2: " + var2));

        String discordID = "838078740344471623";
        discordRPC.Discord_Initialize(discordID, eventHandlers, true, null);

        discordRichPresence.startTimestamp = System.currentTimeMillis() / 1000L;
        discordRichPresence.details = HuqaloV.VERSION;
        discordRichPresence.largeImageKey = "logo";
        discordRichPresence.largeImageText = "from OwO to Uwu";
        discordRichPresence.smallImageKey = "small";
        discordRichPresence.smallImageText = "https://discord.gg/9KZpwxUkeH";
        discordRichPresence.state = null;
        discordRPC.Discord_UpdatePresence(discordRichPresence);
    }

    public static void stopRPC() {
        discordRPC.Discord_Shutdown();
        discordRPC.Discord_ClearPresence();
    }
}