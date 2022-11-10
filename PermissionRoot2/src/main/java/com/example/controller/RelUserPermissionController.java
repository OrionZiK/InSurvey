package com.example.controller;

import com.example.entity.RelUserPermission;
import com.example.service.RelUserPermissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RelUserPermission)表控制层
 *
 * @author OrionZinc
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
     *  查询该用户的所有权限
     * @Params id 用户主键
     * @return 全部查询数据
     */
    @GetMapping("/findall/{userId}")
    public List<Integer> findAllByUserId(@PathVariable("userId") Integer userId) {

        return relUserPermissionService.findAllByUserId(userId);
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
     * @param userId 用户主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById/{userId}")
    public Boolean deleteById(@PathVariable("userId") Integer userId) {
        return this.relUserPermissionService.deleteById(userId);
    }
}

