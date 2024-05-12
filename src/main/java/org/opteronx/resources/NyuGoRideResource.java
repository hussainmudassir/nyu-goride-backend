package org.opteronx.resources;

import javax.ws.rs.GET;

public class NyuGoRideResource {

    @GET
    public String getRoutes() {
        return "Test";
    }
}
