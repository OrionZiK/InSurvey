package com.example.controller;

import com.example.entity.RelUserRole;
import com.example.entity.User;
import com.example.service.RelUserRoleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RelUserRole)表控制层
 *
 * @author OrionZinc
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
     *  通过用户主键查询
     * @return 全部查询数据
     */
    @GetMapping("/findall/{userId}")
    public List<Integer> findAllByUserId(@PathVariable("userId") Integer userId) {

        return relUserRoleService.findAllByUserId(userId);
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
     * @param userId 用户主键 roleId 角色主键
     * @return 新增结果
     */
    @PostMapping("insertByRoleId/{roleId}")
    public Boolean add(Integer userId, Integer roleId) {
        return this.relUserRoleService.insertByRoleId(userId ,roleId);
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
     * @param userId 用户主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById/{userId}")
    public Boolean deleteById(@PathVariable("userId") Integer userId) {
        System.out.println("userid = "+userId);
        return this.relUserRoleService.deleteById(userId);
    }

}

