package com.viki.agency;

public class Clent {

    public static void main(String[] args) {
        RailwayStation rs = new RailwayStation();

        AgentPoint ap = new AgentPoint(rs);
        ap.sellTicket();
    }
}
