package com.example.controller;

import com.example.entity.RelUserRole;
import com.example.service.RelUserRoleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (RelUserRole)表控制层
 *
 * @author makejava
 * @since 2022-10-21 16:58:32
 */
@RestController
@RequestMapping("relUserRole")
public class RelUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private RelUserRoleService relUserRoleService;

    /**
     * 分页查询
     *
     * @param relUserRole 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<RelUserRole>> queryByPage(RelUserRole relUserRole, PageRequest pageRequest) {
        return ResponseEntity.ok(this.relUserRoleService.queryByPage(relUserRole, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<RelUserRole> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.relUserRoleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param relUserRole 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<RelUserRole> add(RelUserRole relUserRole) {
        return ResponseEntity.ok(this.relUserRoleService.insert(relUserRole));
    }

    /**
     * 编辑数据
     *
     * @param relUserRole 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<RelUserRole> edit(RelUserRole relUserRole) {
        return ResponseEntity.ok(this.relUserRoleService.update(relUserRole));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.relUserRoleService.deleteById(id));
    }

}

