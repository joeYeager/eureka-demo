package org.joseph.yeager.eurekaclient.exception;


public class FeignExceptionSummary extends RuntimeException {
    private int status;
    private String reason;
    private String body;

    public int getStatus() {
        return status;
    }

    public void setStatus(final int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }
}
