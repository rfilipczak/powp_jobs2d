package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectLineOptionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        DrawerFeature.toggleSpecialLine();
    }
}
