package com.fzu.mapper;

import com.fzu.bean.course;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface courseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    int insert(course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    int insertSelective(course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    course selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(course record);
}