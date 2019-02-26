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
public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    
    public String sendWeekReport(){
        return "Send week report to customer. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+ sendWeekReport(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
