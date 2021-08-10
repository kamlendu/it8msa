/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import token.GenerateToken;

/**
 *
 * @author root
 */

//@RegisterRestClient(configKey = "rclient")
@RegisterRestClient(baseUri = "http://localhost:8084/SampleMicroerviceApp/rest/example")
public interface SampleClient {
    
    @ClientHeaderParam(name = "authorization", value = "{generateJWTToken}")
    @GET   
    @Produces(MediaType.TEXT_PLAIN)
    public String get();
    
    // Method to read jwt token from microprofile-config.properties file
    default String generateJWTToken()
    {
        Config config = ConfigProvider.getConfig();
        
        String token = "Bearer "+ GenerateToken.generateJWT();
        return token;
    }
    
    
}
