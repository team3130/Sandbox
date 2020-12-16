package Cars;

public class Viechle {
    //define variables that are available to all parts of the class hence the (m_variable)
    private boolean m_wipers;
    private final String m_model;
    private int m_age;
    protected final String m_name;
    // different modes are 'D' for drive, 'R' for reverse, 'N' for neutral, and 'P' for park
    private char m_mode;
    public Viechle(String NewModel, int age, String name) {
        this.m_model = NewModel;
        this.m_age = age;
        this.m_wipers = false;
        this.m_mode = 'D';
        this.m_name = name;
    }
    /**
     This next section is going to be examples of things that you can do with this, make sure to have fun with it

     Notice how methods are in camel case nameName
     */
    private String putInPark() {
        this.m_mode = 'P';
        return this.m_model + " is now in park";
    }

    private String putInReverse() {
        this.m_mode = 'R';
        return this.m_model + " is now in reverse";
    }

    private String putInDrive() {
        this.m_mode = 'D';
        return this.m_model + " is now in drive";
    }

    private String coast() {
        this.m_mode = 'N';
        return this.m_model + "is now coasting and in neutral";
    }

    private boolean toggleWindshieldWipers() {
        if (this.m_wipers) {
            this.m_wipers = false;
            return false;
        }
        else if (!this.m_wipers) {
            this.m_wipers = true;
            return true;
        }
        return false;
    }
    private int getAge() {
        return this.m_age;
    }
    private String getModel() {
        return this.m_model;
    }
    private void AddAge() {
        this.m_age++;
    }
    private char getMode() {
        return this.m_mode;
    }
    private String getName() {return this.m_name;}
}