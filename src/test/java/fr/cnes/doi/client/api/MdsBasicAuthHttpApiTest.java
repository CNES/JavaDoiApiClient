/*
 * Doi Server API
 * Doi Server API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fr.cnes.doi.client.api;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.cnes.doi.client.ApiClient;
import fr.cnes.doi.client.ApiException;
import fr.cnes.doi.client.Configuration;
import fr.cnes.doi.client.auth.ApiKeyAuth;

/**
 * API tests for MdsApi
 */
public class MdsBasicAuthHttpApiTest {

    private static MdsApi api;
    
    /**
     * Basic Auth for user "test" with project "828606". (User and project must be in database)
     */
    private final static String auth = "user:password";
    
    @BeforeClass
    public static void initAuthRequest(){
    	ApiClient defaultClient = Configuration.getDefaultApiClient();

    	// Configure API key authorization: APIKeyHeader
    	ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    	APIKeyHeader.setApiKey(auth);
    	// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    	APIKeyHeader.setApiKeyPrefix("Basic");
    	
    	api = new MdsApi(new ApiClient().setBasePath(TestUtil.httpbasePath));
    }
    
    /**
     * 
     *
     * This request marks a dataset as inactive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelDoiProjectTest() throws ApiException {
        String response = api.cancelDoiProject(TestUtil.doiTest);
        assert(response.equals("OK"));
    }
    
    /**
     * 
     *
     * Create or update doi project metada
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDoiMetadaTest() throws ApiException {
        String response = api.postDoiMetada(TestUtil.doiMetadata);
        response.equals("OK (" + TestUtil.doiTest + ")");
    }
    
    /**
     * 
     *
     * Create a **new** doi project or update the landing page url if it the project already exists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDoiTest() throws ApiException {
        String response = api.postDoi(TestUtil.landingPageUrl, TestUtil.doiTest);
        assert(response.equals("OK")); 
    }
    
    
    /**
     * 
     *
     * Renvoie les metadata d&#39;un doi
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDoiMetadataTest() throws ApiException {
        String response = api.getAllDoiMetadata(TestUtil.doiTest);
        assert(response.startsWith(TestUtil.doiMetadataBeginning));
    }
    
    /**
     * 
     *
     * Get all the dois
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDoisTest() throws ApiException {
        String response = api.getAllDois();
        assert(response.equals("10.24400/329360/F7Q52MNK"));
    }
    
//    /**
//     * 
//     *
//     * add an association media/url
//     *
//     * @throws ApiException
//     *          if the Api call fails
//     */
//    @Test
//    public void postMediaTest() throws ApiException {
//        String response = api.postMedia(TestUtil.doiTest, TestUtil.media);
//        assert(response.equals("OK"));
//    }
    
//    /**
//     * 
//     *
//     * Return a list of pairs of media type and URLs
//     *
//     * @throws ApiException
//     *          if the Api call fails
//     */
//    @Test
//    public void getDoiMediaTest() throws ApiException {
//        String response = api.getDoiMedia(TestUtil.doiTest);
//        assert(response.equals(TestUtil.media));
//    }
    
    /**
     * 
     *
     * Renvoie url de la landing page du doi
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLandingPageUrlTest() throws ApiException {
        String response = api.getLandingPageUrl(TestUtil.doiTest);
        assert(response.equals(TestUtil.landingPageUrl));
    }
    
}
