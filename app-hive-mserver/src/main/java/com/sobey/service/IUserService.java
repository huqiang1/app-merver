package com.sobey.service;

import com.sobey.entity.User;

public interface IUserService {
    Object userAddAndUpdate(User user);

    Object userSelect(User user);
}
