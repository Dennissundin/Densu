package autosnow;

/**
 *
 * @author clary35
 */
public class AutoSnow {

    DataStore ds;
    ControlUI cui;
    
    AutoSnow(){

        /*
         * Initialize the DataStore call where all "global" data will be stored
         */
        ds = new DataStore();

        /*
         * This sets the file path and read network text file. Adjust for your needs.
         */
        ds.setFileName("C:\\Users\\User\\Documents\\NetBeansProjects\\AutoSnow_Lab1\\build\\classes\\autosnow\\streets.txt");
        ds.readNet();

        /*
         * Initialize and show the GUI. The constructor gets access to the DataStore
         */
        cui = new ControlUI(ds);
        cui.setVisible(true);
        cui.showStatus();
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* This is the "main" method what gets called when the application starts
         * All that is done here is to make an instance of the RobotControl class,
         * and thereby, call the RobotControl constructor.
        */
        AutoSnow x = new AutoSnow();
    }
}
