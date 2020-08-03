package com.yjh.service;

import com.yjh.entity.UserFile;

import java.util.List;

/**
 * @Author mua
 * @Date 2020/8/3 12:02
 */
public interface UserFileService {

    List<UserFile> findByUserId(Integer id);

    void save(UserFile userFile);

    UserFile findById(Integer id);

    void update(UserFile userFile);

    void delete(Integer id);
}
