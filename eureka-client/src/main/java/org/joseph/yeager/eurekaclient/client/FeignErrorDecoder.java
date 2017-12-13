package org.joseph.yeager.eurekaclient.client;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.joseph.yeager.eurekaclient.exception.FeignExceptionSummary;

import java.io.IOException;
import org.apache.commons.io.IOUtils;


public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(final String s, final Response response) {
        FeignExceptionSummary feignExceptionSummary = new FeignExceptionSummary();
        feignExceptionSummary.setStatus(response.status());
        feignExceptionSummary.setReason(response.reason());
        try {
            feignExceptionSummary.setBody(IOUtils.toString(response.body().asInputStream(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return feignExceptionSummary;
    }

}
