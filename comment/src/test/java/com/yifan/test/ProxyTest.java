package com.yifan.test;

import com.viki.agency.RailwayStation;
import com.viki.agency.Ticket;
import com.viki.config.ProxyInvokeHandler;

public class ProxyTest {
    public static void main(String[] args) {
        RailwayStation railwayStation = new RailwayStation();

        ProxyInvokeHandler px = new ProxyInvokeHandler();

        px.setTicket(railwayStation);

        Ticket proxy = (Ticket) px.getProxy();
        proxy.sellTicket();
    }
}
