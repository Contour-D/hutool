package cn.hutool.db.nosql;

import cn.hutool.db.nosql.mongo.MongoFactory4;
import com.mongodb.client.MongoDatabase;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author VampireAchao
 */
public class MongoDBTest {

	@Test
	@Ignore
	public void redisDSTest() {
		MongoDatabase db = MongoFactory4.getDS("master").getDb("test");
		Assert.assertEquals("test", db.getName());
	}
}