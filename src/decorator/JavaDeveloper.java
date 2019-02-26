/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author nodira
 */
public class JavaDeveloper implements Developer{

    @Override
    public String makeJob() {
        return "Write Java code. ";
    }
    
}
