package com.sobey;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataCollectApplicationTests {


	@Value(value="classpath:/SQL.json")
	private Resource res;


	@Test
	public void contextLoads() throws Exception {
//		System.out.println(ResourceUtils.getFile(new StringBuffer().
//				append(ResourceUtils.CLASSPATH_URL_PREFIX).
//				append("mdb/").
//				append("History.mdb").toString()).getAbsolutePath());
//		System.out.println(JSONObject.toJSON(baseMapper.selectOne("select * from Smm_Userinfo where LOGINNAME = 'zj'")));
	}

}
