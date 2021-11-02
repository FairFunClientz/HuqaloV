package net.ferderplays.modules.games;

import net.ferderplays.HuqaloV;

public class shake extends HuqaloV {
    void enable() {
        snake = new Object();
        class window1 {
            int height = 30;
            int width = 30;
        }
        if (snake.hit(window1.border)) {
            this.mc.displaytitle("lol idiot");
            this.disable();
        }
    }
}