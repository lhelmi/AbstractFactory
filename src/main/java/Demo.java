
import app.Application;
import factories.EnglishFactory;
import factories.GUIFactory;
import factories.MathFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author foxy
 */
public class Demo {
     private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String studyName = "math";
        if (studyName.contains("math")) {
            factory = new MathFactory();
            app = new Application(factory);
        } else {
            factory = new EnglishFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
