package net.ferderplays.modules.render;

import net.ferderplays.modules.*;
import net.ferderplays.manager.*;

public class HUDeditor {
    hudoptions=new ArrayList<String>();hudoptions.add("watermark");
    public void pressed(this.getkeybind().formodule("HUDeditor")) {
        class panel1 {
            int height = 151;
            int width = 50;
            int modules = hudoptions();
        }

    private void drawn() {

            private class watermark {
                private static String watermark = "HuqaloV" + "1.0.0";
                this.display(watermark);
            }
    
            private class keystrokes {
    
                class panel1 {
                    private int height = 10;
                    private int width = 10;
                    private static String text = "W";
                    private int color = this.GUI.getcolor();
                    if (this.pressed("W")) {
                        this.changecolor().to();
                    }
                }
                this.display(panel1);
    
                class panel2 {
                    private int height = 10;
                    private int width = 10;
                    private static String text = "S";
                    private int color = this.GUI.getcolor();
                }
                this.display(panel2).inpos(this.position.under.to(panel1));
    
                class panel3 {
                    private int height = 10;
                    private int width = 10;
                    private static String text = "D";
                    private int color = this.GUI.getcolor();
                }
                this.display(panel3).inpos(this.position.right.to(panel2));
    
                class panel4 {
                    private int height = 10;
                    private int width = 10;
                    private static String text = "A";
                    private int color = this.GUI.getcolor();
                }
                this.display(panel4).inpos(this.position.left.to(panel3));
    
                class panel5 {
                    private int height = 10;
                    private int width = 30;
                    private static String text = "Space";
                    private int color = this.GUI.getcolor();
                }
                this.display(panel5).inpos(this.position.under(panel4, panel3, panel2));
            }
        }
}}