/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: StudentContorller
 * Author:   DM-admin
 * Date:     2018/5/25 14:56
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述*/


package com.dm.dmspringbootmybatis.contorller;

import com.baomidou.mybatisplus.plugins.Page;
import com.dm.dmspringbootmybatis.model.Student;
import com.dm.dmspringbootmybatis.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author DM-admin
 * @create 2018/5/25
 * @since 1.0.0*/


@RestController
@RequestMapping("/student")
public class StudentContorller
{

    @Resource
    private StudentService studentService;

    @RequestMapping("/add")
    public void add(Student student){
        studentService.add(student);

    }

    @RequestMapping("/query")
    public Student query(Integer id){
        return studentService.query(id);
    }


    @RequestMapping("/queryall")
    public List<Student> queryall(){
        return studentService.selectList();
    }

    @RequestMapping("/pageall")
    public Page<Student> pageall(Integer index, Integer size){
        return studentService.pageall(index, size);
    }
    @RequestMapping("/findById")
    public List<Student> findById(Integer id) {
        return studentService.findById(id);
    }
}
