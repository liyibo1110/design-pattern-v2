package com.liyibo1110.poison.pill;

import java.util.Map;

/**
 * @author liyibo
 * @date 2024-06-11 14:09
 */
public interface Message {

    Message POISON_PILL = new Message() {
        @Override
        public void addHeader(Headers header, String value) {
            throw poison();
        }

        @Override
        public String getHeader(Headers header) {
            throw poison();
        }

        @Override
        public Map<Headers, String> getHeaders() {
            throw poison();
        }

        @Override
        public void setBody(String body) {
            throw poison();
        }

        @Override
        public String getBody() {
            throw poison();
        }

        private RuntimeException poison() {
            return new UnsupportedOperationException("Poison");
        }
    };

    enum Headers {
        DATE, SENDER
    }

    void addHeader(Headers header, String value);

    String getHeader(Headers header);

    Map<Headers, String> getHeaders();

    void setBody(String body);

    String getBody();
}
