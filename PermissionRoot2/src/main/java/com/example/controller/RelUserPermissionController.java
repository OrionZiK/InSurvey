package com.example.controller;

import com.example.entity.RelUserPermission;
import com.example.service.RelUserPermissionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (RelUserPermission)表控制层
 *
 * @author makejava
 * @since 2022-10-21 16:58:32
 */
@RestController
@RequestMapping("relUserPermission")
public class RelUserPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private RelUserPermissionService relUserPermissionService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<RelUserPermission> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.relUserPermissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param relUserPermission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<RelUserPermission> add(RelUserPermission relUserPermission) {
        return ResponseEntity.ok(this.relUserPermissionService.insert(relUserPermission));
    }

    /**
     * 编辑数据
     *
     * @param relUserPermission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<RelUserPermission> edit(RelUserPermission relUserPermission) {
        return ResponseEntity.ok(this.relUserPermissionService.update(relUserPermission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.relUserPermissionService.deleteById(id));
    }

}

