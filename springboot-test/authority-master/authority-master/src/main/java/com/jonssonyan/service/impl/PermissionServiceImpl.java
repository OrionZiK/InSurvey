package com.jonssonyan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jonssonyan.dao.PermissionDao;
import com.jonssonyan.entity.Permission;
import com.jonssonyan.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PermissionServiceImpl extends ServiceImpl<PermissionDao, Permission> implements PermissionService {
}
