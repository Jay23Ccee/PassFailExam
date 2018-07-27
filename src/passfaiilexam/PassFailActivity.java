/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passfaiilexam;

/**
 *
 * @author Jay-Cee
 */
public class PassFailActivity extends GradedActivity {
    /*
    This class holds a numeric score and determines wheter
    the score is passing or failing.
    */
    
    
    private double minPassingScore ; // MMinimum passing score
    
    /**
     * The constructor sets the minimum passing score.
     * @pARAM MPS THE MINIMUM PASSING SCORE.
     * 
     */
    
    public PassFailActivity(double mps)
    {
        minPassingScore = mps;
    }

    /*
    The getGrade method returns a letter grade determined from the score fields. This
    method overrides the superclass method. 
    @return The letter grade.
    */
    
   @Override
    public char getGrade()
    {
        char letterGrade;
        
        if(super.getScore() >= minPassingScore)
        {
            letterGrade= 'P';
        }
        else
        {
            letterGrade = 'F';
        }
        
        return letterGrade;
    }
    
}
