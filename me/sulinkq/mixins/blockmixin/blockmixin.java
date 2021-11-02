package me.sulinkq.mixins.blockmixin;

import net.minecraft.block.*;

public class blockmixin {
    var1[1]=new mixin();var1[2]=this.mc.getBlock();if(var1[2])
    {
        if (this.pressed("Button1")) {
            this.place(var1[2]);
        } else if (this.pressed("Button2")) {
            this.destroy(var1[2]);
        }
        int height = 10px;
        int width = 10px;
    }var1[3]=this.mc.getWorld();if(var1[3])
    {
        if (this.mc.loadedWorld()) {
            this.mc.loadBlock();
        }
        if (this.mc.createWorld()) {
            this.mc.loadWorld();
        } else if (this.mc.deletedWorld()) {
            this.mc.world.deleteBlock();
        }
    }
}
