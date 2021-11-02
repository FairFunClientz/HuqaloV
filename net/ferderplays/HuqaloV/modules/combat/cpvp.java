package net.ferderplays.modules.combat;

import net.minecraft.entity.endcrystall;
import net.minecraft.player.EntityPlayer;
import net.minecraft.block.obsidian;
import net.minecraft.player.offhand;
import net.minecraft.player.MainHand;
import net.minecraft.player.hotbar;
import net.ferderplays.HuqaloV;

public class cpvp extends HuqaloV {
    public cpvp() {
        private static final String Setting long hitrange < range > = this.mc.player.setHitRange(); this.send(hitrange).toInt(hitrange);
        private static final String Setting long placerange < range > = this.mc.player.setPlaceRange(); this.send(placerange).toInt(placerange);
        private static final String Setting long wallsplacerange < range > = this.mc.player.setWallsPlaceRange(); this.send(wallsplacerange).toInt(wallplacerange);
        private static final String Setting long wallshitrange < range > = this.mc.player.setWallsHitRange(); this.send(wallshitrange).toInt(wallshitrange);
        private static final String Setting long hitdelay < delay > = this.mc.player.setHitDelay(); this.send(hitdelay).toInt(hitdelay);
        private static final String Setting long placedelay < delay > = this.mc.player.setPlaceDelay(); this.send(placedelay).toInt(placedelay);
    }

    void enable() {
        String player = mc.getPlayer();
        if (player) {
            String enemy = mc.getOtherPlayers();
            if (enemy) {
                public void attack() {
                    this.mc.attack(enemy);
                    private static ranges {
                        int hitrange = this.getHitRange(); //hit range
                        int placerange = this.getPlacerange(); //place range
                        int wallsplacerange = this.getWallsplacerange(); //place range throught walls
                        int wallshitrange = this.getWallshitrange(); //hit range through walls
                    }
                    
                    private static delays {
                        int hitdelay = this.getHitDelay(); //hit delay
                        int placedelay = this.getPlaceDelay(); //place delay
                    }
                }
            }
        }
    }
}