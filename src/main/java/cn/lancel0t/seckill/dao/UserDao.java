package cn.lancel0t.seckill.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.lancel0t.seckill.domain.User;

@Mapper
public interface UserDao {

	@Select("select * from user where id=#{id}")
	public User getById(@Param("id") int id);
}
