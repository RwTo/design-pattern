package com.rwto.designpattern.creational.builder;

public class RabbitMQClient {
    
    // 私有构造，目标类的构造方法要传入一个Builder对象
    private RabbitMQClient(Builder builder){
        
    }
    
    // builder类位于目标类的内部，并且使用static修饰
    public static class Builder{
        // 保证不可变对象的密闭性
        private String host = "127.0.0.1";

        private int port = 5672;

        private int mode;

        private String exchange;

        private String queue;

        private boolean isDurable = true;

        int connectTime = 1000;
        
        public String getHost() {
            return host;
        }

        public Builder setHost(String host) {
            this.host = host;
            return this;
        }

        public int getPort() {
            return port;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public int getMode() {
            return mode;
        }

        public Builder setMode(int mode) {
            this.mode = mode;
            return this;
        }

        public String getExchange() {
            return exchange;
        }

        public Builder setExchange(String exchange) {
            this.exchange = exchange;
            return this;
        }

        public String getQueue() {
            return queue;
        }

        public Builder setQueue(String queue) {
            this.queue = queue;
            return this;
        }

        public boolean isDurable() {
            return isDurable;
        }

        public Builder setDurable(boolean durable) {
            isDurable = durable;
            return this;
        }

        public int getConnectTime() {
            return connectTime;
        }

        public Builder setConnectTime(int connectTime) {
            this.connectTime = connectTime;
            return this;
        }

        //    builder提供 build()方法，实现目标对象的创建
        public RabbitMQClient build(){
            if (mode == 1) {// 工作队列模式不需设计交换机，但是队列名称一定要有
                if (exchange != null) {
                    throw new RuntimeException("工作队列模式不需设计交换机");
                }
                if (queue == null || queue.trim().equals("")) {
                    throw new RuntimeException("工作队列不能为空");
                }
                if (isDurable == false) {
                    throw new RuntimeException("工作队列模式必须开启持久化");
                }
            } else if (mode == 2) {// 路由模式必须设计交换机，但是不能设计队列
                if (exchange == null) {
                    throw new RuntimeException("路由模式必须设计交换机");
                }
                if (queue != null) {
                    throw new RuntimeException("路由模式无需设计队列名称");
                }
            }
            return new RabbitMQClient(this);
        }
    }

    public void sendMsg(String msg){
        System.out.println("发送消息："  + msg);
    }

}
