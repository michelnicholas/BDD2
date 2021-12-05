package stepdefinitions;

public class CredentialSteps {

    private void pause (int second){
        try{
            Thread.sleep(second * 1000);
        }
        catch (InterruptedException ignore){
            // do nothing
        }
    }


}
