package com.wmj.blog.config;

/**
 * 列出数据源类型
 */
public enum DatabaseType {
    master("write"),slave("read");

    DatabaseType(String name) {
        this.name = name;
    }

    private String name;

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }


    @Override
    public String toString() {
        return "DatebaseType{"+
                "name='" + name + '\'' +
                '}';
    }
}
