
package org.raml.jaxrs.example.resource;

import org.raml.jaxrs.example.model.Purchases;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.Reader;

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
