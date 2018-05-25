package com.dm.dmspringbootmybatis.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.dm.dmspringbootmybatis.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentService {

    public void add(Student student);
    public Student query(Integer id);

    public List<Student> selectList();

    public Page<Student> pageall(Integer index,Integer size);

    public List<Student> findById(Integer id);

}
