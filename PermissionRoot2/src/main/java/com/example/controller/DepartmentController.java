package com.example.controller;

import com.example.entity.Department;
import com.example.service.DepartmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Department)表控制层
 *
 * @author makejava
 * @since 2022-10-21 16:58:30
 */
@RestController
@RequestMapping("department")
public class DepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentService departmentService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Department> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.departmentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param department 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Department> add(Department department) {
        return ResponseEntity.ok(this.departmentService.insert(department));
    }

    /**
     * 编辑数据
     *
     * @param department 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Department> edit(Department department) {
        return ResponseEntity.ok(this.departmentService.update(department));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.departmentService.deleteById(id));
    }

}

