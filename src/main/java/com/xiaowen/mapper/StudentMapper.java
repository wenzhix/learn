package com.xiaowen.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xiaowen.model.Student;

public interface StudentMapper {

	/**
	    * 添加学生信息
	 * @param student
	 * @return
	 */
	@Insert("insert into t_student(sno,name,sex) values(#{sno},#{name},#{sex})")
	void addStudent(Student student);

	/**
	 * 修改学生信息
	 * @param student
	 * @return
	 */
    @Update("update t_student set name=#{name},sex=#{sex} where sno=#{sno}")
    void updateStudent(Student student);

    /**
               * 根据学生编号删除
     * @param sno
     * @return
     */
    @Delete("delete from t_student where sno=#{sno}")
    void deleteById(String sno);

    /**
                 * 根据学生编号查询
     * @param sno
     * @return
     */
    @Select("select * from t_student where sno=#{sno}")
    @Results(id = "student",value= {
            @Result(property = "sno", column = "sno", javaType = String.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "sex", column = "sex", javaType = String.class)
    })
    Student findById(String sno);
    
    /**
                * 查询所有学生信息
     * @return
     */
    @Select("select * from t_student")
    List<Student> findAll();
}
