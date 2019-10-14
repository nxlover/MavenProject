package com.zut.pojo;

import java.util.List;

public class Meeting {
    String topic;
    List<Boss> bossList;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<Boss> getBossList() {
        return bossList;
    }

    public void setBossList(List<Boss> bossList) {
        this.bossList = bossList;
    }

    public Meeting(String topic, List<Boss> bossList) {
        this.topic = topic;
        this.bossList = bossList;
    }

    public Meeting() {
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "topic='" + topic + '\'' +
                ", bossList=" + bossList +
                '}';
    }
}
