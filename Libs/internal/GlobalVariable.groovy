package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object basicToken
     
    /**
     * <p></p>
     */
    public static Object encodedToken
     
    /**
     * <p></p>
     */
    public static Object timeOut
     
    /**
     * <p></p>
     */
    public static Object isAPIRunning
     
    /**
     * <p></p>
     */
    public static Object isWebRunning
     
    /**
     * <p></p>
     */
    public static Object webUrl
     
    /**
     * <p></p>
     */
    public static Object apiUrl
     
    /**
     * <p></p>
     */
    public static Object doctorAccessToken
     
    /**
     * <p></p>
     */
    public static Object patientAccessToken
     
    /**
     * <p></p>
     */
    public static Object adminAccessToken
     
    /**
     * <p></p>
     */
    public static Object credentialDataFile
     
    /**
     * <p></p>
     */
    public static Object accessToken
     
    /**
     * <p></p>
     */
    public static Object appPath
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            basicToken = selectedVariables['basicToken']
            encodedToken = selectedVariables['encodedToken']
            timeOut = selectedVariables['timeOut']
            isAPIRunning = selectedVariables['isAPIRunning']
            isWebRunning = selectedVariables['isWebRunning']
            webUrl = selectedVariables['webUrl']
            apiUrl = selectedVariables['apiUrl']
            doctorAccessToken = selectedVariables['doctorAccessToken']
            patientAccessToken = selectedVariables['patientAccessToken']
            adminAccessToken = selectedVariables['adminAccessToken']
            credentialDataFile = selectedVariables['credentialDataFile']
            accessToken = selectedVariables['accessToken']
            appPath = selectedVariables['appPath']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
