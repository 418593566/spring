package com.viki.agency;

public class AgentPoint implements Ticket{

    private RailwayStation rs;

    public AgentPoint(){}

    public AgentPoint(RailwayStation rs){
        this.rs = rs;
    }

    public void sellTicket() {
        rs.sellTicket();
        show();
    }

    public void show(){
        System.out.println("没了");
    }
}
