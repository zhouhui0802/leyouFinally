package com.leyou.consumerdemo.pojo;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;



/**
 * @Author: TianCi.Xiong
 * @Description:
 * @Date: Created in 2019-10-31 8:10
 */
@Table(name = "tb_user")
@Data
public class User {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    private Date birthday;

    // 创建时间
    private Date created;

    // 更新时间
    private Date updated;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

    public String getNote() {
        return note;
    }

    // 备注
    private String note;




}
