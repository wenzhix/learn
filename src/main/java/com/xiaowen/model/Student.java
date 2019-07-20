package com.xiaowen.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
   * 学生实体类
 * @author xiaowen
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	 private Integer sid;
	 private String sno;
	 private String name;
	 private String sex;

}
