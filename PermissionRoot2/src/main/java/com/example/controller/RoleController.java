package com.example.controller;

import com.example.entity.Role;
import com.example.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Role)表控制层
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:33
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;


    /**
     *  单页查询全部信息
     * @return 全部查询数据
     */
    @GetMapping("/findall")
    public List<Role> findAll() {

        return roleService.findAll();
    }

    /**
     * 新增数据
     *
     * @param role 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Role> add(Role role) {
        return ResponseEntity.ok(this.roleService.insert(role));
    }

    /**
     * 编辑数据
     *
     * @param role 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Role> edit(Role role) {
        return ResponseEntity.ok(this.roleService.update(role));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById/{id}")
    public Boolean deleteById(@PathVariable("id") Integer id) {
        System.out.println("id="+id);
        return this.roleService.deleteById(id);
    }

}

