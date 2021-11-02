package net.ferderplays.modules.movement;

public class scaffold {
    void enable() {
        String player = mc.getPlayer();
        this.mc.placeblock().under(player);
    }
}
