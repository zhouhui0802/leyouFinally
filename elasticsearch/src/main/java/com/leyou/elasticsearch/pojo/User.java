package com.leyou.elasticsearch.pojo;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 18:08
 */
@Data
@Document(indexName = "user") // 索引名
public class User {

    @Id
    private Long id;

    @Field(type = FieldType.Keyword)
    private String name;

    @Field(type = FieldType.Integer)
    private Integer age;

    @Field(type = FieldType.Text)
    private String desc;

}
