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

    /*
    This class determines a passing or failing grade for an exam.
    */
    
    public class PassFailExam extends PassFailActivity
    {
        private int numQuestions ;      //Number of questions
        private double pointsEach ;         //Points for each questions
        private int numMissed;      //Number of questions missed.
        
        /**
         * The constructor sets the number of questions, the 
         * number of questions missed, and the minimum passing
         * score.
     * @param questions
         * @param Questions The number of questions.
         * @param missed The number of questions missed.
         * @param minPassing The minimum passing score
         */
        
        public  PassFailExam(int questions, int missed, double minPassing){
            //Call the superclass constructor.
            super(minPassing);
          
            
            //Declare a local variable for the score.
            double numericScore;
            
            //Set the numQuestions and numMissed fields.
            numQuestions = questions;
            numMissed = missed;
            
            //Calculate the points for each questions  and 
            // the numeric score for this exam.
            
            pointsEach = 100.0 / questions ;
            numericScore = 100.0 - (missed * pointsEach);
            
            // Call the superclass setScore method to
            //set the numeric score.
            setScore(numericScore);
            
            
            
        }
        
        /**
         * The getPointsEach  method returns the number of 
         * ppoints each questios is worth.
         * @return the value in the pointsEach field.
         */
        
        public double getPointsEach()
        {
            return pointsEach;
        }
        
        /**
         * The getNummissed method returns the number of
         * questions missed.
         * @return The value in the numMiSSED FIELD.
         */
        
        public int getNumMissed()
        {
            return numMissed;
        }
        
    }
    

