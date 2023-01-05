package com.jonssonyan.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class CategoryVo extends BaseVo implements Serializable {
    private static final long serialVersionUID = 4432159672935772196L;
    private Long id;
    private Long parentId;
    private String path;
    private Integer level;
    private String name;
    private Long creator;
    private Integer state;
    private Date createTime;
    private Date updateTime;
}