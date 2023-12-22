package org.example;

import org.junit.runner.Request;

import java.util.List;
public class RequestsHolder {
    private static List<Request> requests;

    private static void addRequest(Request request) {
        requests.add(request);
    }

    private static void removeRequest(Request request) {
        requests.remove(request);
    }
}
