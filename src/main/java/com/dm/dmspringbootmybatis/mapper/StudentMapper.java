package com.dm.dmspringbootmybatis.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.dm.dmspringbootmybatis.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectList();

    Page<Student> pageall(Integer pageindex,Integer size);

    List<Student> findById(Integer id);
}