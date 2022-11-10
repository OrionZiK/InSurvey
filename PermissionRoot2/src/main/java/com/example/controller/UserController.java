package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:33
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;


    /**
     *  单页查询全部信息
     * @param void
     * @return 全部查询数据
     */
    @GetMapping("/findall")
    public List<User> findAll() {

        return userService.findAll();
    }

    /**
     * 分页查询
     *
     * @param user        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping("/page")
    public ResponseEntity<Page<User>> queryByPage(User user, PageRequest pageRequest) {
        return ResponseEntity.ok(this.userService.queryByPage(user, pageRequest));
    }

    /**
     * 模糊查询
     *
     * @Param name 用户名
     * @Return  查询结果
     */
    @GetMapping("/queryLikelyByName/{name}")
    public List<User> queryLikelyByName(@PathVariable String name){
        return userService.queryLikelyByName(name);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public ResponseEntity<User> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.userService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping("/insert")
    public User add(@RequestBody User user) {
        return this.userService.insert(user);
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<User> edit(User user) {
        return ResponseEntity.ok(this.userService.update(user));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable("id") Integer id) {
        return this.userService.deleteById(id);
    }

}

