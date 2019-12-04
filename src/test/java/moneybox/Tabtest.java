package moneybox;

import org.junit.Test;

public class Tabtest {
    @Test
    public void Testtab() {
        Tab user = new moneybox.Tab();//creating object of tab class
        // Call Cautious tab
        user.CautiousTab ();

        //Call Balanced Tab
        user.Balanced();

        //Call Adventerous tab
        user.Adventerous();
    }

}
