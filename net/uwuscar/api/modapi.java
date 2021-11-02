package net.uwuscar.api;

import net.ferderplays.*;
import net.minecraft.*;
import dev.ve90n1ck.*;
import net.uwuscar.*;
import me.sulinkq.*;

public class modapi extends HuqaloV {
    private static String fml = "ForgeModLoader";
    private static String mod = "C:\\Users\\" + "user.name" + "\\AppData\\Roaming\\.minecraft\\mods" + "<file>";if(this.foundFile(mod))
    {
        this.mc.fml.load(mod);
    }if(this.fml.load(mod))
    {
        this.mc.loadfile("mcmod.info");
    }
}