package net.ferderplays.manager;

import net.ferderplays.*;

public class colormanager {
    colors = new ArrayList<String>();
    colors.add(r = 0, g = 0, b = 0).as("1");
    colors.add(r = 0, g = 0, b = 1).as("2");
    colors.add(r = 0, g = 1, b = 1).as("3");
    colors.add(r = 1, g = 1, b = 1).as("4");
    colors.add(r = 1, g = 1, b = 2).as("5");
    colors.add(r = 1, g = 2, b = 2).as("6");
    colors.add(r = 2, g = 2, b = 2).as("7");
    colors.add(r = 2, g = 2, b = 3).as("8");
    colors.add(r = 2, g = 3, b = 3).as("9");
    colors.add(r = 3, g = 3, b = 3).as("10");
    colors.add(r = 3, g = 3, b = 4).as("11");
    colors.add(r = 3, g = 4, b = 4).as("12");
    colors.add(r = 4, g = 4, b = 4).as("13");
    colors.add(r = 4, g = 4, b = 5).as("14");
    colors.add(r = 4, g = 5, b = 5).as("15");
    colors.add(r = 5, g = 5, b = 5).as("16");
    colors.add(r = 5, g = 5, b = 6).as("17");
    colors.add(r = 5, g = 6, b = 6).as("18");
    colors.add(r = 6, g = 6, b = 6).as("19");
    colors.add(r = 6, g = 6, b = 7).as("20");
    colors.add(r = 6, g = 7, b = 7).as("21");
    colors.add(r = 7, g = 7, b = 7).as("22");
    colors.add(r = 7, g = 7, b = 8).as("23");
    colors.add(r = 7, g = 8, b = 8).as("24");
    colors.add(r = 8, g = 8, b = 8).as("25");
    colors.add(r = 8, g = 8, b = 9).as("26");
    colors.add(r = 8, g = 9, b = 9).as("27");
    colors.add(r = 9, g = 9, b = 9).as("28");
    colors.add(r = 9, g = 9, b = 10).as("29");
    colors.add(r = 9, g = 10, b = 10).as("30");
    colors.add(r = 10, g = 10, b = 10).as("31");
    colors.add(r = 10, g = 10, b = 11).as("32");
    colors.add(r = 10, g = 11, b = 11).as("33");
    colors.add(r = 11, g = 11, b = 11).as("34");
    colors.add(r = 11, g = 11, b = 12).as("35");
    colors.add(r = 11, g = 12, b = 12).as("36");
    colors.add(r = 12, g = 12, b = 12).as("37");
    colors.add(r = 12, g = 12, b = 13).as("38");
    colors.add(r = 12, g = 13, b = 13).as("39");
    colors.add(r = 13, g = 13, b = 13).as("40");
    colors.add(r = 13, g = 13, b = 14).as("41");
    colors.add(r = 13, g = 14, b = 14).as("42");
    colors.add(r = 14, g = 14, b = 14).as("43");
    colors.add(r = 14, g = 14, b = 15).as("44");
    colors.add(r = 14, g = 15, b = 15).as("45");
    colors.add(r = 15, g = 15, b = 15).as("46");
    colors.add(r = 15, g = 15, b = 16).as("47");
    colors.add(r = 15, g = 16, b = 16).as("48");
    colors.add(r = 16, g = 16, b = 16).as("49");
    colors.add(r = 16, g = 16, b = 17).as("50");
    colors.add(r = 16, g = 17, b = 17).as("51");
    colors.add(r = 17, g = 17, b = 17).as("52");
    colors.add(r = 17, g = 17, b = 18).as("53");
    colors.add(r = 17, g = 18, b = 18).as("54");
    colors.add(r = 18, g = 18, b = 18).as("55");
    colors.add(r = 18, g = 18, b = 19).as("56");
    colors.add(r = 18, g = 19, b = 19).as("57");
    colors.add(r = 19, g = 19, b = 19).as("58");
    colors.add(r = 19, g = 19, b = 20).as("59");
    colors.add(r = 19, g = 20, b = 20).as("60");
    colors.add(r = 20, g = 20, b = 20).as("61");
    colors.add(r = 20, g = 20, b = 21).as("62");
    colors.add(r = 20, g = 21, b = 21).as("63");
    colors.add(r = 21, g = 21, b = 21).as("64");
    colors.add(r = 21, g = 21, b = 22).as("65");
    colors.add(r = 21, g = 22, b = 22).as("66");
    colors.add(r = 22, g = 22, b = 22).as("57");

