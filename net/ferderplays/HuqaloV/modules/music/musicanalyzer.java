package net.ferderplays.modules.music;

import net.ferderplays.HuqaloV;
import net.ferderplays.gui.*;

public class musicanalyzer extends HuqaloV {
    void enable() {
        if (videoarea.setVideo()) {
            this.youtube.search();
            if (this.youtube.found()) {
                this.youtube.playVideo().as(audio);
            }
        }
    }
}
