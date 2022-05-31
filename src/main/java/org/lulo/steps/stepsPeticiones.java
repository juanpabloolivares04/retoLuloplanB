package org.lulo.steps;

import net.thucydides.core.annotations.Step;
import org.lulo.page.pageGetAll;

public class stepsGetAll {
    pageGetAll objpage;

    @Step
    public void getAll(){
        objpage.getAllUsers();
    }

    @Step
    public void getstatusAll(int status){
        objpage.statusgetAllUsers(status);
    }

}
