/*
 * Simple program that returns whether an auto policy is in a no-fault state
 * Demonstrates Strings in a switch
 * From "Java How To Program, 10/e, Early Objects" - Chapter 5
 */

public class AutoPolicy {

      private int accountNumber; // policy account number
      private String makeAndModel; // car that the policy applies to
      private String state; // two-letter state abbreviation
 
      // constructor
      public AutoPolicy(int newAccountNumber, String newMakeAndModel, String newState) {
         this.accountNumber = newAccountNumber;
         this.makeAndModel = newMakeAndModel;
         this.state = newState;
      }
 
      // sets the accountNumber
      public void setAccountNumber(int newAccountNumber)
      {
         this.accountNumber = newAccountNumber;
      }
 
      // returns the accountNumber
      public int getAccountNumber()
      {
         return this.accountNumber;
      }
 
      // sets the makeAndModel
      public void setMakeAndModel(String newMakeAndModel)
      {
         this.makeAndModel = newMakeAndModel;
      }
 
      // returns the makeAndModel
      public String getMakeAndModel()
      {
         return this.makeAndModel;
      }
 
      // sets the state
      public void setState(String newState)
      {
         this.state = newState;
      }
 
      // returns the state
      public String getState()
      {
         return this.state;
      }
 
      //Predicate method returns whether the state has no-fault insurance
      public boolean isNoFaultState()
      {
         boolean noFaultState;
 
         //Determine whether state has no-fault auto insurance           
         switch (getState()) //Get AutoPolicy object's state abbreviation 
         {                                                                
            case "MA": case "NJ": case "NY": case "PA":                   
               noFaultState = true;                                       
               break;                                                     
            default:                                                      
               noFaultState = false;                                      
               break;                                                     
         }                                                                
 
         return noFaultState;
      }//End isNoFaultState
 
      public static void main(String[] args) {

         AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
         AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");
 
         //Is the policy in a no-fault state
         policyInNoFaultState(policy1);
         policyInNoFaultState(policy2);
      }//End main
 
      //Displays whether an AutoPolic is in a state with no-fault auto insurance
      public static void policyInNoFaultState(AutoPolicy policy)
      {
         System.out.println("The auto policy:");
         System.out.printf(
            "Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
            policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
            (policy.isNoFaultState() ? "is": "is not"));
    }//End policyInNoFaultState
    
}//End class AutoPolicy
