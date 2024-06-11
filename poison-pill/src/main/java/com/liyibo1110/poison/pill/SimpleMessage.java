package com.liyibo1110.poison.pill;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liyibo
 * @date 2024-06-11 14:13
 */
public class SimpleMessage implements Message {

    private final Map<Headers, String> headers = new HashMap();

    private String body;

    @Override
    public void addHeader(Headers header, String value) {
        headers.put(header, value);
    }

    @Override
    public String getHeader(Headers header) {
        return headers.get(header);
    }

    @Override
    public Map<Headers, String> getHeaders() {
        return Collections.unmodifiableMap(headers);
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String getBody() {
        return body;
    }
}
