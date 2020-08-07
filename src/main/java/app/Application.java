/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import factories.GUIFactory;
import study.Study;

/**
 *
 * @author foxy
 */
public class Application {
    private Study study;

    public Application(GUIFactory factory) {
        study = factory.createLesson();
    }

    public void paint() {
        study.paint();
    }
}