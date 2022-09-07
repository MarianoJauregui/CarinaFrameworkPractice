package myOwnAPITesting;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.impl.Get;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class ApiTests implements IAbstractTest {


    /**
     * Create REST call object
     * Specify the properties for a request/response placeholder
     * Add headers if required
     * Specify the expected HTTP status
     * Call API
     * Validate the response by a template or parse some data by JSON path
     * Make further calls using the data from the previous call if needed
     */
    @Test
    public void getUser() {
        System.out.println("Starting test");
        Get getApi = new Get();
        getApi.setProperties("api/users/user.properties");
        getApi.callAPIExpectSuccess();
        getApi.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getApi.validateResponseAgainstSchema("api/personalUsers/rs.schema");
    }
}
