package com.viki.config;

import com.viki.agency.Ticket;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvokeHandler implements InvocationHandler {

    private Ticket ticket;

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     *   Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
     *                                           new Class[] { Foo.class },
     *                                           handler);
     */


    /**
     * 生成得到代理类
     * 类加载器
     * 需要代理的接口
     *
     * @return
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),ticket.getClass().getInterfaces(),this);
    }



    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(ticket, args);
        return result;
    }
}
