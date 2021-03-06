
package org.raml.jaxrs.example.resource;

import java.io.Reader;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.raml.jaxrs.example.model.Purchases;

@Path("purchases")
public interface PurchasesResource {


    /**
     * return list of fylms
     * 
     */
    @GET
    @Path("toprint")
    @Produces({
        "application/json"
    })
    PurchasesResource.GetPurchasesToprintResponse getPurchasesToprint()
        throws Exception
    ;

    /**
     * 
     * @param entity
     *      e.g. {
     *       "fylmIds" : [
     *         1,
     *         2,
     *         3
     *       ]
     *     }
     *     
     */
    @POST
    @Path("download")
    @Consumes("application/json")
    PurchasesResource.PostPurchasesDownloadResponse postPurchasesDownload(Reader entity)
        throws Exception
    ;

    public class GetPurchasesToprintResponse
        extends org.raml.jaxrs.example.resource.support.ResponseWrapper
    {


        private GetPurchasesToprintResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static PurchasesResource.GetPurchasesToprintResponse withJsonOK(Purchases entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PurchasesResource.GetPurchasesToprintResponse(responseBuilder.build());
        }

    }

    public class PostPurchasesDownloadResponse
        extends org.raml.jaxrs.example.resource.support.ResponseWrapper
    {


        private PostPurchasesDownloadResponse(Response delegate) {
            super(delegate);
        }

    }

}
