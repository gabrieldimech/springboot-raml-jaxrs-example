package org.raml.jaxrs.example.resource;

import org.springframework.stereotype.Component;

import java.io.Reader;

/**
 * Created by gabrieldimech on 23/08/2016.
 */
@Component
public class PurchaseResourceImpl implements PurchasesResource{
    @Override
    public GetPurchasesToprintResponse getPurchasesToprint() throws Exception {
        return null;
    }

    @Override
    public PostPurchasesDownloadResponse postPurchasesDownload(Reader entity) throws Exception {
        return null;
    }
}