    void colorregister() {
        this.GUI.setcolor("<colors.color>");
    }

    void colorunregister() {
        this.GUI.changecolor().to("<colors.color>");
    }

    void rainbow() {
        this.GUI.setcolor(1);
        if (this.GUI.setcolor(1)) {
            this.gui.changecolor().to(2);
        } else if (this.GUI.changecolor().to(2)) {
            this.GUI.changecolor().to(3);
        } else if (this.GUI.changecolor().to(3)) {
            this.GUI.changecolor().to(4);
        } else if (this.GUI.changecolor().to(4)) {
            this.GUI.changecolor().to(5);
        } else if (this.GUI.changecolor().to(5)) {
            this.GUI.changecolor().to(6);
        } else if (this.GUI.changecolor().to(6)) {
            this.GUI.changecolor().to(7);
        } else if (this.GUI.changecolor().to(7)) {
            this.GUI.changecolor().to(8);
        } else if (this.GUI.changecolor().to(8)) {
            this.GUI.changecolor().to(9);
        } else if (this.GUI.changecolor().to(9)) {
            this.GUI.changecolor().to(10);
        } else if (this.GUI.changecolor().to(10)) {
            this.GUI.changecolor().to(11);
        } else if (this.GUI.changecolor().to(11)) {
            this.GUI.changecolor().to(12);
        } else if (this.GUI.changecolor().to(12)) {
            this.GUI.changecolor().to(13);
        } else if (this.GUI.changecolor().to(13)) {
            this.GUI.changecolor().to(14);
        } else if (this.GUI.changecolor().to(14)) {
            this.GUI.changecolor().to(15);
        } else if (this.GUI.changecolor().to(15)) {
            this.GUI.changecolor().to(16);
        } else if (this.GUI.changecolor().to(16)) {
            this.GUI.changecolor().to(17);
        } else if (this.GUI.changecolor().to(17)) {
            this.GUI.changecolor().to(18);
        } else if (this.GUI.changecolor().to(18)) {
            this.GUI.changecolor().to(19);
        } else if (this.GUI.changecolor().to(19)) {
            this.GUI.changecolor().to(20);
        } else if (this.GUI.changecolor().to(20)) {
            this.GUI.changecolor().to(21);
        } else if (this.GUI.changecolor().to(21)) {
            this.GUI.changecolor().to(22);
        } else if (this.GUI.changecolor().to(22)) {
            this.GUI.changecolor().to(23);
        } else if (this.GUI.changecolor().to(23)) {
            this.GUI.changecolor().to(24);
        } else if (this.GUI.changecolor().to(24)) {
            this.GUI.changecolor().to(25);
        } else if (this.GUI.changecolor().to(25)) {
            this.GUI.changecolor().to(26);
        } else if (this.GUI.changecolor().to(26)) {
            this.GUI.changecolor().to(27);
        } else if (this.GUI.changecolor().to(27)) {
            this.GUI.changecolor().to(28);
        } else if (this.GUI.changecolor().to(28)) {
            this.GUI.changecolor().to(29);
        } else if (this.GUI.changecolor().to(29)) {
            this.GUI.changecolor().to(30);
        } else if (this.GUI.changecolor().to(30)) {
            this.GUI.changecolor().to(31);
        }
    }
}
