package com.neverlang.letcode.exercise.bytedance;

public class Dto implements Comparable<Dto>{
    Integer temp ;


    @Override
    public int compareTo(Dto o) {
        return -this.temp.compareTo(o.getTemp());

    }

    public Dto(Integer temp) {
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "temp=" + temp +
                '}';
    }
}
