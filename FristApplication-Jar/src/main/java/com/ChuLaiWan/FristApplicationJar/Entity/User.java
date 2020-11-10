package com.ChuLaiWan.FristApplicationJar.Entity;
/*
* 原项目教程这个不是定义一个entity类,而是定义一个POJO
* 关于POJO:
* POJO（Plain Ordinary Java Object）简单无规则 Java 对象
* 纯的传统意义上的 Java 对象，就是说在一些表关系映射工具中，能够做到维护数据库表记录的持久化对象完全是一个符合 Java Bean 规范的纯 Java 对象，
* 没有增加别的属性和方法。也可以理解成最基本的 Java Bean，只有属性字段及 setter 和 getter 方法。

作者：sp_少平
链接：https://www.jianshu.com/p/c163e02c3d93
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
* */
public class User {
    int id;
    String username;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
