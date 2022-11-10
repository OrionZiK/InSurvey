package com.example.controller;

import com.example.entity.Permission;
import com.example.entity.User;
import com.example.service.PermissionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Permission)表控制层
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:31
 */
@RestController
@RequestMapping("permission")
public class PermissionController {
    /**
     * 服务对象
     */
    @Resource
    private PermissionService permissionService;
    /**
     *  单页查询全部信息
     * @return 全部查询数据
     */
    @GetMapping("/findall")
    public List<Permission> findAll() {

        return permissionService.findAll();
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Permission> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.permissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param permission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Permission> add(Permission permission) {
        return ResponseEntity.ok(this.permissionService.insert(permission));
    }

    /**
     * 编辑数据
     *
     * @param permission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Permission> edit(Permission permission) {
        return ResponseEntity.ok(this.permissionService.update(permission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById/{id}")
    public Boolean deleteById(@PathVariable("id") Integer id) {
        return this.permissionService.deleteById(id);
    }

}

