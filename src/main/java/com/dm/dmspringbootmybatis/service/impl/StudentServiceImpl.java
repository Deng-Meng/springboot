/*
*
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: StudentServiceImpl
 * Author:   DM-admin
 * Date:     2018/5/25 15:02
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
*/


package com.dm.dmspringbootmybatis.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.dm.dmspringbootmybatis.mapper.StudentMapper;
import com.dm.dmspringbootmybatis.model.Student;
import com.dm.dmspringbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author DM-admin
 * @create 2018/5/25
 * @since 1.0.0
 */

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public void add(Student student) {
        studentMapper.insertSelective(student);
    }

    @Override
    public Student query(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Student> selectList() {
        return studentMapper.selectList();
    }

    @Override
    public Page<Student> pageall(Integer index, Integer size) {
        return studentMapper.pageall(index, size);
    }

    @Override
    public List<Student> findById(Integer id) {
        return studentMapper.findById(id);
    }
}
