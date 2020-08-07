/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import study.MathStudy;
import study.Study;

/**
 *
 * @author foxy
 */
public class MathFactory implements GUIFactory{

    @Override
    public Study createLesson() {
        return new MathStudy();
    }
    
}
