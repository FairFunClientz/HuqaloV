package net.ferderplays.manager;

import net.ferderplays.modules.*;
import net.ferderplays.gui.*;
import net.ferderplays.HuqaloV;

public class keybindmanager extends HuqaloV {
    keybinds=new ArrayList<String>();

    void addedKeybind() {
        keybinds.add();
    }

    void removedKeybind() {
        keybinds.remove();
    }

    void pressedKeybind(times1) {
        this.enableModule();
    }
    int times1 = 1;
    int times2 = 2;

    void pressedKeybind(times2) {
        this.desableModule();
    }
}