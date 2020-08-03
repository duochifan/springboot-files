package com.yjh.dao;

import com.yjh.entity.UserFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author mua
 * @Date 2020/8/3 11:52
 */
@Mapper
public interface UserFilesDao {

    /**
     * 根据用户id获取当前用户的文件列表
     */
    List<UserFile> findByUserId(Integer id);

    /**
     *保存用户的文件记录
     */
    void save(UserFile userFile);

    /**
     * 根据文件id获取文件信息
     */
    UserFile findById(Integer id);

    /**
     * 根据id更新下载次数
     */
    void update(UserFile userFile);

    /**
     * 根据id删除记录
     */
    void delete(Integer id);
}
