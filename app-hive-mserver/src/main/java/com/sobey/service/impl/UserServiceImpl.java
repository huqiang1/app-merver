package com.sobey.service.impl;

import com.sobey.entity.User;
import com.sobey.mapper.IUserMapper;
import com.sobey.service.IUserService;
import com.sobey.utils.ReadisUtils;
import com.sobey.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private ReadisUtils readis;

    @Autowired
    private IUserMapper userMapper;

    @Override
    public Object userAddAndUpdate(User user) {

        user.setUuid(UUID.randomUUID().toString().replace("-",""));
        userMapper.add(user);
        readis.set(user.getPhone(),user);

        return ResultData.success(user.getUuid());
    }

    @Override
    public Object userSelect(User user) {
        user = (User) readis.get(user.getPhone());
        if(StringUtils.isEmpty(user.getUuid())){
            user = userMapper.select(user);

        }
        return ResultData.success(user);
    }
}
