package com.test.persistence.mappers;

import com.test.persistence.beans.TTestUser;
import com.test.vo.UserVo;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TTestUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_user
     *
     * @mbggenerated
     */
    int insert(TTestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_user
     *
     * @mbggenerated
     */
    int insertSelective(TTestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_user
     *
     * @mbggenerated
     */
    TTestUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TTestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TTestUser record);

    /**
     * 根据条件查询
     * @param vo
     * @param rb
     * @return
     */
    List<TTestUser> queryByCondition(UserVo vo, RowBounds rb);

    /**
     * 根据条件查询页数
     * @param vo
     * @return
     */
    int queryInfoCount(UserVo vo);
}