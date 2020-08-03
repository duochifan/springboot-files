package com.yjh.service.impl;

import com.yjh.dao.UserFilesDao;
import com.yjh.entity.UserFile;
import com.yjh.service.UserFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author mua
 * @Date 2020/8/3 12:02
 */
@Service
public class UserFileServiceImpl implements UserFileService {

    @Autowired
    private UserFilesDao userFilesDao;


    @Override
    public List<UserFile> findByUserId(Integer id) {
        return userFilesDao.findByUserId(id);
    }

    @Override
    public void save(UserFile userFile) {
        //判断是否为图片：类型为image时一定为图片
        String isImg = userFile.getType().startsWith("image")?"是":"否";
        userFile.setIsImg(isImg);
        userFile.setDownCounts(0);
        userFile.setUploadTime(new Date());
        userFilesDao.save(userFile);
    }

    @Override
    public UserFile findById(Integer id) {
        return userFilesDao.findById(id);
    }

    @Override
    public void update(UserFile userFile) {
        userFilesDao.update(userFile);
    }

    @Override
    public void delete(Integer id) {
        userFilesDao.delete(id);
    }
}
