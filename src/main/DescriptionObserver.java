package main;

/**
 * Class model for a Description Observer
 * @author Jared Mallas
 * @version 1.0
 */
public class DescriptionObserver extends Observer
{

    public DescriptionObserver (Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Override of update where the observer is to report
     * whether the interger contained is positive, negative, or exactly 0.
     */
    @Override
    public void update()
    {
        System.out.println("Description: " + this.getDesc());
    }

    /**
     * Method to determin whether the state of the subject is positive, negative,
     * or 0. Used pulled out of update method for unit testing.
     * @return String reporting on state of subject.
     */
    public String getDesc()
    {
        String sDesc;

        if (subject.getState() > 0)
        {
            sDesc = "Greater than 0";
        }
        else if (subject.getState() < 0)
        {
            sDesc = "Less than 0";
        }
        else
        {
            sDesc = "Equal to 0";
        }

        return sDesc;
    }
}
